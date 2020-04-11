package com.kingdom;

import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public class Hello {
    public static void main(String[] args) throws Exception {
       new Thread(() -> {
           System.out.println(Thread.currentThread().getName());
           System.out.println(5);
       }).start();
    }

    void foo() {
        System.out.println(10);
    }
}


