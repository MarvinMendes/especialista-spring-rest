package com.marvin.algafoodapi.domain;

import java.math.BigDecimal;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "TB_PRODUTOS")
public class Produto {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Long id;
	
	@Column(name = "nome_produto")
	private String nome;
	
	@Column(name = "dsc")
	private String descricao;
	
	@Column(name = "preco_produto")
	private BigDecimal preco;
	
	private Boolean ativo;
	
	@ManyToOne(cascade = CascadeType.ALL)
	private Restaurante restaurante;

	@OneToOne
	private FototProduto foto;
	
}
