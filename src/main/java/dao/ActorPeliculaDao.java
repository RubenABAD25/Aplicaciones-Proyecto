package dao;

import java.util.List;

import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.Query;

import modelo.ActorPelicula;

public class ActorPeliculaDao {
	@Inject
	private EntityManager em;
	
	public void create (ActorDao ap) {
		em.persist(ap);
	}
	public ActorPelicula buscar(int cod) {
		
		return em.find(ActorPelicula.class, cod);
	}
	public ActorPelicula buscar2(int id) {
		String jpql = "SELECT ap FROM ActorPelicula ap JOIN FETCH dp where ap.id =:codigo";
		Query query= em.createQuery(jpql,ActorPelicula.class);
		query.setParameter("codigo", id);
		ActorPelicula urs =(ActorPelicula)query.getSingleResult();
		return urs;
	}
	public List<ActorPelicula> getActorPelicula(){
		String jpql = "SELECT ap FROM ActorPelicula ap ";
		
		Query q = em.createQuery(jpql, ActorPelicula.class);
		
		List<ActorPelicula> peliculas = q.getResultList();
		return peliculas;
	}
}
