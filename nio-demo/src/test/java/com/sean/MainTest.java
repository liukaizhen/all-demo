package com.sean;

import io.netty.bootstrap.ServerBootstrap;
import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandlerAdapter;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.nio.NioServerSocketChannel;
import io.netty.channel.socket.nio.NioSocketChannel;
import org.junit.Test;

/**
 * @author sean
 */
public class MainTest {

    @Test
    public void testMod(){
        System.out.println(132%16);
        System.out.println(132&15);// 10000  1111 & 10001
    }

//    @Test
    public void testServer()throws Exception{
        ServerBootstrap serverBootstrap  = new ServerBootstrap();
        NioEventLoopGroup loopGroup = new NioEventLoopGroup(1);
        ChannelFuture bind = serverBootstrap.group(loopGroup)
                .channel(NioServerSocketChannel.class)
                .childHandler(new ChannelInitializer<NioSocketChannel>() {
                    @Override
                    protected void initChannel(NioSocketChannel ch) throws Exception {
                        ch.pipeline().addLast(new ChannelInboundHandlerAdapter(){
                            @Override
                            public void channelRead(ChannelHandlerContext ctx, Object msg) throws Exception {
                                System.out.println("channelRead "+msg);
                                ctx.writeAndFlush(msg);
                                super.channelRead(ctx, msg);
                            }

                            @Override
                            public void userEventTriggered(ChannelHandlerContext ctx, Object evt) throws Exception {
                                System.out.println("userEventTriggered");
                                super.userEventTriggered(ctx, evt);
                            }

                            @Override
                            public void channelReadComplete(ChannelHandlerContext ctx) throws Exception {
                                System.out.println("channelReadComplete");
                                super.channelReadComplete(ctx);
                            }

                            @Override
                            public void channelRegistered(ChannelHandlerContext ctx) throws Exception {
                                System.out.println("channelRegistered");
                                super.channelRegistered(ctx);
                            }

                            @Override
                            public void channelActive(ChannelHandlerContext ctx) throws Exception {
                                System.out.println("channelActive");
                                super.channelActive(ctx);
                            }

                            @Override
                            public void channelInactive(ChannelHandlerContext ctx) throws Exception {
                                System.out.println("channelInactive");
                                super.channelInactive(ctx);
                            }

                            @Override
                            public void channelUnregistered(ChannelHandlerContext ctx) throws Exception {
                                System.out.println("channelUnregistered");
                                super.channelUnregistered(ctx);
                            }
                        });
                        ch.pipeline().addLast(new ChannelInboundHandlerAdapter(){
                            @Override
                            public void channelRead(ChannelHandlerContext ctx, Object msg) throws Exception {
                                System.out.println("2----- "+msg);
                            }
                        });
                    }
                }).bind(8888);
        bind.sync().channel().closeFuture().sync();
    }
}
