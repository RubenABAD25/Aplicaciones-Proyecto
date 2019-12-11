package dao;

import java.util.List;

import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.Query;

import modelo.Actor;
import modelo.Usuario;

public class UsuarioDao {
	@Inject
	private EntityManager em;
	
	public void crearUsuario(Usuario usr) {
		em.persist(usr);
		
		}
	public void actualizarUsr(Usuario usr) {
		em.merge(usr);	
	}
	public Usuario read(int id) {
		return em.find(Usuario.class, id);
	}
	public void borrar(int id) {
		em.remove(read(id));
	}
	public Usuario buscarUsr(int cod) {
		String jpql = "SELECT u FROM Usuario u JOIN FETCH u where u.id =:codigo";
		Query query= em.createQuery(jpql,Usuario.class);
		query.setParameter("codigo", cod);
		Usuario urs =(Usuario)query.getSingleResult();
		
		return urs;
	}
	
	public List<Usuario> getUsuarios(){
		String jpql = "SELECT p FROM Usuario p ";
		
		Query q = em.createQuery(jpql, Usuario.class);
		
		List<Usuario> usuarios = q.getResultList();
		
		return usuarios;
	}
	
}
