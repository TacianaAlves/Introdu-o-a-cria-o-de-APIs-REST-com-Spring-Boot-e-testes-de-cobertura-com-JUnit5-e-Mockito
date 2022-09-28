package br.com.tacy.service.impl;

import java.util.Optional;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.tacy.domain.User;
import br.com.tacy.exception.ObjetoNotFoundExecption;
import br.com.tacy.repositories.UserRepository;
import br.com.tacy.service.UserService;

@Service
public class UseServiceImpl  implements UserService{

	@Autowired
	UserRepository repository;
	
	@Override
	public User findById(Integer id) {
		Optional<User> obj = repository.findById(id);
		return obj.orElseThrow(() -> new ObjetoNotFoundExecption("Objeto não encontrado"));
	}

}
