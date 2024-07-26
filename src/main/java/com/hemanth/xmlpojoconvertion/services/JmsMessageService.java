package com.hemanth.xmlpojoconvertion.services;

import com.hemanth.xmlpojoconvertion.model.Envelope;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;
import org.springframework.stereotype.Service;

import javax.xml.transform.stream.StreamSource;
import java.io.StringReader;

@Service
public class JmsMessageService {

    @Autowired
    private Jaxb2Marshaller jaxb2Marshaller;

    public Envelope processMessage(String xmlMessage) {
        try {
            return (Envelope) jaxb2Marshaller.unmarshal(new StreamSource(new StringReader(xmlMessage)));
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println();
            return null;
        }
    }
}
