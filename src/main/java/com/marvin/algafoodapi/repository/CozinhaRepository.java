package com.marvin.algafoodapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.marvin.algafoodapi.domain.Cozinha;

@Repository
public interface CozinhaRepository extends JpaRepository<Cozinha, Long> {

}
