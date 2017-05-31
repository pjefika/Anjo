package entidades.sistema;

import entidades.AbstractEntity;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "anjo_Duvida")
public class Duvida extends AbstractEntity implements Comparable<Duvida> {

    private String nome;

    private Boolean lista;

    private Boolean ativo = false;

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

    @Override
    public int compareTo(Duvida d) {
        //ascending order
        return this.nome.toUpperCase().compareTo(d.getNome().toUpperCase());
    }

}
