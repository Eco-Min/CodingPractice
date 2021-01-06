package com.rxJava;

public class Main {
    public static void main(String[] args) {
        Thread thread = new Thread(Main::runIt);

    }

    public static void runIt() {
        System.out.println("hello World");
    }
}
