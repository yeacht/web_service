package com.demo.soap.document;

import javax.jws.WebService;

//Service Implementation
@WebService(endpointInterface = "com.demo.soap.document.HelloWorld")
public class HelloWorldImpl implements HelloWorld {
    @Override
    public String getHelloWorldAsString(String name) {
        return "Hello World JAX-WS " + name;
    }
}
