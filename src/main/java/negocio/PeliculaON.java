package negocio;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;

import dao.PeliculaDao;
import modelo.Pelicula;
/**
 * 
 * @author Ruben
 *
 */
@Stateless
public class PeliculaON {
	@Inject
	private PeliculaDao pdao;
	/**
	 * 
	 * @param p
	 */
	public void guaradar(Pelicula p) {
		pdao.crearPelicula(p);
	}
	/**
	 * 
	 * @param id
	 */
	public void borrar(int id) {
		pdao.eliminar(id);
	}
	/**
	 * 
	 * @param id
	 */
	public void actualizar(int id) {
		Pelicula p = pdao.buscarPelicula(id);
		pdao.modificar(p.getId());
	}
	/**
	 * 
	 * @return
	 */
	public List<Pelicula> getPelicula(){
		return pdao.getPeliculas();
	}
	/**
	 * 
	 * @param id
	 * @return
	 */
	public Pelicula buscar(int id) {
		return pdao.read(id);
	}
	

}
