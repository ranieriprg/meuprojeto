package com.eddieassis.cursospring.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eddieassis.cursospring.domain.Categoria;
import com.eddieassis.cursospring.repositories.CategoriaRepository;
import com.eddieassis.cursospring.services.exception.ObjectNotFoundException;

@Service
public class CategoriaService {

	@Autowired
	private CategoriaRepository repo;
	
	public Categoria buscar(Integer id) {
		Categoria obj = repo.findOne(id);
		if(obj == null) {
			throw new ObjectNotFoundException("Objeto não encontrato! Id: " + id+ ", Tipo: "
					+ Categoria.class.getName());
		}
		return obj;
	}
	
}

