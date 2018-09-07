package mycoach.H2;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import com.opencsv.CSVParser;
import com.opencsv.CSVParserBuilder;
import com.opencsv.CSVReader;
import com.opencsv.CSVReaderBuilder;

import mycoach.model.ExerciceTypeModel;
import mycoach.model.WorkoutModel;
import mycoach.repository.ExerciceTypeRepository;
import mycoach.repository.WorkoutRepository;

@Component
public class H2 implements ApplicationListener<ContextRefreshedEvent> {


    private final static char CSV_SEPARATOR = ';';

    @Autowired
    private ExerciceTypeRepository exerciceRepository;

    public H2 (ExerciceTypeRepository popo) {
        this.exerciceRepository = popo ;

    }

    @Override
    public void onApplicationEvent(ContextRefreshedEvent event) {
        loadExoTable("src/main/resources/data/exercices.csv");
    }

    private final void loadExoTable(String ExoFileLocation) {

        List<ExerciceTypeModel> newWorkout = new ArrayList<>();

        CSVParser csvParser = new CSVParserBuilder().withSeparator(CSV_SEPARATOR).build();

        try (CSVReader reader = new CSVReaderBuilder(new FileReader(ExoFileLocation)).withCSVParser(csvParser)
                .build()) {

            List<String[]> fileLineList = reader.readAll();

            for (String[] fileLine : fileLineList) {

               ExerciceTypeModel x = new ExerciceTypeModel();

                x.setName(fileLine[0]);
                

                newWorkout.add(x);


            }
           exerciceRepository.saveAll(newWorkout);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
            // We do nothing John Snow, as this is for Dev DB fill up
        } catch (IOException e) {
            e.printStackTrace();
            // We do nothing John Snow, as this is for Dev DB fill up
        }
    }

}	