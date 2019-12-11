package negocio;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;

import dao.ActorDao;
import modelo.Actor;
/**
 * 
 * @author Ruben
 *
 */
@Stateless
public class ActorON 
{
	@Inject
	private ActorDao dao;
	/**
	 * 
	 * @param a
	 * @throws Exception
	 */
	public void guardar(Actor a) throws Exception{
			dao.create(a);		
		}
		
		/**
		 * 
		 * @return
		 */
		public List<Actor> getListadoActores(){
			return dao.getActores();
		}
		/**
		 * 
		 * @param codigo
		 * @throws Exception
		 */
		public void borrar(int codigo) throws Exception {
			try {
				dao.delete(codigo);
			}catch(Exception e) {
				throw new Exception("Error al borrar " + e.getMessage());
			}
			
		}
		/**
		 * 
		 * @param codigo
		 * @return
		 * @throws Exception
		 */
		
		public Actor getActor(int codigo) throws Exception{
			Actor aux = dao.read(codigo);
			return aux;
			
		}
		/**
		 * 
		 * @param id
		 * @throws Exception
		 */
		public void modificar(int id) throws Exception{
			 Actor aux = dao.buscarActor(id);
			dao.update(aux);
		}

}
