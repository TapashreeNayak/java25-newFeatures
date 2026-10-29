package com.javatechie;

public class ThreadLocalDemo {
    public static void main(String[] args) {

        ThreadLocal<String> currentUser = new ThreadLocal<>();
        currentUser.set("Alice");

        new Thread(() -> {
            currentUser.set("Alice");
            System.out.println("User 1: " + currentUser.get());
        }).start();

        new Thread(() -> {
            currentUser.set("Alice");
            System.out.println("User 2: " + currentUser.get());
        }).start();

    }

}
