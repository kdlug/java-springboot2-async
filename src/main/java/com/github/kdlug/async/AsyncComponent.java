package com.github.kdlug.async;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Service
public class AsyncComponent {

    @Async
    public void asyncMethodWithVoidReturnType() {
        System.out.println("Execute method asynchronously. " + Thread.currentThread().getName());
    }
    
}
