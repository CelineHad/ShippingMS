package com.example.shippingms;

import com.example.shippingms.Beans.FedEx;
import com.example.shippingms.Beans.UPS;
import com.example.shippingms.Repositories.FedExRepo;
import com.example.shippingms.Repositories.UPSRepo;
import com.example.shippingms.Services.ShipmentService;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@SpringBootTest(classes = {API_Testing.class})
public class API_Testing {
    @Mock
    FedExRepo fedRepo;

    @Mock
    UPSRepo upsRepo;

    @InjectMocks
    ShipmentService shipmentService;

    @Test
    public void addFedExShipmentSuccessfully()
    {
        FedEx fedEx=new FedEx("fedexAIR",44.0,66.0,33.0,77.0);
        when(fedRepo.save(fedEx)).thenReturn(fedEx);
        assertEquals(true,shipmentService.addNewShipmentFedex(fedEx));
    }

    @Test
    public void addUPSShipmentSuccessfully()
    {
        UPS ups=new UPS("UPSExpress",33.0,56.0,63.0,667.0);
        when(upsRepo.save(ups)).thenReturn(ups);
        assertEquals(true,shipmentService.addNewShipmentups(ups));
    }

    @Test
    public void addUPSShipmentwithWrongshipmentServiceID()
    {
        UPS ups=new UPS("upsups",33.0,56.0,63.0,667.0);
        when(upsRepo.save(ups)).thenReturn(ups);
        assertEquals(false,shipmentService.addNewShipmentups(ups));
    }

    @Test
    public void addFedExShipmentwithWrongcarrierServiceID()
    {
        FedEx fedEx=new FedEx("fedex1234",44.0,66.0,33.0,77.0);
        when(fedRepo.save(fedEx)).thenReturn(fedEx);
        assertEquals(false,shipmentService.addNewShipmentFedex(fedEx));
    }
}
