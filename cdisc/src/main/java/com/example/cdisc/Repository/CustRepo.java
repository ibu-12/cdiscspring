package com.example.cdisc.Repository;



import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.cdisc.Model.User;



public interface CustRepo  extends JpaRepository<User,Integer>{
    Optional<User>findByEmail(String email);
}