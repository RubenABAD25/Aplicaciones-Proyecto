package vista;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;
import javax.inject.Inject;
import javax.swing.JOptionPane;

import modelo.Director;
import negocio.DirectorON;
/**
 * 
 * @author Ruben
 *
 */
@ManagedBean(name="directorBean")
public class DirectorBean {
	
	@Inject
	private DirectorON on;
	
	@Inject
	private FacesContext fc;
	
	private Director d;
	
	private List<Director> lista;
	
	@PostConstruct
	void init() {
		d = new Director();
		
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
	public String guardar() {
		try {
			System.out.println("entroo");
			//on.guardar(d);
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "error " + e.getMessage());
		}
		
		return null;
	}
	/**
	 * 
	 * @return
	 */
	public String buscar() {
		int val = d.getId();
		d=on.read(val);
		return null;
		
	}
	
	public void validar() {
		System.out.println("entroo");
	}

}
