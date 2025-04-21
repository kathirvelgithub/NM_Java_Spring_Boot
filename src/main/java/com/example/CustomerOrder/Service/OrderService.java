package com.example.CustomerOrder.Service;

import com.example.CustomerOrder.Exception.ResourceNotFound;
import com.example.CustomerOrder.Repo.OrderRepo;
import com.example.CustomerOrder.model.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.Collections;
import java.util.List;

@Service
    public class OrderService {
        @Autowired
        private final OrderRepo repo;

        OrderService(OrderRepo repo) {
            this.repo = repo;
        }

        public Order save(Order obj) {
            return this.repo.save(obj);
        }

    public List<Order> getOrders() {
        return repo.findAll();
    }

    public Order getOrderById(long id) {
        Order data = null;
        try{
            data= repo.getById(id);
        }
        catch (ResourceNotFound e){
            System.out.println("Order not found !!!");
        }
        return data;
    }

    public void deleteOrder(long id) {
        try {
            repo.deleteById(id);
        } catch (ResourceNotFound e) {
            System.out.println("Order not found !!!");
        }
    }
}
