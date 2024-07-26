package com.hemanth.xmlpojoconvertion.model;


import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;

@XmlAccessorType(XmlAccessType.FIELD)
public class RdhPayload {

    @XmlElement(name = "message", namespace = "http://www.w3.org/2003/05/soap-envelope")
    private String message;

    // Getters and Setters
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}

