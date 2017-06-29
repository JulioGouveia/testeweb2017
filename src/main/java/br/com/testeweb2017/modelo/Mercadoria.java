package br.com.testeweb2017.modelo;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Mercadoria")
public class Mercadoria {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer cod_mercadoria;

	private String tipo_mercadoria;
	private String nome_mercadoria;
	private Integer quantidade;
	private BigDecimal preco;

	@Enumerated
	private TipoNegocio tipo_negocio;

	public Integer getCod_mercadoria() {
		
		return cod_mercadoria;
	}

	public void setCod_mercadoria(Integer cod_mercadoria) {
		
		this.cod_mercadoria = cod_mercadoria;
	}

	public String getTipo_mercadoria() {
		
		return tipo_mercadoria;
	}

	public void setTipo_mercadoria(String tipo_mercadoria) {
		
		this.tipo_mercadoria = tipo_mercadoria;
	}

	public String getNome_mercadoria() {
		
		return nome_mercadoria;
	}

	public void setNome_mercadoria(String nome_mercadoria) {
		
		this.nome_mercadoria = nome_mercadoria;
	}

	public Integer getQuantidade() {
		
		return quantidade;
	}

	public void setQuantidade(Integer quantidade) {
		
		this.quantidade = quantidade;
	}

	public BigDecimal getPreco() {
		
		return preco;
	}

	public void setPreco(BigDecimal preco) {
		
		this.preco = preco;
	}

	public TipoNegocio getTipo_negocio() {
		
		return tipo_negocio;
	}

	public void setTipo_negocio(TipoNegocio tipo_negocio) {

		this.tipo_negocio = tipo_negocio;
	}

	@Override
	public String toString() {
		return "Mercadoria [cod_mercadoria=" + cod_mercadoria + ", tipo_mercadoria=" + tipo_mercadoria
				+ ", nome_mercadoria=" + nome_mercadoria + ", quantidade=" + quantidade + ", preco=" + preco
				+ ", tipo_negocio=" + tipo_negocio + "]";
	}

}
