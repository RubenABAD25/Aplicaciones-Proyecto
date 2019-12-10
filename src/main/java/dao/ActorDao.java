package dao;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.Query;

import modelo.Actor;

public class ActorDao 
{
	@Inject
	private EntityManager em;
	public void save(Actor a) {
		if(this.read(a.getId())!=null)
			this.update(a);
		else
			this.create(a);
		
	}

	
	public void create(Actor a) {
		System.out.println("dao " + a);
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
		return actores;
	}
	
	public List<Actor> getPersonasPorNombre(String filtroBusqued){
		String jpql = "SELECT p FROM Actor p "
					+ "	WHERE p.nombres LIKE :filtro ";
		
		Query q = em.createQuery(jpql, Actor.class);
		q.setParameter("filtro", "%"+filtroBusqued+"%");
		
		List<Actor> actores = q.getResultList();
		return actores;
	}

}
