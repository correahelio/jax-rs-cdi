package com.my.application;

import com.my.application.service.HelloService;
import org.glassfish.hk2.utilities.binding.AbstractBinder;

public class ApplicationBinder extends AbstractBinder {
    protected void configure() {
        bind(HelloService.class).to(HelloService.class);
    }
}
