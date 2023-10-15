package tech.dexdev.univorgmanagement.univ;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import static tech.dexdev.univorgmanagement.univ.Gender.*;
import static tech.dexdev.univorgmanagement.univ.Section.*;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {
            Student dexter = new Student (
                    "2019-00080-ST-0",
                    "Dexter",
                    "Pelaez",
                    "Astorga",
                    "dexterpelaez12@gmail.com",
                    MALE,
                    LocalDate.of(2000, Month.JULY, 22),
                    "09774416103",
                    "Santiago",
                    "Sto. Tomas",
                    BSECE_4_1
            );

            Student gracie = new Student (
                    "2019-00481-ST-0",
                    "Gracie",
                    "",
                    "Luigi",
                    "gracie@yahoo.com",
                    FEMALE,
                    LocalDate.of(2000, Month.AUGUST, 12),
                    "09234416323",
                    "San Rafael",
                    "Sto. Tomas",
                    BSECE_3_1
            );

            repository.saveAll(List.of(dexter, gracie));
        };
    }
}
