package com.rxJava.Day7;

import io.reactivex.Observable;

import java.io.IOException;

public class Rx7_ErrorHandling1 {
    public static void main(String[] args) {
        exDoOnError();
//        exOnErrorResumeNext();
//        exOnErrorReturn();
//        exOnErrorReturnItem();
    }

    private static void exDoOnError() {
        Observable.error(new Exception("this is an example error"))
                .doOnError(error -> System.out.println("Error : " + error.getMessage()))
                .subscribe(
                        System.out::println,
                        error -> System.out.println("Subscribed Error : " + error.getMessage()),
                        () -> System.out.println("Completed")
                );
    }

    private static void exOnErrorResumeNext() {
        Observable.error(new Exception("this is an example error"))
                .onErrorResumeNext(Observable.just(1,2,3,4,5))
                .subscribe(
                        System.out::println,
                        error -> System.out.println("Subscribed Error : " + error.getMessage()),
                        () -> System.out.println("Completed")
                );
    }

    private static void exOnErrorReturn() {
        Observable.error(new Exception("this is an example error"))
                .onErrorReturn(error -> {
                    if(error instanceof IOException) return 0;
//                    else return 1;
                    else throw new Exception("this is an exception");
                })
                .subscribe(
                        System.out::println,
                        error -> System.out.println("Subscribed Error : " + error.getMessage()),
                        () -> System.out.println("Completed")
                );
    }

    private static void exOnErrorReturnItem() {
        Observable.error(new Exception("this is an example error"))
                .onErrorReturnItem(new Exception("hello"))
                .subscribe(
                        System.out::println,
                        error -> System.out.println("Subscribed Error : " + error.getMessage()),
                        () -> System.out.println("Completed")
                );
    }
}
