package mycoach.model;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
//je declare a hibernate que l'objet a une correspondance dans la base de données

public class ExerciceModel {

	@Id
	//je declare a hibernate que c la cle primaire de ma table en bdd
	@GeneratedValue(strategy = GenerationType.AUTO)
	//incrementation de la sequence dans la bdd +1 a la ref declaré
	private Long id;

	private int rep;

	private int set;

	@JsonIgnore
	@ManyToOne(fetch = FetchType.LAZY)
	// la relation entre les tables
	@JoinColumn(name = "FK_WORKOUT")
	private WorkoutModel workout;

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "FK_EXERCICE")
	private ExerciceTypeModel exerciceType;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public WorkoutModel getWorkout() {
		return workout;
	}

	public void setWorkout(WorkoutModel workout) {
		this.workout = workout;
	}

	public ExerciceTypeModel getExerciceType() {
		return exerciceType;
	}

	public void setExerciceType(ExerciceTypeModel exerciceType) {
		this.exerciceType = exerciceType;
	}

	public ExerciceModel() {

	}

	public int getRep() {
		return rep;
	}

	public void setRep(int rep) {
		this.rep = rep;
	}

	public int getSet() {
		return set;
	}

	public void setSet(int set) {
		this.set = set;
	}
}