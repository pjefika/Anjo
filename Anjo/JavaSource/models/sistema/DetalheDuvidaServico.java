package models.sistema;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import entidades.sistema.DetalheDuvida;

@Stateless
public class DetalheDuvidaServico {

	@PersistenceContext(unitName = "vu")
	private EntityManager entityManager;

	public void cadastrarDetalheDuvida(DetalheDuvida detalheDuvida) throws Exception {

		try {
			
			detalheDuvida.setLista(true);
			this.entityManager.persist(detalheDuvida);

		} catch (Exception e) {

			throw new Exception("Erro ao cadastrar Detalhe da Duvida");

		}

	}
	
	public void cadastrarDetalheDuvidaByUser(DetalheDuvida detalheDuvida) throws Exception {

		try {
			
			detalheDuvida.setLista(false);
			this.entityManager.persist(detalheDuvida);

		} catch (Exception e) {

			throw new Exception("Erro ao cadastrar Detalhe da Duvida");

		}

	}

	public void modificarDetalheDuvida(DetalheDuvida detalheDuvida) throws Exception {

		try {

			this.entityManager.merge(detalheDuvida);

		} catch (Exception e) {

			throw new Exception("Erro ao modificar Detalhe da Duvida");

		}

	}
	
	@SuppressWarnings("unchecked")
	public List<DetalheDuvida> listarDetalheDuvida() {
		
		try {
			
			Query query = this.entityManager.createQuery("FROM DetalheDuvida d");
			return query.getResultList();
			
		} catch (Exception e) {
			
			return new ArrayList<DetalheDuvida>();			
			
		}
		
	}
	
	@SuppressWarnings("unchecked")
	public List<DetalheDuvida> listarDetalheDuvidaLista(Boolean lista, Boolean ativo) {
		
		try {
			
			Query query = this.entityManager.createQuery("FROM DetalheDuvida d WHERE d.lista =:param1 AND d.ativo =:param2 ORDER BY d.nome ASC");
			query.setParameter("param1", lista);
			query.setParameter("param2", ativo);
			return query.getResultList();
			
		} catch (Exception e) {

			return new ArrayList<DetalheDuvida>();
			
		}
		
	}


}
