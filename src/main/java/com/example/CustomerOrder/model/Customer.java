package com.example.CustomerOrder.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.*;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Entity
@Data
@Getter @Setter @NoArgsConstructor @AllArgsConstructor
@Table(name = "customer")
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String name;

    @Column
    private String email;

    @OneToMany(mappedBy = "customer", cascade = CascadeType.ALL)
    @JsonManagedReference
    private List<Order> orders;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<Order> getOrders() {
        return orders;
    }

    public void setOrders(List<Order> orders) {
        this.orders = orders;
    }
}









//package com.example.CustomerOrder.model;
//
////import java.util.ArrayList;
////import java.util.List;
//
//import jakarta.persistence.*;
//import lombok.*;
//
//import java.nio.MappedByteBuffer;
//import java.util.List;
//
//@Entity
//@Data
//@Getter
//@Setter
//@NoArgsConstructor
//@AllArgsConstructor
//@Table(name = "Customer")
//public class Customer {
//
//    @jakarta.persistence.Id
//    @GeneratedValue
//    private int Id;
//    private String Name ;
//    @Column(name = "Email")
//    private String mail;
//
//    @OneToMany(mappedBy = "Customer", cascade= CascadeType.ALL)
//    //@JsonmanagedReference
//    private List<Order> Orders;
//
//}
//
