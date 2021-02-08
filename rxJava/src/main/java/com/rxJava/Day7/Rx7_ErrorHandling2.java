package com.rxJava.Day7;

import io.reactivex.Observable;

import java.io.IOException;
import java.util.concurrent.atomic.AtomicInteger;

public class Rx7_ErrorHandling2 {
    public static void main(String[] args) {
//        retryWithPredicate();
//        exRetry();
        exRetryUntil();
    }

    private static void retryWithPredicate() {
        Observable.error(new IOException("this is an example error"))
                .retry(error -> {
                    if (error instanceof IOException) {
                        System.out.println("retrying");
                        return true;
                    } else return false;
                })
                .subscribe(
                        System.out::println,
                        error -> System.out.println("Subscribed Error : " + error.getMessage()),
                        () -> System.out.println("completed")
                );
    }

    private static void exRetry() {
        Observable.error(new IOException("this is an example error"))
                .retry(3)
                .subscribe(
                        System.out::println,
                        error -> System.out.println("Subscribed Error : " + error.getMessage()),
                        () -> System.out.println("completed")
                );
    }

    private static void exRetryUntil() {
        AtomicInteger atomicInteger = new AtomicInteger();
        Observable.error(new IOException("this is an example error"))
                .doOnError(error -> {
                    System.out.println(atomicInteger.get());
                    atomicInteger.getAndIncrement();
                })
                .retryUntil(() -> {
                    System.out.println("Retrying");
                    return atomicInteger.get() >= 3;
                })
                .subscribe(
                        System.out::println,
                        error -> System.out.println("Subscribed Error : " + error.getMessage()),
                        () -> System.out.println("completed")
                );
    }
}
