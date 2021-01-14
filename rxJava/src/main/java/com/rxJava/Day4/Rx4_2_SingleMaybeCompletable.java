package com.rxJava.Day4;

import io.reactivex.Completable;
import io.reactivex.Maybe;
import io.reactivex.MaybeObserver;
import io.reactivex.Single;
import io.reactivex.annotations.NonNull;
import io.reactivex.disposables.Disposable;

public class Rx4_2_SingleMaybeCompletable {
    public static void main(String[] args) {
        createSingle();
        createMaybe();
        createCompletable();
    }

    private static void createSingle() {
        Single.just("hello World").subscribe(System.out::println);
    }

    private static void createMaybe() {
        Maybe.empty().subscribe(new MaybeObserver<Object>() {
            @Override
            public void onSubscribe(@NonNull Disposable d) {

            }

            @Override
            public void onSuccess(@NonNull Object o) {
                System.out.println(o);
            }

            @Override
            public void onError(@NonNull Throwable e) {

            }

            @Override
            public void onComplete() {
                System.out.println("done");
            }
        });
    }

    private static void createCompletable() {
        Completable.fromSingle(Single.just("hello World")).subscribe(() -> System.out.println("done"));
    }
}
