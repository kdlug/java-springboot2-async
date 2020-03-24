package com.github.kdlug.async;

import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.AsyncResult;
import org.springframework.stereotype.Service;

import java.util.concurrent.Future;

@Service
public class AsyncComponent {

    @Async
    public void asyncMethodWithVoidReturnType() {
        System.out.println("Execute method asynchronously. " + Thread.currentThread().getName());
    }

    @Async
    public Future<String> asyncMethodWithReturnType() {
        System.out.println("Execute method with return type asynchronously. " + Thread.currentThread().getName());

        try {
            Thread.sleep(5000);
            return new AsyncResult<>("hello world !!!!");
        } catch (InterruptedException e) {
            System.out.println("Exception");
        }

        return null;
    }

}
