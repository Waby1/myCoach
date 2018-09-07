package mycoach.service;

import java.util.List;
import javax.inject.Inject;
import javax.inject.Named;

import mycoach.model.ExerciceModel;
import mycoach.model.WorkoutModel;
import mycoach.repository.ExerciceRepository;
import mycoach.repository.WorkoutRepository;

@Named
public class WorkoutService  {

	@Inject
	WorkoutRepository workoutRepository ;
	@Inject
	ExerciceRepository exerciceRepository ;
		
	
	public WorkoutModel save(WorkoutModel workout) {
		workoutRepository.save(workout);
		
		for (ExerciceModel exercice : workout.getExercices()){
			exercice.setWorkout(workout);
		
		} 
				
		exerciceRepository.saveAll(workout.getExercices());
		
		return workout;
	}
	
	public List<WorkoutModel> getAll() {
	
		return workoutRepository.findAll();
	}
	
	

}
