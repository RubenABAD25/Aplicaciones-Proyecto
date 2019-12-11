package negocio;

import java.util.List;

import javax.inject.Inject;

import dao.ActorPeliculaDao;
import modelo.ActorPelicula;

public class ActorPeliculaON {
	@Inject
	private ActorPeliculaDao dao;

	public void guardar(ActorPelicula ap) {
		dao.create(ap);
	}

	public ActorPelicula buscar(int num) {
		return dao.buscar(num);

	}

	public List<ActorPelicula> lista() {
		return dao.getActorPeliculaList();
	}

}
