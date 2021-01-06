package com.rxJava.Day2;

import io.reactivex.Observable;

public class Day2_4 {
    public static void main(String[] args) {
//        throwException();
        throwExceptionUsingCallable();
    }

    private static void throwException() {
        Observable observable = Observable.error((new Exception("An Exception")));
        observable.subscribe(System.out::println, error -> System.out.println("error 1: " + error.hashCode()));
        observable.subscribe(System.out::println, error -> System.out.println("error 2: " + error.hashCode()));
    }

    private static void throwExceptionUsingCallable() {
        Observable observable = Observable.error(() -> {
            System.out.println("New Exception Created");
            return new Exception("An Exception");
        });
        observable.subscribe(System.out::println, error -> System.out.println("error 1: " + error.hashCode()));
        observable.subscribe(System.out::println, error -> System.out.println("error 2: " + error.hashCode()));
    }

}
