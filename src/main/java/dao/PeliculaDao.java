package dao;

import java.util.List;

import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.Query;

import modelo.Pelicula;

public class PeliculaDao {
	@Inject
	private EntityManager em;
	public void crearPelicula(Pelicula p) {
		em.persist(p);
	}
	public Pelicula read(int id) {
		return em.find(Pelicula.class, id);
	}
	public void modificar(int id) {
		em.merge(read(id));
	}
	public void eliminar(int id) {
		em.remove(read(id));
	}
	public Pelicula buscarPelicula(int cod) {
		String jpql = "SELECT p FROM Pelicula p JOIN FETCH a where p.id =:codigo";
		Query query= em.createQuery(jpql,Pelicula.class);
		query.setParameter("codigo", cod);
		Pelicula act =(Pelicula)query.getSingleResult();

		return act;
	}
	public List<Pelicula> getPeliculas(){
		String jpql = "SELECT p FROM Pelicula p ";
		
		Query q = em.createQuery(jpql, Pelicula.class);
		
		List<Pelicula> peliculas = q.getResultList();
		for (Pelicula pelis : peliculas) {
			pelis.getDpelicas().size();
			
		}
		return peliculas;
	}

}
