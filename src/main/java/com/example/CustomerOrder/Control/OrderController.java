package com.example.CustomerOrder.Control;

import com.example.CustomerOrder.Service.OrderService;
import com.example.CustomerOrder.model.Order;
import com.example.CustomerOrder.Service.OrderService;
import com.example.CustomerOrder.model.Order;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Tag(name = "Customer API" ,description = "Operations related to Customer")
@RequestMapping("/customer_order")
public class OrderController {

    @Autowired
    private OrderService orderService;

    @PostMapping//("/add_order")
    public String save(@RequestBody Order order) {
        orderService.save(order);
        return "stored successfully";
    }

    @GetMapping//("/add_order")
    public List<Order> getOrders() {
        return orderService.getOrders();
    }

    @GetMapping("/id")
    public List<Order> getOrdersById(@PathVariable (name = "id") long id) {
        return orderService.getOrderById(id);
    }

    @DeleteMapping("/id")
    public String deleteOrder (@PathVariable(name = "id") long id){
        if(orderService.getOrderById(id)!=null){
            orderService.deleteOrder(id);
            return "That Order was deleted Successfully";
        }
        else{
            return "Ordre ID is Invalid";
        }
    }
}