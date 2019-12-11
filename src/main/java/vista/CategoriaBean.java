package vista;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.inject.Inject;

import modelo.Categoria;
import negocio.CategoriaON;

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

	public Categoria getCat() {
		return cat;
	}

	public void setCat(Categoria cat) {
		this.cat = cat;
	}

	public List<Categoria> getCategoria() {
		return categoria;
	}

	public void setCategoria(List<Categoria> categoria) {
		this.categoria = categoria;
	}
	
	public String  guardar() {
		on.guardar(cat);
		return null;
	}
	
	public String buscar() {
		int val = cat.getId();
		on.buscar(val);
		return null;
	}
	public String Listar() {
		this.categoria=on.getList();
		return null;
	}
}
