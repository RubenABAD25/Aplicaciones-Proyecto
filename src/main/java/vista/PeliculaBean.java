package vista;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.inject.Inject;

import modelo.Pelicula;
import negocio.PeliculaON;
/**
 * 
 * @author Ruben
 *
 */
@ManagedBean
public class PeliculaBean 
{
	@Inject
	private PeliculaON pon;
	
	private Pelicula p;
	private List<Pelicula> pelis;
	/**
	 * 
	 * @return
	 */
	public Pelicula getP() {
		return p;
	}
	/**
	 * 
	 * @param p
	 */
	public void setP(Pelicula p) {
		this.p = p;
	}
	
	/**
	 * 
	 * @return
	 */
	public List<Pelicula> getPelis() {
		return pelis;
	}
	/**
	 * 
	 * @param pelis
	 */
	public void setPelis(List<Pelicula> pelis) {
		this.pelis = pelis;
	}

	@PostConstruct
	void init() {
		this.p= new Pelicula();
		this.listar();
	}
	/**
	 * Se encarga de guardar  el objeto pelicula
	 * @return
	 */
	public String guardar() {
		pon.guaradar(p);
		return null;
		
	}	
	/**
	 * Se encarga de recuperar una pelicula deacuerdo del id
	 * @return
	 */
	public String buscar() {
		int val =p.getId();
		p=pon.buscar(val);
		return null;
	}
	/**
	 * Se encargar de obtner un listado  de peliculas
	 * @return
	 */
	public String listar() {
		this.pelis=pon.getPelicula();
		return null;
	}

}
