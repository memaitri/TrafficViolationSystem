package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;
// import com.example.model.Violation;
import com.example.model.Violation;

public interface ViolationRepository extends JpaRepository<Violation, Integer> {
}