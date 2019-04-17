package com.BiblioSpring.repository;

import org.springframework.cache.annotation.CacheConfig;
import org.springframework.data.jpa.repository.JpaRepository;

import com.BiblioSpring.entity.Contacto;

@CacheConfig(cacheNames="BiblioSpring")
public interface ContactosRepository extends JpaRepository<Contacto, Long> {

}