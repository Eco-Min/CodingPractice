package com.rxJava.Day5;

import io.reactivex.Observable;

import java.util.concurrent.TimeUnit;

public class Rx5_1TakeSkipWhile {
    public static void main(String[] args) throws InterruptedException {
//        takeOperator();
//        takeWithInterval();
//        takeWhileOperator();
//        skipOperator();
        skipWhileOperator();
    }

    private static void takeOperator() {
        Observable.just(1, 2, 3, 4, 5)
                .take(2)
                .subscribe(System.out::println);
    }

    private static void takeWithInterval() throws InterruptedException {
        Observable.interval(300, TimeUnit.MILLISECONDS)
                .take(2, TimeUnit.SECONDS)
//                .take(1)
                .subscribe(System.out::println, System.out::println, () -> System.out.println("Completed"));

        pause(5000);
    }

    private static void takeWhileOperator() {
        Observable.just(1, 2, 3, 4, 5, 1, 2, 3, 4, 5)
//                .takeWhile(item -> item <= 3)
                .filter(item -> item <= 3)
                .subscribe(System.out::println);
    }

    private static void skipOperator() {
        Observable.just(1, 2, 3, 4, 5)
                .skip(2)
                .subscribe(System.out::println);
    }

    private static void skipWhileOperator() {
        Observable.just(1, 2, 3, 4, 5, 1, 2, 3, 4, 5)
                .skipWhile(item -> item <= 3)
                .subscribe(System.out::println);
    }

    private static void pause(int duration) throws InterruptedException {
        Thread.sleep(duration);
    }
}
