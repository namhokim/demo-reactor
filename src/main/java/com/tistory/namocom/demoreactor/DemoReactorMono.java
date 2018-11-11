package com.tistory.namocom.demoreactor;

import reactor.core.publisher.Mono;

public class DemoReactorMono {

    public static void main(String[] args) throws InterruptedException {
        Mono.just(1)
                .map(integer -> "foo" + integer)
                .or(Mono.just("boo"))
                .subscribe(System.out::println);

        Thread.sleep(5000);
    }
}
