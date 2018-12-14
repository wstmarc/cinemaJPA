package fr.laerce.cinemaJPA;

import fr.laerce.cinemaJPA.dao.PersonsDao;
import fr.laerce.cinemaJPA.model.Personne;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@SpringBootApplication
public class CinemaApplication {

    public static void main(String[] args) {
        SpringApplication.run(CinemaApplication.class, args);
    }

//    AFFICHAGE DE LA LISTE DES PERSONNES DANS LA CONSOLE
//    ET AJOUT D'UNE PERSONNE A LA BASE
/*    @Bean

    public CommandLineRunner runner(PersonsDao dao){
        return new CommandLineRunner() {
            @Override
            @Transactional
            public void run(String... args) throws Exception {
                List<Persons> persons = dao.getAll();
                for (Persons p: persons
                     ) {
                    System.out.println(p.getSurname());
                }
                Persons person = new Persons();
                person.setSurname("Ventura");
                person.setGivenname("Lino");
                dao.save(person);
            }
        };
    }*/

}

