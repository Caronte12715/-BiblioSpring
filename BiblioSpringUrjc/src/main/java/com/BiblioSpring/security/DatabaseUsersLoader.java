package com.BiblioSpring.security;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.BiblioSpring.entity.User;
import com.BiblioSpring.repository.UserRepository;

@Component
public class DatabaseUsersLoader {

	@Autowired
	private UserRepository userRepository;
	
	@Value("${administrador}")
	private String administrador;

	@PostConstruct
	private void initDatabase() {
		userRepository.save(new User("user", "pass","agustin98@gmail.com","ROLE_USER"));
		userRepository.save(new User("admin", "adminpass", "agustinlg98@gmail.com","ROLE_USER", "ROLE_ADMIN"));
	}

}
