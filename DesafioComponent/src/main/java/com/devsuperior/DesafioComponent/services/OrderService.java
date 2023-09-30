package com.devsuperior.DesafioComponent.services;

import com.devsuperior.DesafioComponent.entities.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {
    @Autowired
    ShippingService shippingService;

    public double OrderService(Order order){

        double valorFrete = shippingService.shipment(order);
        if(order.getDiscount() > 0){
        double desconto =  (valorFrete * order.getDiscount())/100;
        return valorFrete - desconto;
        }

        return valorFrete;
    }



}
