package vista;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.inject.Inject;

import modelo.Director;
import negocio.DirectorON;

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

	public Director getD() {
		return d;
	}

	public void setD(Director d) {
		this.d = d;
	}

	public List<Director> getLista() {
		return lista;
	}

	public void setLista(List<Director> lista) {
		this.lista = lista;
	}
	
	private String guardar() {
		on.guardar(d);
		return null;
	}
	
	private String buscar() {
		int val = d.getId();
		d=on.read(val);
		return null;
		
	}

}
