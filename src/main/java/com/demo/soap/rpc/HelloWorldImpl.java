package com.demo.soap.rpc;

import javax.jws.WebService;

//Service Implementation
@WebService(endpointInterface = "com.demo.soap.rpc.HelloWorld")
public class HelloWorldImpl implements HelloWorld{
    @Override
    public String getHelloWorldAsString(String name) {
        return "Hello World JAX-WS " + name;
    }
}
