package com.marvin.algafoodapi.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;

import com.marvin.algafoodapi.domain.Cozinha;
import com.marvin.algafoodapi.repository.CozinhaRepository;
import com.marvin.algafoodapi.service.GenericService;

public class CozinhaServiceImpl implements GenericService<Cozinha, Long> {

	@Autowired
	private CozinhaRepository repository;
	
	
	
	@Override
	public JpaRepository<Cozinha, Long> getRepository() {
		return repository;
	}

}
