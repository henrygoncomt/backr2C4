package co.edu.usa.ciclo3;

import co.edu.usa.ciclo3.repository.crud.FootwearsCrudRepository;
import co.edu.usa.ciclo3.repository.crud.UserCrudRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;

@Component
@SpringBootApplication
public class Ciclo3Application implements CommandLineRunner{
        @Autowired
        private UserCrudRepository userCrudRepository;
        @Autowired
        private FootwearsCrudRepository footwearsCrudRepository;
	public static void main(String[] args) {
            SpringApplication.run(Ciclo3Application.class, args);
	}
        
        @Override
        public void run(String...  args) throws Exception{
            userCrudRepository.deleteAll();
            footwearsCrudRepository.deleteAll();
        }

}
