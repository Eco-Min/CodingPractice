package com.rxJava.Day5;

import io.reactivex.Observable;

public class Rx_5_distinctDistinctUntilChanged {
    public static void main(String[] args) {
//        distinctOperator();
//        distinctWithKeySelector();
//        distinctUntilChangedOperator();
        distinctUntilChangeWithKeySelector();
    }

    private static void distinctOperator() {
        Observable.just(1, 1, 2, 2, 3, 3, 4, 5, 1, 2)
                .distinct()
                .subscribe(System.out::println);
    }

    private static void distinctWithKeySelector() {
        Observable.just("foo", "fool", "super", "foss", "foil")
                .distinct(String::length)
                .subscribe(System.out::println);
    }

    private static void distinctUntilChangedOperator() {
        Observable.just(1, 1, 2, 2, 3, 3, 4, 5, 1, 2)
                .distinctUntilChanged()
                .subscribe(System.out::println);
    }

    private static void distinctUntilChangeWithKeySelector() {
        Observable.just("foo", "fool", "super", "foss", "foil")
                .distinctUntilChanged(String::length)
                .subscribe(System.out::println);
    }
}
