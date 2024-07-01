package dio.aula_spring_jpa;

import dio.aula_spring_jpa.model.AppUser;
import dio.aula_spring_jpa.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class StartApp implements CommandLineRunner {
    @Autowired
    private UserRepository userRepository;

    @Override
    public void run(String... args) throws Exception {

        List<AppUser> users = userRepository.findByNameContaining("kaua");
        for(AppUser u: userRepository.findAll()){
            System.out.println(u);
        }
    }
    private void insertUser(){
        AppUser user = new AppUser();
        user.setName("kaua valdevino");
        user.setUsername("kaua123");
        user.setPassword("123");

        userRepository.save(user);
    }
}
