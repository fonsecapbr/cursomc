package com.nelioalves.cursomc.resources;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.request;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.nelioalves.cursomc.domain.Categoria;

@RestController
@RequestMapping(value="/categorias")
public class CategoriaResource {
	
	@RequestMapping(method=RequestMethod.GET)
	public List<Categoria> Listar() {
		
		Categoria cat1= new Categoria(1,"Informática");
		Categoria cat2= new Categoria(2,"Escritório");
		
 		List<Categoria> Lista = new ArrayList<>();
	    Lista.add(cat1);
	    Lista.add(cat2);
		return Lista;
		
	}

}
