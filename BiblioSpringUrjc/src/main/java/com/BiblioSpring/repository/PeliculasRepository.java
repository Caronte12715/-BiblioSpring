package com.BiblioSpring.repository;

import java.util.Optional;

import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.BiblioSpring.entity.Fanzine;
import com.BiblioSpring.entity.Pelicula;

@CacheConfig(cacheNames="BiblioSpring")
public interface PeliculasRepository extends JpaRepository<Pelicula, Long>, CrudRepository<Pelicula,Long> {
	
	@CacheEvict(allEntries=true)	
	Pelicula save(Pelicula pelicula);
	@Cacheable
	Optional<Pelicula> findByNombre(String nombre);
	@Cacheable
	Optional<Pelicula> deleteByNombre(String nombre);
}
