package com.example.shippingms.Services;

import com.example.shippingms.Beans.FedEx;
import com.example.shippingms.Beans.UPS;
import com.example.shippingms.Repositories.FedExRepo;
import com.example.shippingms.Repositories.UPSRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
@Service
public class ShipmentService {

    @Autowired
    FedExRepo fedexRepo;
    @Autowired
    UPSRepo upsRepo;

    public boolean addNewShipment(FedEx fedex){
        if(!fedex.equals("fedexGround")||!fedex.equals("fedexAIR"))
        {
            return false;
        }
        fedexRepo.save(fedex);
        return true;
    }

    public boolean addNewShipmentups(UPS ups){
        if(!ups.equals("UPSExpress")||!ups.equals("UPS2DAY"))
        {
            return false;
        }
        upsRepo.save(ups);
        return true;
    }
}
