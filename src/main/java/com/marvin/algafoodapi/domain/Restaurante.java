package com.marvin.algafoodapi.domain;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;


@Data
@Entity
@AllArgsConstructor
@Table(name = "TB_RESTAURANTE")
public class Restaurante {

	@Id
	private Long id;
	
	private String nome;
	
	private BigDecimal taxaFrete;
	
	private Boolean ativo;
	
	private Boolean aberto;
	
	private LocalDateTime dataCadastro = LocalDateTime.now() ;
	
	private LocalDateTime dataAtualizacao;
	
	/*@ManyToOne(cascade = CascadeType.ALL)
	private Cozinha cozinha;*/
	
	@OneToMany
	private Set<FormaPagamento> pagamentos;
	
	@OneToMany
	private Set<Produto> produtos;
	
	
}
