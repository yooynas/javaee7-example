package com.example.javaee7example.boundary;

import org.apache.log4j.Logger;

import javax.enterprise.inject.Produces;
import javax.enterprise.inject.spi.InjectionPoint;

public class LoggerProducer {

    @Produces
    public Logger createLogger(InjectionPoint ip) {
        Class<?> clazz = ip.getMember().getDeclaringClass();
        return Logger.getLogger(clazz.getName());
    }
}