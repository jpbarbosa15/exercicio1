package com.devsuperior.DesafioComponent.services;

import com.devsuperior.DesafioComponent.entities.Order;
import org.springframework.stereotype.Service;

@Service
public class ShippingService {
    public double shipment(Order order){
        if(order.getBasic() < 100 ) {
            return order.getBasic() + 20;
        } else if (order.getBasic() >=100 && order.getBasic() < 200 ) {
            return order.getBasic() + 15;
        }

        return order.getBasic();
    }


}
