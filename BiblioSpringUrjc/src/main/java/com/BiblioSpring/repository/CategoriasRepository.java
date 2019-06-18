package com.BiblioSpring.repository;

import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.BiblioSpring.entity.Categoria;
import com.BiblioSpring.entity.Fanzine;

@Repository
@CacheConfig(cacheNames="BiblioSpring")
public interface CategoriasRepository extends JpaRepository<Categoria, Long> {
	
	@CacheEvict(allEntries=true)	
	Categoria save(Categoria categoria);
	@Cacheable
	Categoria findByArea(String area);

}
