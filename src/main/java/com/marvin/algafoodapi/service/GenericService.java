package com.marvin.algafoodapi.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

public interface GenericService<T, ID> {

	
	public JpaRepository<T, ID> getRepository();

	default JpaRepository<T, ID> getRepository(JpaRepository<T, ID> repository) {
		return repository;
	}

	default T salvar(T entidade) {
		return getRepository().save(entidade);
	}

	default Optional<T> buscarPorId(ID id) {
		return getRepository().findById(id);
	}
	
	default List<T> bucarTodos() {
		return getRepository().findAll();
	}
	
	default void deletar(ID id) {
		getRepository().deleteById(id);
	}
	
	
}
