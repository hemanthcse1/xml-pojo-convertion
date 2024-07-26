package com.hemanth.xmlpojoconvertion.services;

import com.hemanth.xmlpojoconvertion.config.JaxbConfig;
import com.hemanth.xmlpojoconvertion.model.Envelope;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;

import javax.xml.transform.stream.StreamSource;
import java.io.StringReader;

import static org.junit.jupiter.api.Assertions.*;


@TestInstance(TestInstance.Lifecycle.PER_CLASS)
@ExtendWith(MockitoExtension.class)
class JmsMessageServiceTest {

    @Mock
    private Jaxb2Marshaller jaxb2Marshaller;

    @InjectMocks
    private JmsMessageService jmsMessageService;

    @BeforeAll
    public void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @BeforeEach
    public void setUp2() {
        jaxb2Marshaller = new Jaxb2Marshaller();
        jaxb2Marshaller.setPackagesToScan("com.hemanth.xmlpojoconvertion.model"); // Adjust this package as needed
    }

    @Test
    public void parseXmlToPojo() {
        String xml = "<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?>\n" +
                "<Envelope xmlns=\"http://www.example.com/envelope\">\n" +
                "    <Header>\n" +
                "        <Timestamp>2024-07-19T07:39:37.362+00:00</Timestamp>\n" +
                "        <MessageId>urn:uuid:12345-abcde</MessageId>\n" +
                "        <From>System</From>\n" +
                "    </Header>\n" +
                "    <Body>\n" +
                "        <Message>Hello, World!</Message>\n" +
                "    </Body>\n" +
                "</Envelope>";

        Envelope envelope = (Envelope) jaxb2Marshaller.unmarshal(new StreamSource(new StringReader(xml)));

        System.out.println("response "+envelope.getHeader().getTimestamp());
        assertNotNull(envelope);
        assertNotNull(envelope.getHeader());
        assertEquals("2024-07-19T07:39:37.362+00:00", envelope.getHeader().getTimestamp());
        assertEquals("urn:uuid:12345-abcde", envelope.getHeader().getMessageId());
        assertEquals("System", envelope.getHeader().getFrom());
        assertNotNull(envelope.getBody());
        assertEquals("Hello, World!", envelope.getBody().getMessage());
    }

}