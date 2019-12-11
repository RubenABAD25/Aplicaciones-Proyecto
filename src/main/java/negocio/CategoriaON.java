package negocio;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;

import dao.CategoriaDao;
import modelo.Categoria;
/**
 * 
 * @author Ruben
 *
 */
@Stateless
public class CategoriaON {
	@Inject
	private CategoriaDao cdao;
	/**
	 * 
	 * @param c
	 */
	public void guardar(Categoria c) {
		cdao.create(c);
	}
	/**
	 * 
	 * @return
	 */
	public List<Categoria>getList(){
		return cdao.getCategorias();
	} 
	/**
	 * 
	 * @param id
	 * @throws Exception
	 */
	public void borar(int id) throws Exception {
		cdao.delete(id);
	}
	/**
	 * 
	 * @param id
	 * @throws Exception
	 */
	public void actualizar(int id)throws Exception{
		Categoria aux = cdao.buscarCategorias(id);
		cdao.update(aux);
	}
	/**
	 * 
	 * @param id
	 * @return
	 */
	public Categoria buscar (int id) {
		
		Categoria aux= cdao.buscarCategorias(id);
		return aux;
	}
	
}
