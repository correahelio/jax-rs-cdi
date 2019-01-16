package com.my.application.controller;

import com.my.application.service.HelloService;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("hello")
public class HelloResource {

    @Inject
    public HelloService helloService;

    @GET
    public String hello() {
        return helloService.getHello();
    }
}
