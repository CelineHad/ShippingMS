package com.example.shippingms.Beans;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class ShipmentFactory {
    public shipment create(String type,String shipment) throws JsonProcessingException
    {
       if(type.equals("fedex"))
       {
           ObjectMapper mapper=new ObjectMapper();
           FedEx fedEx=mapper.readValue(shipment,FedEx.class);
           return fedEx;
       }
       else if (type.equals("ups"))
       {
           ObjectMapper mapper=new ObjectMapper();
           UPS ups=mapper.readValue(shipment,UPS.class);
           return ups;
       }
       else
       {
           return null;
       }
    }
}
