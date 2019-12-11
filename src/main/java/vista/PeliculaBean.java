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
	
	@PostConstruct
	void init() {
		this.p= new Pelicula();
		
		
	}

}
