package dao;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.Query;

import modelo.Actor;
import modelo.Director;;

@Stateless
public class DirectorDao 
{	@Inject
	private EntityManager dm;
public void create(Director c) {
	dm.persist(c);
}

public Director read(int id) {
	return dm.find(Director.class, id);
}

public void update(Director c) {
	
	dm.merge(c);
}

public void delete(int id) {
	Director c = read(id);
	dm.remove(c);
}

public List<Director> getDirector(){
	String jpql = "SELECT p FROM Director p ";
	
	Query q = dm.createQuery(jpql, Director.class);
	
	List<Director> director = q.getResultList();
	for (Director director2 : director) {
		director2.getDpelicas().size();
		
	}
	return director;
}

public List<Director> getDirectoresPorNombre(String filtroBusqued){
	String jpql = "SELECT p FROM Director p "
				+ "	WHERE p.nombre LIKE :filtro ";
	
	Query q = dm.createQuery(jpql, Director.class);
	q.setParameter("filtro", "%"+filtroBusqued+"%");
	
	List<Director> director = q.getResultList();
	for (Director director2 : director) {
		director2.getDpelicas().size();

	}
	return director;
	}
public Director buscarDirector(int cod) {
	String jpql = "SELECT d FROM Director d JOIN FETCH d where d.id =:codigo";
	Query query= dm.createQuery(jpql,Director.class);
	query.setParameter("codigo", cod);
	Director direc =(Director)query.getSingleResult();

	return direc;
}

}
