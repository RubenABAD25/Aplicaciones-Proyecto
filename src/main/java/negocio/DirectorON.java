package negocio;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;

import dao.DirectorDao;
import modelo.Director;

@Stateless
public class DirectorON {
	@Inject
	private DirectorDao dao;
	
	public void guardar(Director d) {
		dao.create(d);
	}
	
	public Director read(int id) {
		Director d = dao.buscarDirector(id);
		return d;
	}
	
	public void modificar(int id) {
		Director aux = dao.buscarDirector(id);
		dao.update(aux);
	}
	public  void borrar(int id) {
		dao.delete(id);
		
	}
	
	public List <Director> getLista(){
		return dao.getDirector();
	}
	
	

}
