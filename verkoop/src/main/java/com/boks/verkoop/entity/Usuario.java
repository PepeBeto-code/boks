package com.boks.verkoop.entity;
import javax.persistence.Entity;
import javax.persistence.FetchType;

import java.io.Serializable;

import javax.persistence.Column;


import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Entity
@Data
public class Usuario implements Serializable{/**
	 * 
	 */
	private static final long serialVersionUID = 4L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(name = "nombre_usuario")
	private String nombre;
	
	private String password;
	
	@JsonProperty("tipo")
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="tipo_usuario")
	private TipoUsuario tipoUsuario;

}
