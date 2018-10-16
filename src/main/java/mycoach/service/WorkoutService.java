package mycoach.service;

import java.util.List;
import javax.inject.Inject;
import javax.inject.Named;
import javax.transaction.Transactional;

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
		
	@Transactional                                           // je securise ma methode 
	public WorkoutModel save(WorkoutModel workout) {
		workoutRepository.save(workout);    // ici je persiste le workout en base 
		
		for (ExerciceModel exercice : workout.getExercices()){     //je boucle sur tous les exercices que je recupere
			exercice.setWorkout(workout);    //     ici a chaque iteration qui corresponds a 1 exercice  j'affecte l'exercice en cours au workout 
		
		} 
				
		exerciceRepository.saveAll(workout.getExercices());   // ici je sauvegarde tous les exercices en faisant appel au saveAll de l'interface exerciceRepo
		
		return workout;
	}
	
	public List<WorkoutModel> getAll() {
	
		return workoutRepository.findAll();
	}
	
	

}
