package mycoach.repository;

import java.util.List;

import javax.inject.Named;

import org.springframework.data.jpa.repository.JpaRepository;

import mycoach.model.ExerciceTypeModel;

@Named
public interface ExerciceTypeRepository extends JpaRepository <ExerciceTypeModel, Long> {
	//List<ExerciceTypeModel> findByName(String name);
    //List<ExerciceTypeModel> findByNameIgnoreCase(String name);
	//List<ExerciceTypeModel> findAll();
}
