package com.rxJava.Day2;

import io.reactivex.Observable;

public class Day2_5 {
    public static void main(String[] args) {
//        createObservableUsingEmpty();
        createObservableUsingNever();
    }

    private static void createObservableUsingEmpty() {
        Observable observable = Observable.empty();
        observable.subscribe(System.out::println, System.out::println
                , () -> System.out.println("completed"));
    }

    private static void createObservableUsingNever() {
        Observable observable = Observable.never();
        observable.subscribe(System.out::println, System.out::println
                , () -> System.out.println("completed"));
        pause(3000);
    }

    private static void pause(int duration) {
        try {
            Thread.sleep(duration);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
