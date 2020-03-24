package com.github.kdlug.service;

import com.github.kdlug.async.AsyncComponent;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

@SpringBootTest
class AsyncComponentTest {

    @Autowired
    AsyncComponent asyncComponent;

    @Test
    void shouldRunMethodAsyncWithVoidReturnType() throws InterruptedException {
        System.out.println("Start - invoking an asynchronous method. " + Thread.currentThread().getName());
        asyncComponent.asyncMethodWithVoidReturnType();
        Thread.sleep(2000);
        System.out.println("End - invoking an asynchronous method. ");
    }

    @Test
    void shouldRunMethodAsyncWithReturnType() throws InterruptedException, ExecutionException {
        System.out.println("Invoking an asynchronous method. "
                + Thread.currentThread().getName());
        Future<String> future = asyncComponent.asyncMethodWithReturnType();

        while (true) {
            if (future.isDone()) {
                System.out.println("Result from asynchronous process - " + future.get());
                break;
            }
            System.out.println("Continue doing something else. ");
            Thread.sleep(1000);
        }
    }
}