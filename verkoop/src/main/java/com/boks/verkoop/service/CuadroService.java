package com.boks.verkoop.service;

import java.util.List;

import com.boks.verkoop.entity.Cuadro;

public interface CuadroService {
	
    public List<Cuadro> findAll();
    public Cuadro getCuadro(Long id);
    public Cuadro createCuadro(Cuadro cuadro);
    public Cuadro updateCuadro(Cuadro cuadro);
    public Cuadro deleteCuadro(Cuadro cuadro);



}
