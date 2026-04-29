package com.smarttraffic.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.smarttraffic.model.Violation;

public interface ViolationRepository extends JpaRepository<Violation, Integer> {
}
