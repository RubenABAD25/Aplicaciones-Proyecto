package vista;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.inject.Inject;

import modelo.Pelicula;
import negocio.PeliculaON;

@ManagedBean
public class PeliculaBean 
{
	@Inject
	private PeliculaON pon;
	
	private Pelicula p;
	private List<Pelicula> pelis;
	
	public Pelicula getP() {
		return p;
	}

	public void setP(Pelicula p) {
		this.p = p;
	}
	
	
	public List<Pelicula> getPelis() {
		return pelis;
	}

	public void setPelis(List<Pelicula> pelis) {
		this.pelis = pelis;
	}

	@PostConstruct
	void init() {
		this.p= new Pelicula();
		this.listar();
	}
	public String guardar() {
		pon.guaradar(p);
		return null;
		
	}	
	public String buscar() {
		int val =p.getId();
		p=pon.buscar(val);
		return null;
	}
	public String listar() {
		this.pelis=pon.getPelicula();
		return null;
	}

}
