package br.com.cursos.model;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;



@Entity
public class Cursos {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idCurso;
	private String nomeCurso;
	private int cargaHoraria;
	private double valorCurso;
	private String inicioCurso;
	private String fimCurso;
	
	
	public Cursos() {
			
	}
	
	public Cursos(Integer idCurso, String nomeCurso, int cargaHoraria, 
			double valorCurso, String inicioCurso,
			String fimCurso) {
		super();
		this.idCurso = idCurso;
		this.nomeCurso = nomeCurso;
		this.cargaHoraria = cargaHoraria;
		this.valorCurso = valorCurso;
		this.inicioCurso = inicioCurso;
		this.fimCurso = fimCurso;
	}

	
	
		

	public Integer getdCurso() {
		return idCurso;
	}
	
	/**
	 * 
	 * @param idCurso
	 */
	public void setIdCurso(Integer idCurso) {
		this.idCurso = idCurso;
	}
	
	
	public String getNomeCurso() {
		return nomeCurso;
	}
	
	
	/**
	 * 
	 * @param nomeCurso
	 */
	public void setNomeCurso(String nomeCurso) {
		this.nomeCurso = nomeCurso;
	}
	
	
	public int getCargaHoraria() {
		return cargaHoraria;
	}
	
	/**
	 * 
	 * @param cargaHoraria
	 */
	public void setCargaHoraria(int cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}
	
	
	public double getValorCurso() {
		return valorCurso;
	}
	
	/**
	 * 
	 * @param valorCurso
	 */
	public void setValorCurso(double valorCurso) {
		this.valorCurso = valorCurso;
	}
	
	
	public String getInicioCurso() {
		return inicioCurso;
	}
	
	/**
	 * 
	 * @param inicioCurso
	 */
	public void setInicioCurso(String inicioCurso) {
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

		 String hojeFormatado = inicioCurso.formatted(formatter);
		
		this.inicioCurso = hojeFormatado;
	
	}
	
	
	public String getFimCurso() {
		return fimCurso;
	}
	
	/**
	 * 
	 * @param fimCurso
	 */
	public void setFimCurso(String fimCurso) {
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

		 String hojeFormatado = fimCurso.formatted(formatter);

		this.fimCurso = hojeFormatado;
	}
	
	
}
