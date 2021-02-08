package com.rxJava.Day7;

import io.reactivex.Observable;

public class Rx7_Contains {
    public static void main(String[] args) {
//        containsWithPrimitive();
        containWithPrimitive();
    }

    private static void containsWithPrimitive() {
        Observable.just(1, 2, 3, 4, 5)
                .contains(10)
                .subscribe(System.out::println);
    }

    private static void containWithPrimitive() {
        User user = new User("hello");
        Observable.just(user)
                .contains(user)
                .subscribe(System.out::println);
    }

    private static class User {
        String name;

        public User(String name) {
            this.name = name;
        }
    }
}
