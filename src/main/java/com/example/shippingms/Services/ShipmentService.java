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

    public boolean addNewShipmentFedex(FedEx fedex){
        if( fedex.getCarrierServiceID().equals("fedexGround") || fedex.getCarrierServiceID().equals("fedexAIR"))
        {
            FedEx fed=fedexRepo.save(fedex);
            if(fed==fedex){
                return true;
        }
       }
        return false;
    }

    public boolean addNewShipmentups(UPS ups){
        if(ups.getShipmentServiceID().equals("UPSExpress")||ups.getShipmentServiceID().equals("UPS2DAY"))
        {
            UPS ups1=upsRepo.save(ups);
            if(ups1==ups)
            {
                return true;
            }
        }

        return false;
    }
}
