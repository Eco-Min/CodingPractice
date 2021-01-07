package com.rxJava.Day3;

import io.reactivex.Observable;

public class Day3_2 {
    private static int start = 5, count = 2;

    public static void main(String[] args) {
//        Observable<Integer> observable = Observable.defer(() -> Observable.range(start, count));
        Observable<Integer> observable = Observable.defer(() -> {
            System.out.println("New Observable is create with start  = " + start + " and Count = " + count);
            return Observable.range(start, count);
        });
        observable.subscribe(item -> System.out.println("Observer 1: " + item));
        count = 3;
        observable.subscribe(item -> System.out.println("Observer 2: " + item));
    }
}
