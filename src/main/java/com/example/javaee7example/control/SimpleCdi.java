package com.example.javaee7example.control;

import javax.enterprise.context.RequestScoped;

@RequestScoped
public class SimpleCdi {

    public String getMessage() {
        return String.valueOf(Math.random());
    }

}
