package com.example.CustomerOrder.Control;

import com.example.CustomerOrder.model.Customer;
import com.example.CustomerOrder.Service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/customer")
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @PostMapping("/add")
    public String save(@RequestBody Customer customer) {
        customerService.save(customer);
        return "stored successfully";
     }


    @GetMapping("/get")
    public List<Customer> getAll(){
        return customerService.getAll();
    }

    @GetMapping("/get/{id}")
    public Customer getbyId(@PathVariable(name="id") long id){
        return customerService.getbyId(id);
    }

    @DeleteMapping("/delete/{id}")
    public String delete(@PathVariable(name="id") long id){
        if(customerService.getbyId(id)!= null) {
            customerService.delete(id);
            return  "That ID was deleted successfully";
        }
        else {
            return "ID was not found on your request";
        }
    }
}


