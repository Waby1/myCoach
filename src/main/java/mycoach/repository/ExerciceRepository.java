package mycoach.repository;

import org.springframework.data.repository.CrudRepository;

import mycoach.model.ExerciceModel;

public interface ExerciceRepository extends CrudRepository <ExerciceModel, Long> {

}
