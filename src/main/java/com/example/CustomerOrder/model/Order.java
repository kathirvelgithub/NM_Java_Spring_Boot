//package com.example.CustomerOrder.model;
//
//import com.fasterxml.jackson.annotation.JsonBackReference;
//import jakarta.persistence.*;
//import lombok.*;
//
//@Entity
//@Data
//@Getter @Setter @NoArgsConstructor @AllArgsConstructor
//@Table(name = "customer_order")
//public class Order {
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Long id;
//
//    private String productName;
//    private int quantity;
//    private double price;
//
//    @ManyToOne
//    @JoinColumn(name = "customer_id", nullable = false)
//    @JsonBackReference
//    private com.example.CustomerOrder.model.Customer customer;
//
//    public Long getId() {
//        return id;
//    }
//
//    public void setId(Long id) {
//        this.id = id;
//    }
//
//    public String getProductName() {
//        return productName;
//    }
//
//    public void setProductName(String productName) {
//        this.productName = productName;
//    }
//
//    public int getQuantity() {
//        return quantity;
//    }
//
//    public void setQuantity(int quantity) {
//        this.quantity = quantity;
//    }
//
//    public double getPrice() {
//        return price;
//    }
//
//    public void setPrice(double price) {
//        this.price = price;
//    }
//
//    public Customer getCustomer() {
//        return customer;
//    }
//
//    public void setCustomer(Customer customer) {
//        this.customer = customer;
//    }
//}
//

package com.example.CustomerOrder.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter @Setter @NoArgsConstructor @AllArgsConstructor
@Table(name = "customer_order")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String productName;
    private int quantity;
    private double price;

    @ManyToOne
    @JoinColumn(name = "customer_id", nullable = false)
    @JsonBackReference
    private com.example.CustomerOrder.model.Customer customer;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
}

