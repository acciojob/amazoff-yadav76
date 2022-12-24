package com.driver;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.HashMap;

@Component
@Repository
public class OrderRepository {

    private HashMap<String,Order> order;
    private HashMap<String,DeliveryPartner> deliveryPartner;

    private HashMap<String,String> orderPartnerPair;
    private HashMap<String,Order> assignOrderToPartner;

    public OrderRepository() {
        this.order = new HashMap<>();
        this.deliveryPartner = new HashMap<>();
        this.assignOrderToPartner = new HashMap<>();
        this.orderPartnerPair = new HashMap<>();
    }


}
