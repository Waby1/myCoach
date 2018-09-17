package mycoach.controller;

import java.util.List;

import javax.inject.Inject;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import mycoach.model.PerformanceModel;
import mycoach.service.PerformanceService;

@RestController
@RequestMapping("/api/performance")
public class PerformanceController {
	
	@Inject
	PerformanceService performanceService;

	
	@GetMapping
	@ResponseBody
	public List<PerformanceModel> list(){
		return performanceService.getAll();
	}
	
	@PostMapping
	public PerformanceModel createPerformance(@RequestBody PerformanceModel performance) {
		performanceService.save(performance);
		return performance;
		
	}
	
}
