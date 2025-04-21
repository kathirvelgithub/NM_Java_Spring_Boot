package com.example.CustomerOrder.Service;

import com.example.CustomerOrder.Exception.InvalidRquestException;
import com.example.CustomerOrder.Repo.CustomerRepo;
import com.example.CustomerOrder.Exception.ResourceNotFound;
import com.example.CustomerOrder.model.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {
    @Autowired
    private final CustomerRepo repo;

    CustomerService(CustomerRepo repo){
        this.repo=repo;
    }

    public Customer save(Customer obj){
        return this.repo.save(obj);
    }

    public List<Customer> getAll(){
        return this.repo.findAll();
    }

    public Customer getbyId(long id) {
        Customer data = null;
        try {
            data = repo.findById(id).get();
        } catch (ResourceNotFound e) {
            System.out.println("Customer not found");
        }
        return data;
    }

    public void delete(long id){

        this.repo.deleteById(id);

    }
}
//package com.ecom.customerorder.service;
//
//
//
//import com.ecom.customerorder.exception.ResourceNotFoundException;
//import com.ecom.customerorder.model.Customer;
//import com.ecom.customerorder.repository.CustomerRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import java.util.List;
//
//@Service
//public class CustomerService {
//    @Autowired
//    private CustomerRepository repository;
//
//    public List<Customer> getAllCustomers() {
//        return repository.findAll();
//    }
//
//    public Customer getCustomerById(Long id) {
//        return repository.findById(id)
//                .orElseThrow(() -> new ResourceNotFoundException("Customer not found"));
//    }
//
//    public Customer addCustomer(Customer customer) {
//        return repository.save(customer);
//    }
//
//    public void deleteCustomer(Long id) {
//        repository.deleteById(id);
//    }
//}