package com.example.CustomerOrder.Repo;

import com.example.CustomerOrder.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepo extends JpaRepository<Order,Long> {
}
