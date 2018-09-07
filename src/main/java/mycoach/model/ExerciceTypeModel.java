package mycoach.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class ExerciceTypeModel {

	@Id
	@GeneratedValue (strategy = GenerationType.AUTO)
	private Long id;
	
	
	private String name;
	
	
	@JsonIgnore
	@OneToMany(mappedBy = "exerciceType")
	private List<ExerciceModel> exercices = new ArrayList <ExerciceModel>() ;
	
	
	public ExerciceTypeModel() {
		
	}
	
	public ExerciceTypeModel (Long id, String name){
		this.id = id ;
		this.name = name ; 
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public List<ExerciceModel> getExercices() {
		return exercices;
	}

	public void setExercices(List<ExerciceModel> exercices) {
		this.exercices = exercices;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
		
}