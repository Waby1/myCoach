package mycoach.service;

import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;

import mycoach.model.PerformanceModel;
import mycoach.repository.PerformanceRepository;

@Named
public class PerformanceService {

	@Inject
	PerformanceRepository performanceRepository ;
	
	public List <PerformanceModel> getAll(){
		return performanceRepository.findAll();
	}
	
	public PerformanceModel save( PerformanceModel performance) {
		performanceRepository.save(performance);
		return performance;
	}
	
}
