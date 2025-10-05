package com.ty.hello;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
class HelloWorld{

    @RequestMapping("/hello")
    public String sayHello(){
        return "Hello";
    }


}