package dao;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.Query;

import modelo.Actor;
import modelo.Categoria;

public class ActorDao 
{
	@Inject
	private EntityManager em;
	
	public void create(Actor a) {
		em.persist(a);
	}
	
	public Actor read(int id) {
		return em.find(Actor.class, id);
	}
	
	public void update(Actor a) {
		
		em.merge(a);
	}
	
	public void delete(int id) {
		Actor a = read(id);
		em.remove(a);
	}
	
	public List<Actor> getActores(){
		String jpql = "SELECT p FROM Actor p ";
		
		Query q = em.createQuery(jpql, Actor.class);
		
		List<Actor> actores = q.getResultList();
		for (Actor actor : actores) {
			actor.getLista().size();
			
		}
		return actores;
	}
	
	public List<Actor> getActoresPorFiltro(String filtroBusqued){
		String jpql = "SELECT p FROM Actor p "
					+ "	WHERE p.nombres LIKE :filtro ";
		
		Query q = em.createQuery(jpql, Actor.class);
		q.setParameter("filtro", "%"+filtroBusqued+"%");
		
		List<Actor> actores = q.getResultList();
		for (Actor actor : actores) {
			actor.getLista().size();
			
		}
		return actores;
	}
	public Actor buscarActor(int cod) {
		String jpql = "SELECT a FROM Actor a JOIN FETCH a where a.id =:codigo";
		Query query= em.createQuery(jpql,Actor.class);
		query.setParameter("codigo", cod);
		Actor act =(Actor)query.getSingleResult();

		return act;
	}

}
