package com.rxJava.Day4;

import io.reactivex.Observable;
import io.reactivex.internal.operators.observable.ObservableJust;

public class Rx4_4_MapFilter {
    public static void main(String[] args) {
//        mapOperator();
//        mapOperatorReturnDifferentData();
//        filterOperator();
        combineMapAndFilter();
    }

    private static void mapOperator() {
        Observable<Integer> observable = Observable.just(1, 2, 3, 4, 5);
        observable.
                map(item -> item + 2).
                subscribe(System.out::println);
    }

    private static void mapOperatorReturnDifferentData() {
        Observable<Integer> observable = Observable.just(1, 2, 3, 4, 5);
        observable.
                map(item -> "helloWorld").
                subscribe(System.out::println);
    }

    private static void filterOperator() {
        Observable<Integer> observable = Observable.just(1, 2, 3, 4, 5);
        observable.
                filter(item -> item % 2 == 0).
                subscribe(System.out::println);
    }

    private static void combineMapAndFilter() {
        Observable<Integer> observable = Observable.just(1, 2, 3, 4, 5);
        observable.
                filter(item -> item % 2 == 0)
                .map(item -> item * 2)
                .subscribe(System.out::println);
    }

}
