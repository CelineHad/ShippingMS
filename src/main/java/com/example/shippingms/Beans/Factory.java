package com.example.shippingms.Beans;

import com.fasterxml.jackson.core.JsonProcessingException;

public interface Factory {
    public shipment create(String shipment) throws JsonProcessingException;
}
