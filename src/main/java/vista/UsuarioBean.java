package vista;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.inject.Inject;

import modelo.Usuario;
import negocio.UsuarioON;

@ManagedBean
public class UsuarioBean {
	@Inject
	private UsuarioON on;
	
	private Usuario us;
	private List<Usuario>usuario;
	
	

}
