package io.github.yourzhangjian.service;

import org.springframework.stereotype.Service;

@Service
public class HelloService {

    public void sayHello() {
        System.out.println("Hello, World! => 你好, 世界!");
    }

}
