package com.example.demo.repositry;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.PassangerDetails;

@Repository
public interface PassangerDetailsRepo extends JpaRepository<PassangerDetails, Integer> {

}
