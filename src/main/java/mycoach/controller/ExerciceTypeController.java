package mycoach.controller;

import java.util.List;

import javax.inject.Inject;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import mycoach.model.ExerciceTypeModel;
import mycoach.service.ExerciceTypeService;

@RestController
@RequestMapping("/api/exerciceType")
public class ExerciceTypeController {

	@Inject
	ExerciceTypeService exerciceTypeService;
	
	
	@GetMapping
	public List<ExerciceTypeModel> list() {		
		
		
			return exerciceTypeService.getAll();
	}
  
}
