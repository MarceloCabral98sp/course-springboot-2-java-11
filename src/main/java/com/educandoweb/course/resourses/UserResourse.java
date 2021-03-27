package com.educandoweb.course.resourses;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.educandoweb.course.entities.User;

// implementando o REST
@RestController
@RequestMapping(value = "/users")
public class UserResourse {

	// método endpoit para acessar os usuários
	@GetMapping //get http
	public ResponseEntity<User> findAll(){
		User u = new User(1L, "Marcelo", "marcelo@gmail.com", "12345678", "1234");
		return ResponseEntity.ok().body(u);
	}
}
