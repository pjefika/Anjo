package entidades;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "Anjo_Equipe_2")
public class Equipe extends AbstractEntity {

    private String nome;

    private Boolean ativo = false;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Boolean getAtivo() {
        return ativo;
    }

    public void setAtivo(Boolean ativo) {
        this.ativo = ativo;
    }

}
