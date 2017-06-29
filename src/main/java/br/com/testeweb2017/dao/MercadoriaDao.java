package br.com.testeweb2017.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import br.com.testeweb2017.modelo.Mercadoria;

@Repository
@Transactional
public class MercadoriaDao {

	@PersistenceContext
	private EntityManager em;

	public List<Mercadoria> listaMercadoria() {

		String query = "from Mercadoria m ";
		return em.createQuery(query, Mercadoria.class).getResultList();
	}

	public void cadastra(Mercadoria mercadoria) {

		em.persist(mercadoria);
	}

	public void delete(Integer id) {

		Mercadoria mercadoria = em.find(Mercadoria.class, id);
		System.out.println(mercadoria.getNome_mercadoria());
		em.remove(mercadoria);
	}

}
