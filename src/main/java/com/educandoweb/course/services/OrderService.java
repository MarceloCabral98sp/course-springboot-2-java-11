package com.educandoweb.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.educandoweb.course.entities.Order;
import com.educandoweb.course.repositories.OrderRepository;


// a camada de serviço é utilizada para armazenar as operações
// que queremos fazer, nela colocamos a regra de negócio deixando a 
// camada controller mais enxuta
@Service // registra service como componente
public class OrderService {

	@Autowired // injeção de dependencia automatica
	private OrderRepository repository;
	
	public List<Order> findAll(){
		return repository.findAll();
	}
	
	public Order findById(Long id) {
		Optional<Order> obj = repository.findById(id);
		return obj.get();
	}
}
