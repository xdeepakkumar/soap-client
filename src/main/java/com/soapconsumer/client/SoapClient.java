package com.soapconsumer.client;

import com.soapconsumer.pojo.webservice.GetCountryRequest;
import com.soapconsumer.pojo.webservice.GetCountryResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;
import org.springframework.stereotype.Service;
import org.springframework.ws.client.core.WebServiceTemplate;

@Service
public class SoapClient {

    @Autowired
    private Jaxb2Marshaller marshaller;

    private WebServiceTemplate template;

    public GetCountryResponse getCountryResponse(GetCountryRequest getCountryRequest){
        template = new WebServiceTemplate(marshaller);
        return (GetCountryResponse) template.marshalSendAndReceive("http://localhost:9229/ws", getCountryRequest);

    }
}
