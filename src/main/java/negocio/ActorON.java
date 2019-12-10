package negocio;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;

import dao.ActorDao;
import modelo.Actor;

@Stateless
public class ActorON 
{
	@Inject
	private ActorDao dao;
	public void guardar(Actor a) throws Exception{
		dao.create(a);
	
	}
	
		public List<Actor> getListadoActores(){
			return dao.getActores();
		}
		
		public void borrar(int codigo) throws Exception {
			try {
				dao.delete(codigo);
			}catch(Exception e) {
				throw new Exception("Error al borrar " + e.getMessage());
			}
			
		}
		
		public Actor getActor(int codigo) {
			Actor aux = dao.read(codigo);
			return aux;
			
		}

}
