package com.BiblioSpring.controllers;

import java.util.Date;

import com.BiblioSpring.entity.Alternativa;
import com.BiblioSpring.entity.Fanzine;
import com.BiblioSpring.entity.Pelicula;

import javax.annotation.PostConstruct;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.BiblioSpring.repository.AlternativasRepository;
import com.BiblioSpring.repository.PeliculasRepository;


@Controller
public class PeliculaController {
	
	
	@Autowired
	private PeliculasRepository repository;
	@Autowired
	private AlternativasRepository repositoryAlt;

	@SuppressWarnings("deprecation")
	@PostConstruct
	public void init() {
		repository.save(new Pelicula("Avatar",2000,"Austria"));
		repository.save(new Pelicula("La última canción",2008, "Inglaterra"));
	}
	
	@RequestMapping("/BiblioSpring/Pelicula/buscar_Pelicula")
	public String verFanzinePorNombre(Model model, HttpServletRequest request, @RequestParam String nombre) {

		model.addAttribute("peliculas", repository.findByNombre(nombre).get());
		model.addAttribute("admin", request.isUserInRole("ADMIN"));
		model.addAttribute("user", request.isUserInRole("USER"));

		return "ver_Pelicula";
	}

	@RequestMapping("/BiblioSpring/Pelicula/AddPelicula")
	public String AnadirPelicula(Model model, Pageable page) {
		return "AddPelicula";
	}

	@RequestMapping("/BiblioSpring/Pelicula/nueva")
	public String nuevaPelicula(Model model, Pelicula pelicula) {

		repository.save(pelicula);

		return "pelicula_guardada";

	}

	@RequestMapping("/BiblioSpring/Pelicula/ver_Pelicula")
	public String viewPelicula(Model model, Pageable page) {

		model.addAttribute("peliculas", repository.findAll(page));

		return "ver_Pelicula";
	}
	/*
	 * @RequestMapping("/Pelicula")
	public String Pelicula(Model model, Pageable page) {
		model.addAttribute("alternativas", repositoryAlt.findAll(page));
		return "Pelicula";
	}
		
	 */

}
