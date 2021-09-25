package com.example.shippingms.Beans;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class FedExFactory implements Factory{
    @Override
    public shipment create(String shipment) throws JsonProcessingException {
        ObjectMapper mapper=new ObjectMapper();
        FedEx fedEx=mapper.readValue(shipment,FedEx.class);
        return fedEx;
    }
}
