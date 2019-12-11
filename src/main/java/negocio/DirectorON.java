package negocio;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;

import dao.DirectorDao;
import modelo.Director;
/**
 * 
 * @author Ruben
 *
 */
@Stateless
public class DirectorON {
	@Inject
	private DirectorDao dao;
	/**
	 * 
	 * @param d
	 */
	public void guardar(Director d) {
		dao.create(d);
	}
	/**
	 * 
	 * @param id
	 * @return
	 */
	public Director read(int id) {
		Director d = dao.buscarDirector(id);
		return d;
	}
	/**
	 * 
	 * @param id
	 */
	public void modificar(int id) {
		Director aux = dao.buscarDirector(id);
		dao.update(aux);
	}
	/**
	 * 
	 * @param id
	 */
	public  void borrar(int id) {
		dao.delete(id);
		
	}
	/**
	 * 
	 * @return
	 */
	public List <Director> getLista(){
		return dao.getDirector();
	}
	
	

}
