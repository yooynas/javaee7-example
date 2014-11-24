package com.example.javaee7example.boundary;

import org.apache.log4j.Logger;

import javax.enterprise.inject.Produces;
import javax.enterprise.inject.spi.InjectionPoint;

/**
 * CDI for logging.
 */
public class LoggerProducer {

    @Produces
    public Logger createLogger(InjectionPoint ip) {
        String className = ip.getMember().getDeclaringClass().getName();
        return Logger.getLogger(className);
    }
}