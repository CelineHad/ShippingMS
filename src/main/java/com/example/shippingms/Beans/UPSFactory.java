package com.example.shippingms.Beans;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class UPSFactory implements Factory{
    @Override
    public shipment create(String shipment) throws JsonProcessingException {
        ObjectMapper mapper=new ObjectMapper();
        UPS ups=mapper.readValue(shipment,UPS.class);
        return ups;
    }
}
