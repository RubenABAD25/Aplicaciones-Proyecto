package vista;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.inject.Inject;

import modelo.Categoria;
import negocio.CategoriaON;
/**
 * 
 * @author Ruben
 *
 */
@ManagedBean
public class CategoriaBean {
	@Inject
	private CategoriaON on;
	
	private Categoria cat;
	
	private List<Categoria> categoria;
	
	@PostConstruct
	void init() {
		cat= new  Categoria();
		this.Listar();
	}
	/**
	 * 
	 * @return
	 */
	public Categoria getCat() {
		return cat;
	}
	/**
	 * 
	 * @param cat
	 */
	public void setCat(Categoria cat) {
		this.cat = cat;
	}
	/**
	 * 
	 * @return
	 */
	public List<Categoria> getCategoria() {
		return categoria;
	}
	/**
	 * 
	 * @param categoria
	 */
	public void setCategoria(List<Categoria> categoria) {
		this.categoria = categoria;
	}
	/**
	 * 
	 * @return
	 */
	public String  guardar() {
		on.guardar(cat);
		return null;
	}
	/**
	 * 
	 * @return
	 */
	public String buscar() {
		int val = cat.getId();
		on.buscar(val);
		return null;
	}
	/**
	 * 
	 * @return
	 */
	public String Listar() {
		this.categoria=on.getList();
		return null;
	}
}
