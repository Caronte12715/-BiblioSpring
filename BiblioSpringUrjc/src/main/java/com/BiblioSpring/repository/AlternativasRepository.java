package com.BiblioSpring.repository;

import java.util.Optional;

import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.jpa.repository.JpaRepository;

import com.BiblioSpring.entity.Alternativa;
import com.BiblioSpring.entity.Categoria;

@CacheConfig(cacheNames="BiblioSpring")
public interface AlternativasRepository extends JpaRepository<Alternativa, Long> {
	//Alternativa findByAlternativa(String alternativa);
	@Cacheable
	Optional<Alternativa> findByAlternativa (String alternativa);
}
