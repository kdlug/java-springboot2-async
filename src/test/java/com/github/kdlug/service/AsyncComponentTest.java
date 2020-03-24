package com.github.kdlug.service;

import com.github.kdlug.async.AsyncComponent;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class AsyncComponentTest {

    @Autowired
    AsyncComponent asyncComponent;

    @Test
    void shouldRunMethodAsync() throws InterruptedException {
        System.out.println("Start - invoking an asynchronous method. " + Thread.currentThread().getName());
        asyncComponent.asyncMethodWithVoidReturnType();
        Thread.sleep(2000);
        System.out.println("End - invoking an asynchronous method. ");
    }
}