package vista;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.inject.Inject;

import modelo.Director;
import negocio.DirectorON;
/**
 * 
 * @author Ruben
 *
 */
@ManagedBean
public class DirectorBean {
	@Inject
	private DirectorON on;
	
	private Director d;
	
	private List<Director> lista;
	
	@PostConstruct
	void init() {
		this.d= new Director();
		
	}
    /**
     * 
     * @return
     */
	public Director getD() {
		return d;
	}
	/**
	 * 
	 * @param d
	 */
	public void setD(Director d) {
		this.d = d;
	}
	/**
	 * 
	 * @return
	 */
	public List<Director> getLista() {
		return lista;
	}
	/**
	 * 
	 * @param lista
	 */
	public void setLista(List<Director> lista) {
		this.lista = lista;
	}
	/**
	 * 
	 * @return
	 */
	private String guardar() {
		on.guardar(d);
		return null;
	}
	/**
	 * 
	 * @return
	 */
	private String buscar() {
		int val = d.getId();
		d=on.read(val);
		return null;
		
	}

}
