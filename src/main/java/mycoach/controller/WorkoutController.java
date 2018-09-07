package mycoach.controller;
import java.util.List;
import javax.inject.Inject;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import mycoach.model.WorkoutModel;
import mycoach.service.WorkoutService;

@RestController 
// je dis a spring que c un composant qui va servir de point d'entre pour des request REST  , le rest c un moyen dutlisier le http pour communiquer avec une appli 


//l'adresse c'est quoi ladress de base pour acceder a toutes les methodes , ou le front va chercher la methode
@RequestMapping("/api/workout")

public class WorkoutController {

	@Inject
	//pour pouvoir utiliser le service dans mon conttroller je permets l'acces ici
	WorkoutService workoutService ;

	@GetMapping
	// c'est l'extension de request mapping , get je vais chercher des donnes
	@ResponseBody
	//la methode retourne un objet qui saffiche dans la page , le response body dit a spring de serialiser l'ojet en json 
	public List<WorkoutModel> list() {

		return workoutService.getAll();
	}

	/*
	 * exemple
	@GetMapping("/2")
	// c'est l'extension de request mapping , get je vais chercher des donnes
	@ResponseBody
	//la methode retourne un objet qui saffiche dans la page
	public List<WorkoutModel> list2() {

		return workoutService.getAll();
	}
	*/
	
	
	@PostMapping
	// post jenvoi des donnésa la base
	public WorkoutModel createWorkout(@RequestBody WorkoutModel workout) {

		workoutService.save(workout);
		return workout;
	}

}
