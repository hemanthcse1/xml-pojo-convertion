package com.hemanth.xmlpojoconvertion.model;

import jakarta.xml.bind.annotation.*;

@XmlRootElement(name = "Envelope", namespace = "http://www.example.com/envelope")
@XmlAccessorType(XmlAccessType.FIELD)
public class Envelope {

    @XmlElement(name = "Header", namespace = "http://www.example.com/envelope")
    private Header header;

    @XmlElement(name = "Body", namespace = "http://www.example.com/envelope")
    private Body body;

    // Getters and Setters
    public Header getHeader() {
        return header;
    }

    public void setHeader(Header header) {
        this.header = header;
    }

    public Body getBody() {
        return body;
    }

    public void setBody(Body body) {
        this.body = body;
    }

    @Override
    public String toString() {
        return "Envelope{" +
                "header=" + header +
                ", body=" + body +
                '}';
    }
}


