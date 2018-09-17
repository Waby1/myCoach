package mycoach.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.*;

@Entity
public class PerformanceModel {

@Id
@GeneratedValue (strategy = GenerationType.AUTO)
private Long id;

private String exercice;

private String date;

private int max;

public PerformanceModel() {
	
}

public PerformanceModel(Long id, String exercice, String date, int max) {
	this.id = id ;
	this.exercice = exercice;
	this.date = date;
	this.max = max;
}

public Long getId() {
	return id;
}

public void setId(Long id) {
	this.id = id;
}

public String getExercice() {
	return exercice;
}

public void setExercice(String exercice) {
	this.exercice = exercice;
}

public String getDate() {
	return date;
}

public void setDate(String date) {
	this.date = date;
}

public int getMax() {
	return max;
}

public void setMax(int max) {
	this.max = max;
}


}
