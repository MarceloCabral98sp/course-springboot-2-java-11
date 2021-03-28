package com.educandoweb.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.educandoweb.course.entities.User;
import com.educandoweb.course.repositories.UserRepository;


// a camada de serviço é utilizada para armazenar as operações
// que queremos fazer, nela colocamos a regra de negócio deixando a 
// camada controller mais enxuta
@Service // registra service como componente
public class UserService {

	@Autowired // injeção de dependencia automatica
	private UserRepository repository;
	
	public List<User> findAll(){
		return repository.findAll();
	}
	
	public User findById(Long id) {
		Optional<User> obj = repository.findById(id);
		return obj.get();
	}
}
