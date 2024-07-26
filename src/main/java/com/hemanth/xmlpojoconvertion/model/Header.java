package com.hemanth.xmlpojoconvertion.model;

import jakarta.xml.bind.annotation.*;


@XmlAccessorType(XmlAccessType.FIELD)
public class Header {

    @XmlElement(name = "Timestamp", namespace = "http://www.example.com/envelope")
    private String timestamp;

    @XmlElement(name = "MessageId", namespace = "http://www.example.com/envelope")
    private String messageId;

    @XmlElement(name = "From", namespace = "http://www.example.com/envelope")
    private String from;

    // Getters and Setters
    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public String getMessageId() {
        return messageId;
    }

    public void setMessageId(String messageId) {
        this.messageId = messageId;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    @Override
    public String toString() {
        return "Header{" +
                "timestamp='" + timestamp + '\'' +
                ", messageId='" + messageId + '\'' +
                ", from='" + from + '\'' +
                '}';
    }
}

