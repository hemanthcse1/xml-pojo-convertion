package com.hemanth.xmlpojoconvertion.model;


import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.*;


@XmlAccessorType(XmlAccessType.FIELD)
public class Body {

    @XmlElement(name = "Message", namespace = "http://www.example.com/envelope")
    private String message;

    // Getters and Setters
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "Body{" +
                "message='" + message + '\'' +
                '}';
    }
}
