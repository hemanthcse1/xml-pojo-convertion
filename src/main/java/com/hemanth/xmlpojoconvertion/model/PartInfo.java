package com.hemanth.xmlpojoconvertion.model;

import jakarta.xml.bind.annotation.*;

import javax.xml.validation.Schema;

@XmlAccessorType(XmlAccessType.FIELD)
public class PartInfo {

    @XmlElement(name = "Schema", namespace = "http://ibus.jpmorgan.com/2009/bus-message-envelope")
    private Schema schema;

    @XmlElement(name = "MessageStandard", namespace = "http://ibus.jpmorgan.com/2009/bus-message-envelope")
    private String messageStandard;

    @XmlElement(name = "MessageType", namespace = "http://ibus.jpmorgan.com/2009/bus-message-envelope")
    private String messageType;

    @XmlElement(name = "PartProperties", namespace = "http://ibus.jpmorgan.com/2009/bus-message-envelope")
    private PartProperties partProperties;

    // Getters and Setters
    public Schema getSchema() {
        return schema;
    }

    public void setSchema(Schema schema) {
        this.schema = schema;
    }

    public String getMessageStandard() {
        return messageStandard;
    }

    public void setMessageStandard(String messageStandard) {
        this.messageStandard = messageStandard;
    }

    public String getMessageType() {
        return messageType;
    }

    public void setMessageType(String messageType) {
        this.messageType = messageType;
    }

    public PartProperties getPartProperties() {
        return partProperties;
    }

    public void setPartProperties(PartProperties partProperties) {
        this.partProperties = partProperties;
    }
}

