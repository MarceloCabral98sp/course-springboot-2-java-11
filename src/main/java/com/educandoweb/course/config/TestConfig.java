package com.educandoweb.course.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.educandoweb.course.entities.User;
import com.educandoweb.course.repositories.UserRepository;

// essa classe tera uma relação de dependencia para a classe UserRepository
// a dependencia deve ser fraca
// @Configuration: informa ao spring que essa é uma classe especifica de configuraçao
@Configuration
@Profile("test") // config especifica para o perfil de teste
public class TestConfig implements CommandLineRunner {
	
	@Autowired // o proprio spring resolve a dependencia
	private UserRepository userRepository;

	@Override
	public void run(String... args) throws Exception {
		
		User u1 = new User(null, "Maria Brown", "maria@gmail.com", "988888888", "123456");
		User u2 = new User(null, "Alex Green", "alex@gmail.com", "977777777", "123456");
	
		userRepository.saveAll(Arrays.asList(u1, u2));
	}
}
