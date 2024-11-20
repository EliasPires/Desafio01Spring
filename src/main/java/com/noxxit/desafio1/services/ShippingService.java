package com.noxxit.desafio1.services;

import com.noxxit.desafio1.entities.Order;
import org.springframework.stereotype.Service;

@Service
public class ShippingService {

    public double shipment(Order order) {
        if (order.getBasic() < 100.0) {
            return 20.00;
        } else if (order.getBasic() >= 100 && order.getBasic() < 200.00) {
            return 12.00;
        } else {
            return 0;
        }
    }
}
