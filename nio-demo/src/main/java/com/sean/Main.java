package com.sean;

import org.apache.commons.lang3.time.DateUtils;
import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;
import java.util.Arrays;
import java.util.Date;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

/**
 * @author sean
 */
@SpringBootApplication
@EnableDubbo
public class Main {
    private final static Selector selector;
    private final static MyRun myRun = new MyRun();

    public static void main(String[] args) {
        Date now = new Date();
        Date date2 = DateUtils.addDays(now, -1);
        System.out.println(now);
        System.out.println(date2);
        System.out.println(now.after(date2));
        System.out.println(date2.after(now));
    }

    static {
        try {
            selector = Selector.open();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

//        new Thread(myRun).start();
    }

    public static void main1(String[] args) throws Exception {

//        SpringApplication.run(Main.class,args);
        System.out.println(args.length);
        System.out.println(Arrays.asList(args));

        System.out.println("name: "+System.getenv("name"));
        System.out.println("age: "+System.getProperty("age"));


        ThreadLocal<Integer> threadLocal = new ThreadLocal<Integer>(){
            @Override
            protected Integer initialValue() {
                return 10;
            }
        };
        ThreadLocal<Integer> threadLocal2 = new ThreadLocal<>();

        new ArrayBlockingQueue(1);
        new LinkedBlockingQueue<>(1);

//        threadLocal.set(1);
//        threadLocal2.set(2);
        System.out.println(threadLocal.get());
        System.out.println(threadLocal2.get());
        threadLocal.remove();


//        Lock lock = new ReentrantLock();
//        lock.lock();
//        lock.unlock();
//        LockSupport.park();
//
//        LockSupport.unpark();

//        starServer();
    }

    /**
     * 启动服务端
     */
    private static void starServer() throws Exception {
        ServerSocketChannel serverSocketChannel = ServerSocketChannel.open();
        serverSocketChannel.bind(new InetSocketAddress(8888));
        serverSocketChannel.configureBlocking(false);
        serverSocketChannel.register(selector, SelectionKey.OP_ACCEPT);

        while (true) {
            if (selector.select() > 0) {
                Set<SelectionKey> selectionKeys = selector.selectedKeys();
                Iterator<SelectionKey> iterator = selectionKeys.iterator();
                while (iterator.hasNext()) {
                    SelectionKey key = iterator.next();
                    iterator.remove();
                    if (key.isAcceptable()) {
                        SocketChannel channel = ((ServerSocketChannel) key.channel()).accept();
                        channel.configureBlocking(false);
                        ByteBuffer byteBuffer = ByteBuffer.allocateDirect(10240);
                        channel.register(selector, SelectionKey.OP_READ, byteBuffer);
                    } else if (key.isReadable()) {
                        ByteBuffer byteBuffer = (ByteBuffer) key.attachment();
                        SocketChannel client = (SocketChannel) key.channel();
                        byteBuffer.clear();
                        int read = client.read(byteBuffer);
                        if (read > 0) {
                            byteBuffer.flip();
                            if (byteBuffer.hasRemaining()) {
                                byte[] bytes = new byte[byteBuffer.limit()];
                                byteBuffer.get(bytes);
                                System.out.println(new String(bytes));
//                                client.write(byteBuffer);
                            }
                            byteBuffer.clear();
                        } else if (read == -1) {
                            client.close();
                        }
                    }
                }
            }
        }
    }

    static class MyRun implements Runnable {
        private final LinkedBlockingQueue<SelectionKey> queue;

        public MyRun() {
            queue = new LinkedBlockingQueue<>();
        }

        public void add(SelectionKey key) {
            try {
                queue.put(key);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

        @Override
        public void run() {
            while (true) {
                try {
                    SelectionKey key = queue.take();
                    ByteBuffer byteBuffer = (ByteBuffer) key.attachment();
                    SocketChannel client = (SocketChannel) key.channel();
                    byteBuffer.clear();
                    int read = client.read(byteBuffer);
                    if (read > 0) {
                        byteBuffer.flip();
                        if (byteBuffer.hasRemaining()) {
                            client.write(byteBuffer);
                        }
                        byteBuffer.clear();
                    } else if (read == 0) {
                        break;
                    } else {
                        client.close();
                    }
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
