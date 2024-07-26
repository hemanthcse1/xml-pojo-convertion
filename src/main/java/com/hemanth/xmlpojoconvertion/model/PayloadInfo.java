package com.hemanth.xmlpojoconvertion.model;

import jakarta.xml.bind.annotation.*;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
public class PayloadInfo {

    @XmlElement(name = "PartInfo", namespace = "http://ibus.jpmorgan.com/2009/bus-message-envelope")
    private List<PartInfo> partInfoList;

    // Getters and Setters
    public List<PartInfo> getPartInfoList() {
        return partInfoList;
    }

    public void setPartInfoList(List<PartInfo> partInfoList) {
        this.partInfoList = partInfoList;
    }
}

