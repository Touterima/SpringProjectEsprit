package tn.esprit.springprojectesprit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class SpringProjectEspritApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringProjectEspritApplication.class, args);
    }

}
