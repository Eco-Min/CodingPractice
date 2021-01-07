package com.rxJava.Day3;

import io.reactivex.Observable;

public class Day3_1 {
    public static void main(String[] args) {
//        Observable<Integer> observable = Observable.range(0, 10);
//        observable.subscribe(System.out::println);

        int start = 5, count = 2;
        Observable<Integer> observable = Observable.range(start, count);
        observable.subscribe(System.out::println);
    }
}
