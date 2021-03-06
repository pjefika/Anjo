package models.sistema;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import entidades.UsuarioEfika;
import entidades.sistema.Atendimento;

@Stateless
public class AtendimentoServico {

    @PersistenceContext(unitName = "vu")
    private EntityManager entityManager;

    public void cadastrarAtendimento(Atendimento atendimento) throws Exception {

        try {
            Date date = new Date();
            atendimento.setDataRegistro(date);
            atendimento.setMatriculaOperador(atendimento.getMatriculaOperador().toUpperCase());
            this.entityManager.persist(atendimento);
        } catch (Exception e) {

            throw new Exception("Erro ao cadastrar Atendimento");

        }

    }

    public void modificarAtendimento(Atendimento atendimento) throws Exception {
        try {
            this.entityManager.merge(atendimento);
        } catch (Exception e) {
            throw new Exception("Erro ao modificar Atendimento");
        }
    }

    @SuppressWarnings("unchecked")
    public List<Atendimento> listarTodosAtendimentos() {
        try {
            Query query = this.entityManager.createQuery("FROM Atendimento a");
            return query.getResultList();

        } catch (Exception e) {
            return new ArrayList<Atendimento>();
        }

    }

    public Atendimento listarAtendimentoEspecificoUsuario(UsuarioEfika usuarioEfika) throws Exception {

        try {

            Query query = this.entityManager.createQuery("FROM Atendimento a WHERE a.usuarioEfika =:param1");
            query.setParameter("param1", usuarioEfika);
            return (Atendimento) query.getSingleResult();

        } catch (Exception e) {

            throw new Exception("Atendimento específico não existe por favor verifique.");

        }

    }

    @SuppressWarnings("unchecked")
    public List<Atendimento> listarAtendimentosPorData(Date dataInicio, Date dataFim) {

        try {
            Query query = this.entityManager.createQuery("FROM Atendimento a WHERE a.dataRegistro BETWEEN :param1 AND :param2");
            query.setParameter("param1", dataInicio);
            query.setParameter("param2", dataFim);
            return query.getResultList();
        } catch (Exception e) {
            return new ArrayList<Atendimento>();

        }

    }

}
