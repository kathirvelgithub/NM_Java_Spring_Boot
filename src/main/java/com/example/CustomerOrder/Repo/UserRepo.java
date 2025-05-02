package com.example.CustomerOrder.Repo;


import com.example.CustomerOrder.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepo extends JpaRepository<User,Long> {

    Optional<User> findByMail(String mail);
    boolean existsByMail(String mail);
}