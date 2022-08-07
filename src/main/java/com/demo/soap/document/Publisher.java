package com.demo.soap.document;

import javax.xml.ws.Endpoint;

//Endpoint publisher
public class Publisher {
    public static void main(String[] args) {
        Endpoint.publish("http://localhost:7788/ws/hello", new HelloWorldImpl());
    }
}
