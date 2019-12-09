package dao;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.Query;

import modelo.Director;;

@Stateless
public class DirectorDao 
{	@Inject
	private EntityManager dm;
public void save(Director d) {
	if(this.read(d.getId())!=null)
		this.update(d);
	else
		this.create(d);
	
}


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

public List<Director> getCategorias(){
	String jpql = "SELECT p FROM Director p ";
	
	Query q = dm.createQuery(jpql, Director.class);
	
	List<Director> categorias = q.getResultList();
	return categorias;
}

public List<Director> getPersonasPorNombre(String filtroBusqued){
	String jpql = "SELECT p FROM Director p "
				+ "	WHERE p.nombre LIKE :filtro ";
	
	Query q = dm.createQuery(jpql, Director.class);
	q.setParameter("filtro", "%"+filtroBusqued+"%");
	
	List<Director> categoria = q.getResultList();
	return categoria;
}
}
