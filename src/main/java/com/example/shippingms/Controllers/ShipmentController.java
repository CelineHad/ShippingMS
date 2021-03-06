package com.example.shippingms.Controllers;

import com.example.shippingms.Beans.*;
import com.example.shippingms.Services.ShipmentService;
import com.fasterxml.jackson.core.JsonProcessingException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ShipmentController {
    @Autowired
    ShipmentService service;

    @PostMapping("/addnewshipment/{ID}")
    public ResponseEntity addNewShipment(@RequestBody String shipmentDetails, @PathVariable ("ID") String type) throws JsonProcessingException {
        ShipmentFactory factory=new ShipmentFactory();
        shipment shipment;
        shipment=factory.create(type,shipmentDetails);

        if(type.equals("fedex"))
        {
            boolean result=(service.addNewShipmentFedex((FedEx) shipment));
            if(result)
            {
                return new ResponseEntity("shipment has been placed successfully", HttpStatus.OK);
            }
            else
            {
                return new ResponseEntity("shipment creation went wrong , check your inputs", HttpStatus.OK);
            }

        }
        else if (type.equals("ups"))
        {
            boolean result=(service.addNewShipmentups((UPS) shipment));
            if(result)
            {
                return new ResponseEntity("shipment has been placed successfully", HttpStatus.OK);
            }
            else
            {
                return new ResponseEntity("shipment creation went wrong , check your inputs", HttpStatus.OK);
            }
        }
        return new ResponseEntity("shipment creation went wrong , company you entered does not exist ,please check ", HttpStatus.BAD_REQUEST);
    }

}
