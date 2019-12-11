package negocio;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;

import dao.UsuarioDao;
import modelo.Usuario;
/**
 * 
 * @author Ruben
 *
 */
@Stateless
public class UsuarioON {
	@Inject
	private UsuarioDao udao;
	/**
	 * 
	 * @param us
	 */
	public void guardar(Usuario us) {
		udao.crearUsuario(us);
	}
	/**
	 * 
	 * @return
	 */
	public List<Usuario> getUsuarios(){
		return udao.getUsuarios();
	}
	/**
	 * 
	 * @param cod
	 */
	public void eliminar(int cod) {
		udao.borrar(cod);
	}
	/**
	 * 
	 * @param id
	 */
	public void modificar(int id) {
		udao.actualizarUsr(udao.buscarUsr(id));
	}
	/**
	 * 
	 * @param id
	 * @return
	 */
	public Usuario buscar(int id) {
		return udao.buscarUsr(id);
	}
	

}
