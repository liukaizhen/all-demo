package com.sean.springboot.bean;

public class TokenContextHolder {

    private final static ThreadLocal<String> threadLocal = new ThreadLocal<>();

    public static String getToken() {
        return threadLocal.get() == null ? null : threadLocal.get();
    }

    public static void setToken(String token) {
        threadLocal.set(token);
    }

    public static void removeToken() {
        threadLocal.remove();
    }
}
