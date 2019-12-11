package negocio;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;

import dao.PeliculaDao;
import modelo.Pelicula;

@Stateless
public class PeliculaON {
	@Inject
	private PeliculaDao pdao;
	
	public void guaradar(Pelicula p) {
		pdao.crearPelicula(p);
	}
	public void borrar(int id) {
		pdao.eliminar(id);
	}
	public void actualizar(int id) {
		Pelicula p = pdao.buscarPelicula(id);
		pdao.modificar(p.getId());
	}
	public List<Pelicula> getPelicula(){
		return pdao.getPeliculas();
	}
	public Pelicula buscar(int id) {
		return pdao.read(id);
	}
	

}
