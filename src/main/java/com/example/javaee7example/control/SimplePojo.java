package com.example.javaee7example.control;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class SimplePojo {

    private String message;
    private int number;

    public SimplePojo() {}

    public SimplePojo(String message, int randomNumber) {
        this.message = message;
        this.number = randomNumber;
    }

    public String getMessage() {
        return message;
    }

    public int getNumber() {
        return number;
    }
}
