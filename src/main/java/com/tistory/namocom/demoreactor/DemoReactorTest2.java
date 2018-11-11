package com.tistory.namocom.demoreactor;

import reactor.core.publisher.Flux;

import java.time.Duration;
import java.util.Arrays;

public class DemoReactorTest2 {

    public static void main(String[] args) throws InterruptedException {
        Flux.interval(Duration.ofMillis(100))
                .take(10)
                .subscribe(System.out::println);

        /*Flux.fromIterable(Arrays.asList("foo", "bar"))
                .delayElements(Duration.ofSeconds(1))
                .doOnNext(System.out::println)
                .map(String::toUpperCase)
                .subscribe(System.out::println);*/

        System.out.println("end of main");
        Thread.sleep(5000);
    }
}
