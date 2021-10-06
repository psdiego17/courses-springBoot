package br.com.cursos.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.cursos.model.Cursos;
import br.com.cursos.repository.CursosRepository;

@RestController
public class CursosController {
	
	
	@Autowired
	private CursosRepository cursosRepository;
	
	@GetMapping("/cursos")
	public List<Cursos> getAll(){
		return cursosRepository.findAll();
	}
	
	@GetMapping("/cursos/{idCurso}")
	public Optional<Cursos> getById(@PathVariable("idCurso") Integer idCurso){
		return cursosRepository.findById(idCurso);
	}
	
	@PostMapping("/cursos")
	Cursos create (@RequestBody Cursos newCursos, Integer idCurso) {
		cursosRepository.save(newCursos);
		return newCursos;
	}
	
	
}
