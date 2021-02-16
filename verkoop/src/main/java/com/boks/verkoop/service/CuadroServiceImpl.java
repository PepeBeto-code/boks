package com.boks.verkoop.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.boks.verkoop.entity.Cuadro;
import com.boks.verkoop.repository.CuadroRepository;


@Service
public class CuadroServiceImpl implements CuadroService{
	
	@Autowired
	CuadroRepository cuadroRepository;
	
    public List<Cuadro> findAll(){
      return cuadroRepository.findAll();
    }
    public Cuadro getCuadro(Long id){
      return cuadroRepository.findById(id).orElse(null);
    }
    public Cuadro createCuadro(Cuadro cuadro) {
    	Cuadro cuadroDB =  cuadroRepository.findById(cuadro.getId()).orElse(null);
          if (cuadroDB != null){
              return  cuadroDB;
          }
          cuadroDB = cuadroRepository.save ( cuadro );
          return cuadroDB;
    }
    public Cuadro updateCuadro(Cuadro cuadro) {
    	Cuadro cuadroDB = getCuadro(cuadro.getId());
         if (cuadroDB == null){
             return  null;
         }
         cuadroDB.setDescripcion(cuadro.getDescripcion());
         cuadroDB.setPrecio(cuadro.getPrecio());
         cuadroDB.setFoto(cuadro.getFoto());

         return  cuadroRepository.save(cuadroDB);
    }
    
    public Cuadro deleteCuadro(Cuadro cuadro) {
    	Cuadro cuadrorDB = getCuadro(cuadro.getId());
         if (cuadrorDB ==null){
             return  null;
         }
         return cuadroRepository.save(cuadrorDB);
    }
    

}
