package negocio;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;

import dao.CategoriaDao;
import modelo.Categoria;

@Stateless
public class CategoriaON {
	@Inject
	private CategoriaDao cdao;
	
	public void guardar(Categoria c) {
		cdao.create(c);
	}
	
	public List<Categoria>getList(){
		return cdao.getCategorias();
	} 
	public void borar(int id) throws Exception {
		cdao.delete(id);
	}
	public void actualizar(int id)throws Exception{
		Categoria aux = cdao.buscarCategorias(id);
		cdao.update(aux);
	}
	public Categoria buscar (int id) {
		
		Categoria aux= cdao.buscarCategorias(id);
		return aux;
	}
	
}
