package com.boks.verkoop.entity;


import java.io.Serializable;
import javax.validation.constraints.NotBlank;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class Cuadro  implements Serializable {/**
	 * 
	 */
	private static final long serialVersionUID = 2L;
	
	 @Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	 private Long id;
	 @NotBlank
	 private String foto;
	 @NotBlank
	 private String descripcion;
	 @NotBlank
	 private int precio;

}
