package com.rxJava.Day6;

import io.reactivex.Observable;

import java.util.concurrent.TimeUnit;

public class Rx6_3_DelaySameAsInterval {
    public static void main(String[] args) throws InterruptedException {
//        delay();
        delayError();
    }

    private static void delay() throws InterruptedException {
        Observable.just(1, 2, 3, 4, 5)
                .delay(3000, TimeUnit.MILLISECONDS)
                .subscribe(System.out::println);
        pause(5000);
    }

    private static void delayError() throws InterruptedException {
        Observable.error(new Exception("error"))
                .delay(3, TimeUnit.SECONDS, true)
                .subscribe(System.out::println,
                        error -> System.out.println(error.getLocalizedMessage()),
                        () -> System.out.println("completed"));
        pause(5000);
    }

    private static void pause(int duration) throws InterruptedException {
        Thread.sleep(duration);
    }
}
