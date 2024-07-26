package com.hemanth.xmlpojoconvertion.model;

import jakarta.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
public class PartProperties {

    @XmlElement(name = "Property", namespace = "http://ibus.jpmorgan.com/2009/bus-message-envelope")
    private String seallD;

    @XmlElement(name = "Property", namespace = "http://ibus.jpmorgan.com/2009/bus-message-envelope")
    private String messageType;

    @XmlElement(name = "Property", namespace = "http://ibus.jpmorgan.com/2009/bus-message-envelope")
    private String caid;

    // Getters and Setters
    public String getSeallD() {
        return seallD;
    }

    public void setSeallD(String seallD) {
        this.seallD = seallD;
    }

    public String getMessageType() {
        return messageType;
    }

    public void setMessageType(String messageType) {
        this.messageType = messageType;
    }

    public String getCaid() {
        return caid;
    }

    public void setCaid(String caid) {
        this.caid = caid;
    }
}

