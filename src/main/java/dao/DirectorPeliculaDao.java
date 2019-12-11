package dao;

import java.util.List;

import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.Query;

import modelo.DirectorPelicula;


public class DirectorPeliculaDao {
	@Inject
	private EntityManager em;
	
	public void create (DirectorPelicula dp) {
		em.persist(dp);
	}
	
	public DirectorPelicula read(int id) {
		return em.find(DirectorPelicula.class, id);
	}
	public DirectorPelicula buscardpelicula(int cod) {
		String jpql = "SELECT dp FROM DirectorPelicula dp JOIN FETCH dp where dp.id =:codigo";
		Query query= em.createQuery(jpql,DirectorPelicula.class);
		query.setParameter("codigo", cod);
		DirectorPelicula urs =(DirectorPelicula)query.getSingleResult();
		
		return urs;
	}
	
	public List<DirectorPelicula> getDirectorPelicula(){
		String jpql = "SELECT dp FROM DirectorPelicula dp ";
		
		Query q = em.createQuery(jpql, DirectorPelicula.class);
		
		List<DirectorPelicula> peliculas = q.getResultList();
		return peliculas;
	}

}
