package mycoach.repository;
import java.util.List;
import javax.inject.Named;

import org.springframework.data.jpa.repository.JpaRepository;

import mycoach.model.WorkoutModel;



@Named
public interface WorkoutRepository extends JpaRepository<WorkoutModel, Long> {
	
	//List<WorkoutModel> findAll();
	//List<WorkoutModel> findByName(String name);
    //List<WorkoutModel> findByNameIgnoreCase(String name);
	
	
}

