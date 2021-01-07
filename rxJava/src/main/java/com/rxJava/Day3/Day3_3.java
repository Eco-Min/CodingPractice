package com.rxJava.Day3;

import io.reactivex.Observable;

public class Day3_3 {
    public static void main(String[] args) {
//        Observable<Integer> observable = Observable.just(getNumber());
        Observable<Integer> observable = Observable.fromCallable(() -> {
            System.out.println("calling Method");
            return getNumber();
        });
        observable.subscribe(System.out::println,
                error -> System.out.println("An Exception " + error.getLocalizedMessage()));
    }

    private static int getNumber() {
        System.out.println("generating Value");
//        return 3 * 5;
        return 1 / 0;
    }
}
