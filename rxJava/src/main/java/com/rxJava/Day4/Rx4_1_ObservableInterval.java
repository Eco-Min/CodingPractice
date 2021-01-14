package com.rxJava.Day4;

import io.reactivex.Observable;

import java.util.concurrent.TimeUnit;

public class Rx4_1_ObservableInterval {
    public static void main(String[] args) throws InterruptedException {
        Observable<Long> observable = Observable.interval(1, TimeUnit.SECONDS);
        observable.subscribe(item -> System.out.println("Observer 1 : " + item));
        pause(5000);
        observable.subscribe(item -> System.out.println("Observer 2 : " + item));
        pause(3000);
    }

    private static void pause(int duration) throws InterruptedException {
        Thread.sleep(duration);
    }
}
