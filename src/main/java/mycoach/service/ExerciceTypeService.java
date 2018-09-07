package mycoach.service;

import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;

import mycoach.model.ExerciceTypeModel;
import mycoach.model.WorkoutModel;
import mycoach.repository.ExerciceTypeRepository;
import mycoach.repository.WorkoutRepository;

@Named
public class ExerciceTypeService {
	
	@Inject
	ExerciceTypeRepository exerciceRepository ;
		
	
	public ExerciceTypeModel save(ExerciceTypeModel ex) {
		exerciceRepository.save(ex);
		return ex;
	}
	
	public List<ExerciceTypeModel> getAll() {
	
		return exerciceRepository.findAll();
	}
}

