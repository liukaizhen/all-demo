package com.sean;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author sean
 */
public class Main {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(1);
        executorService.execute(new Runnable() {
            @Override
            public void run() {

            }
        });
    }
}
