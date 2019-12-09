package dao;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.Query;

import modelo.Categoria;

@Stateless
public class CategoriaDao {
 private EntityManager cm;
 public void save(Categoria c) {
		if(this.read(c.getId())!=null)
			this.update(c);
		else
			this.create(c);
		
	}

	
	public void create(Categoria c) {
		cm.persist(c);
	}
	
	public Categoria read(int id) {
		return cm.find(Categoria.class, id);
	}
	
	public void update(Categoria c) {
		
		cm.merge(c);
	}
	
	public void delete(int id) {
		Categoria c = read(id);
		cm.remove(c);
	}
	
	public List<Categoria> getCategorias(){
		String jpql = "SELECT p FROM Categoria p ";
		
		Query q = cm.createQuery(jpql, Categoria.class);
		
		List<Categoria> categorias = q.getResultList();
		return categorias;
	}
	
	public List<Categoria> getPersonasPorNombre(String filtroBusqued){
		String jpql = "SELECT p FROM Categoria p "
					+ "	WHERE p.nombre LIKE :filtro ";
		
		Query q = cm.createQuery(jpql, Categoria.class);
		q.setParameter("filtro", "%"+filtroBusqued+"%");
		
		List<Categoria> categoria = q.getResultList();
		return categoria;
	}

}
