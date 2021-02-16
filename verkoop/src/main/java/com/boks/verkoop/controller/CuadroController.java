package com.boks.verkoop.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.boks.verkoop.entity.Cuadro;
import com.boks.verkoop.service.CuadroService;

@RestController
@RequestMapping("/boks")
public class CuadroController {
	@Autowired
    CuadroService cuadroService;
	
	 @GetMapping(value = "/{id}")
	    public ResponseEntity<Cuadro> getCustomer(@PathVariable("id") long id) {
		 Cuadro cuadro = cuadroService.getCuadro(id);
	        if (  null == cuadro) {
	            return  ResponseEntity.notFound().build();
	        }
	        return  ResponseEntity.ok(cuadro);
	    }
}
