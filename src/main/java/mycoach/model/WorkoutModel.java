package mycoach.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

@Entity

public class WorkoutModel {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	private String name;

	@OneToMany(mappedBy = "workout")
	private List<ExerciceModel> exercices = new ArrayList<ExerciceModel>();

	public WorkoutModel() {

	}

	public List<ExerciceModel> getExercices() {
		return exercices;
	}

	public void setExercices(List<ExerciceModel> exercices) {
		this.exercices = exercices;
	}

	public WorkoutModel(Long id, String name) {
		this.id = id;
		this.name = name;

	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
