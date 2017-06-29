package entidades.sistemainc;

import entidades.AbstractEntity;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import entidades.UsuarioEfika;
import util.JSFUtil;

@Entity
@Table(name = "anjo_Atendimento_inc_2")
public class AtendimentoInc extends AbstractEntity {

    private String numero;

    private Boolean priorizado;

    private Boolean contatoTec;

    @Lob
    private String informacoes;

    private Date horaGeradoInc;

    private Date dataRegistro;

    @ManyToOne
    private UsuarioEfika usuarioEfika;

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public Boolean getPriorizado() {
        return priorizado;
    }

    public void setPriorizado(Boolean priorizado) {
        this.priorizado = priorizado;
    }

    public Boolean getContatoTec() {
        return contatoTec;
    }

    public void setContatoTec(Boolean contatoTec) {
        this.contatoTec = contatoTec;
    }

    public String getInformacoes() {
        return informacoes;
    }

    public void setInformacoes(String informacoes) {
        this.informacoes = informacoes;
    }

    public Date getHoraGeradoInc() {
        return horaGeradoInc;
    }

    public String getHoraGeradoIncFormatada() {

        return JSFUtil.formatarDataHra(this.horaGeradoInc);

    }

    public void setHoraGeradoInc(Date horaGeradoInc) {
        this.horaGeradoInc = horaGeradoInc;
    }

    public Date getDataRegistro() {
        return dataRegistro;
    }

    public String getDataRegistroFormatada() {

        return JSFUtil.formatarDataHra(this.dataRegistro);

    }

    public void setDataRegistro(Date dataRegistro) {
        this.dataRegistro = dataRegistro;
    }

    public UsuarioEfika getUsuarioEfika() {
        return usuarioEfika;
    }

    public void setUsuarioEfika(UsuarioEfika usuarioEfika) {
        this.usuarioEfika = usuarioEfika;
    }

}
