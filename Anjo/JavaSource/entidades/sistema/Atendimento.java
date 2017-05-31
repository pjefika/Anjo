package entidades.sistema;

import entidades.AbstractEntity;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import entidades.UsuarioEfika;

@Entity
@Table(name = "anjo_Atendimento")
public class Atendimento extends AbstractEntity {

    private String matriculaOperador;

    private String instancia;

    private String ordem;

    private String codigo;

    private Date dataRegistro;

    private Boolean acionadoSuporte = false;

    private String nomeSuporte;

    private Boolean acionadoFalhaSis = false;

    private String falhaSis;

    private Boolean acionadoFalhaEqp = false;

    private String falhaEqp;

    @Lob
    private String outrasInformacoes;

    @ManyToOne
    private Solucao solucao;

    @ManyToOne
    private InfoEquipamento infoEquipamento;

    @ManyToOne
    private InfoProduto infoProduto;

    @ManyToOne
    private DetalheDuvida detalheDuvida;

    @ManyToOne
    private Duvida duvida;

    @ManyToOne
    private UsuarioEfika usuarioEfika;

    @ManyToOne
    private Transmissao transmissao;

    public String getMatriculaOperador() {
        return matriculaOperador;
    }

    public void setMatriculaOperador(String matriculaOperador) {
        this.matriculaOperador = matriculaOperador;
    }

    public String getInstancia() {
        return instancia;
    }

    public void setInstancia(String instancia) {
        this.instancia = instancia;
    }

    public String getOrdem() {
        return ordem;
    }

    public void setOrdem(String ordem) {
        this.ordem = ordem;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public Date getDataRegistro() {
        return dataRegistro;
    }

    public void setDataRegistro(Date dataRegistro) {
        this.dataRegistro = dataRegistro;
    }

    public Boolean getAcionadoSuporte() {
        return acionadoSuporte;
    }

    public void setAcionadoSuporte(Boolean acionadoSuporte) {
        this.acionadoSuporte = acionadoSuporte;
    }

    public String getNomeSuporte() {
        return nomeSuporte;
    }

    public void setNomeSuporte(String nomeSuporte) {
        this.nomeSuporte = nomeSuporte;
    }

    public Boolean getAcionadoFalhaSis() {
        return acionadoFalhaSis;
    }

    public void setAcionadoFalhaSis(Boolean acionadoFalhaSis) {
        this.acionadoFalhaSis = acionadoFalhaSis;
    }

    public String getFalhaSis() {
        return falhaSis;
    }

    public void setFalhaSis(String falhaSis) {
        this.falhaSis = falhaSis;
    }

    public Solucao getSolucao() {
        return solucao;
    }

    public void setSolucao(Solucao solucao) {
        this.solucao = solucao;
    }

    public InfoEquipamento getInfoEquipamento() {
        return infoEquipamento;
    }

    public void setInfoEquipamento(InfoEquipamento infoEquipamento) {
        this.infoEquipamento = infoEquipamento;
    }

    public DetalheDuvida getDetalheDuvida() {
        return detalheDuvida;
    }

    public void setDetalheDuvida(DetalheDuvida detalheDuvida) {
        this.detalheDuvida = detalheDuvida;
    }

    public UsuarioEfika getUsuarioEfika() {
        return usuarioEfika;
    }

    public void setUsuarioEfika(UsuarioEfika usuarioEfika) {
        this.usuarioEfika = usuarioEfika;
    }

    public Transmissao getTransmissao() {
        return transmissao;
    }

    public void setTransmissao(Transmissao transmissao) {
        this.transmissao = transmissao;
    }

    public InfoProduto getInfoProduto() {
        return infoProduto;
    }

    public void setInfoProduto(InfoProduto infoProduto) {
        this.infoProduto = infoProduto;
    }

    public Duvida getDuvida() {
        return duvida;
    }

    public void setDuvida(Duvida duvida) {
        this.duvida = duvida;
    }

    public Boolean getAcionadoFalhaEqp() {
        return acionadoFalhaEqp;
    }

    public void setAcionadoFalhaEqp(Boolean acionadoFalhaEqp) {
        this.acionadoFalhaEqp = acionadoFalhaEqp;
    }

    public String getFalhaEqp() {
        return falhaEqp;
    }

    public void setFalhaEqp(String falhaEqp) {
        this.falhaEqp = falhaEqp;
    }

    public String getOutrasInformacoes() {
        return outrasInformacoes;
    }

    public void setOutrasInformacoes(String outrasInformacoes) {
        this.outrasInformacoes = outrasInformacoes;
    }

}
