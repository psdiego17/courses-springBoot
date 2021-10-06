package br.com.cursos.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import br.com.cursos.model.Cursos;

@Repository
public interface CursosRepository extends JpaRepository<Cursos, Integer>{

}
