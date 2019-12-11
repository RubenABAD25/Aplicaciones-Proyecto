package vista;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.inject.Inject;

import modelo.Usuario;
import negocio.UsuarioON;

@ManagedBean
public class UsuarioBean {
	@Inject
	private UsuarioON on;
	
	private Usuario u;
	
	private List<Usuario> usuarios;
	
	@PostConstruct
	void init() {
		this.u= new Usuario();
	}

	public Usuario getU() {
		return u;
	}

	public void setU(Usuario u) {
		this.u = u;
	}

	public List<Usuario> getUsuarios() {
		return usuarios;
	}

	public void setUsuarios(List<Usuario> usuarios) {
		this.usuarios = usuarios;
	}
	public String guardar() {
		on.guardar(u);
		return null;
		
	}
	public String buscar(){
		int cod = u.getId();
		u= on.buscar(cod);
		return null;
	}
		
	

}
