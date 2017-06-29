package entidades.sistema;

import entidades.AbstractEntity;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="anjo_Detalhe_Duvida_2")
public class DetalheDuvida extends AbstractEntity {
	
	private String nome;
	
	private Boolean lista;
	
	private Boolean ativo;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Boolean getLista() {
		return lista;
	}

	public void setLista(Boolean lista) {
		this.lista = lista;
	}	

	public Boolean getAtivo() {
		return ativo;
	}

	public void setAtivo(Boolean ativo) {
		this.ativo = ativo;
	}

}
