package com.soapconsumer.controller;

import com.soapconsumer.client.SoapClient;
import com.soapconsumer.pojo.webservice.GetCountryRequest;
import com.soapconsumer.pojo.webservice.GetCountryResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CountryController {

    @Autowired
    private SoapClient soapClient;

    @PostMapping("/getCountry")
    public GetCountryResponse getCountryResponse(@RequestBody GetCountryRequest request){
        return soapClient.getCountryResponse(request);
    }

}
