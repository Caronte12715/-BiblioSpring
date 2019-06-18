package com.BiblioSpring.repository;

import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.repository.CrudRepository;

import com.BiblioSpring.entity.Fanzine;
import com.BiblioSpring.entity.User;

@CacheConfig(cacheNames="BiblioSpring")
public interface UserRepository extends CrudRepository<User, Long> {
	
	@CacheEvict(allEntries=true)	
	User save(User user);
	@Cacheable
	User findByName(String name);
	@Cacheable
    User findByEmail(String email);
}
