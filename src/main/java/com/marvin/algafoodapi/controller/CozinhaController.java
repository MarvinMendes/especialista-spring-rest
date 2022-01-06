package com.marvin.algafoodapi.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.marvin.algafoodapi.domain.Cozinha;
import com.marvin.algafoodapi.service.GenericService;
import com.marvin.algafoodapi.service.impl.CozinhaServiceImpl;

import lombok.Delegate;
import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
@RequestMapping(value = "/cozinhas")
public class CozinhaController {

	@Autowired
	private CozinhaServiceImpl service;
	
	
	@GetMapping
	public List<Cozinha> findAll() {
		return service.bucarTodos();
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Cozinha> findById(@PathVariable Long id) {
		Optional<Cozinha> buscarPorId = service.buscarPorId(id);
		System.out.println(buscarPorId.get().toString());
		return  ResponseEntity.ok(buscarPorId.get()); 			
	}
	
	
	@PostMapping
	public ResponseEntity<Cozinha> create(@RequestBody Cozinha entidade) {
		service.salvar(entidade);
		return ResponseEntity.ok().build();
	}
	
	@DeleteMapping
	public ResponseEntity<Cozinha> delete(@PathVariable Long id) {
		ResponseEntity<Cozinha> findById = findById(id);
		service.deletar(id);
		return ResponseEntity.accepted().body(findById.getBody());
	}
	
}
