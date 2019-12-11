package negocio;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;

import dao.UsuarioDao;
import modelo.Usuario;

@Stateless
public class UsuarioON {
	@Inject
	private UsuarioDao udao;
	
	public void guardar(Usuario us) {
		udao.crearUsuario(us);
	}
	public List<Usuario> getUsuarios(){
		return udao.getUsuarios();
	}
	public void eliminar(int cod) {
		udao.borrar(cod);
	}
	public void modificar(int id) {
		udao.actualizarUsr(udao.buscarUsr(id));
	}
	public Usuario buscar(int id) {
		return udao.buscarUsr(id);
	}
	

}
