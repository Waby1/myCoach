package mycoach.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import mycoach.model.PerformanceModel;



public interface PerformanceRepository extends JpaRepository <PerformanceModel, Long> {
    List<PerformanceModel> findAll();
    
    
}
