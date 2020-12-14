package net.jiaozhu.gs.aop.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class AopController {

    @RequestMapping("/hello")
    public String sayHello() {
        log.debug("hello");
        return "hello";
    }
}
