package com.eumemu.DataJPATeste;

import com.eumemu.DataJPATeste.model.User;
import com.eumemu.DataJPATeste.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class StartApp implements CommandLineRunner {
    @Autowired
    private UserRepository repository;

    @Override
    public void run(String... args) throws Exception {
        User user = new User();
        user.setName("Cleber");
        user.setUsername("clebin123");
        user.setPassword("Dio123");
        repository.save(user);

        for(User u: repository.findAll()){
            System.out.println(u);
        }
    }
}
