package vista;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.inject.Inject;

import modelo.Usuario;
import negocio.UsuarioON;
/**
 * 
 * @author Ruben
 *
 */
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
	/**
	 * 
	 * @return
	 */
	public Usuario getU() {
		return u;
	}
	/**
	 * 
	 * @param u
	 */
	public void setU(Usuario u) {
		this.u = u;
	}
	/**
	 * 
	 * @return
	 */
	public List<Usuario> getUsuarios() {
		return usuarios;
	}
	/***
	 * 
	 * @param usuarios
	 */
	public void setUsuarios(List<Usuario> usuarios) {
		this.usuarios = usuarios;
	}
	/**
	 * Se encarga de guardar el usuario
	 * @return
	 */
	public String guardar() {
		on.guardar(u);
		return null;
		
	}
	/**
	 * Se encarga  de buscar el usuario segun el id
	 * @return
	 */
	public String buscar(){
		int cod = u.getId();
		u= on.buscar(cod);
		return null;
	}
		
	

}
