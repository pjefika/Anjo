package entidades.sistema;

import entidades.AbstractEntity;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "anjo_Info_Produto")
public class InfoProduto extends AbstractEntity {

    @ManyToOne
    private Produto produto;

    @ManyToOne
    private SubProdutoMotivo subProdutoMotivo;

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public SubProdutoMotivo getSubProdutoMotivo() {
        return subProdutoMotivo;
    }

    public void setSubProdutoMotivo(SubProdutoMotivo subProdutoMotivo) {
        this.subProdutoMotivo = subProdutoMotivo;
    }

}
