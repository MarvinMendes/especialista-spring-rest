package com.marvin.algafoodapi.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "TB_FOTO_PRODUTO")
public class FototProduto {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Long id;
	
	@Column(name = "nome_arquivo")
	private String nomeArquivo;
	
	@Column(name = "dsc")
	private String descricao;
	
	@Column(name = "tipo_conteudo")
	private String tipoConteudo;

	@Column(name = "tamanho")
	private Long tamanho;
}
