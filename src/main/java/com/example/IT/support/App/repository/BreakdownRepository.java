package com.example.IT.support.App.repository;


import com.example.IT.support.App.model.Breakdown;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BreakdownRepository extends JpaRepository<Breakdown, Long> {
}
