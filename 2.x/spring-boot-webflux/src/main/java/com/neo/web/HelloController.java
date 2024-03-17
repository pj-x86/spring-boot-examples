package com.neo.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public Mono<String> hello() {
        return Mono.just("Welcome to reactive world ~");
    }

    // 或者使用Reactive方式处理参数并动态生成响应
    @GetMapping("/greetings-with-name")
    public Mono<String> greetingsWithName(@RequestParam String name) {
        return Mono.just(String.format("Hello, %s!", name));
    }
}
