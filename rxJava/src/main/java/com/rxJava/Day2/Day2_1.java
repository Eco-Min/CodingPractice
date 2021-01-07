package com.rxJava.Day2;

import io.reactivex.Observable;

import java.util.Arrays;
import java.util.List;

public class Day2_1 {
    public static void main(String[] args) {
        createObservableWithJust();
        createObservableFromIterable();
        createObservableUsingCreate();
    }

    private static void createObservableUsingCreate() {
        Observable<Integer> observable = Observable.create(emitter -> {
            emitter.onNext(1);
            emitter.onNext(2);
            emitter.onNext(3);
            emitter.onNext(4);
            emitter.onNext(5);
            emitter.onNext(null);
            emitter.onComplete();
            emitter.onNext(10);
        });

        observable.subscribe(item -> System.out.println(item),
                error -> System.out.println("there was error : " + error.getLocalizedMessage()),
                () -> System.out.println("Completed"));
    }

    private static void createObservableFromIterable() {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
        Observable<Integer> observable = Observable.fromIterable(list);

        observable.subscribe(item -> System.out.println(item));
    }

    private static void createObservableWithJust() {
        Observable<Integer> observable = Observable.just(1, 2, 3, 4, 5);

        observable.subscribe(item -> System.out.println(item));
    }
}
