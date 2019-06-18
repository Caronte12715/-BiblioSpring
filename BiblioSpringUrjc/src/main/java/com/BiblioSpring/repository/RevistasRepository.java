package com.BiblioSpring.repository;
import java.util.Optional;

import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.BiblioSpring.entity.Fanzine;
import com.BiblioSpring.entity.Pelicula;
import com.BiblioSpring.entity.Revista;

@CacheConfig(cacheNames="BiblioSpring")
public interface RevistasRepository extends JpaRepository<Revista,Long>, CrudRepository<Revista,Long>{
	
	@CacheEvict(allEntries=true)	
	Revista save(Revista revista);
	@Cacheable
	Optional<Revista> findByNombre(String nombre);
	@Cacheable
	Optional<Revista> findByAno(Integer ano);
	@Cacheable
	Optional<Revista> deleteByNombre(String nombre);
}
