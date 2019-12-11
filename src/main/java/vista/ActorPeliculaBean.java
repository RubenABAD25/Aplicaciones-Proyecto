package vista;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.inject.Inject;

import modelo.Actor;
import modelo.ActorPelicula;
import modelo.Pelicula;
import negocio.ActorPeliculaON;

@ManagedBean
public class ActorPeliculaBean {

	@Inject
	private ActorBean actorBean;

	@Inject
	private PeliculaBean peliculaBean;

	@Inject
	private ActorPeliculaON autorPeliculaON;

	private Actor actor;
	private Pelicula pelicula;
	private ActorPelicula actorPelicula;

	private List<Actor> actores;
	private List<Pelicula> peliculas;
	private List<ActorPelicula> actorPeliculaList;

	@PostConstruct
	public void init() {
		actores = actorBean.getActores();
		peliculas = peliculaBean.getPelis();
	}
	
	public String guardar() {
		autorPeliculaON.guardar(new ActorPelicula(actor, pelicula));
		return null;
	}

	public Actor getActor() {
		return actor;
	}

	public void setActor(Actor actor) {
		this.actor = actor;
	}

	public Pelicula getPelicula() {
		return pelicula;
	}

	public void setPelicula(Pelicula pelicula) {
		this.pelicula = pelicula;
	}

	public ActorPelicula getActorPelicula() {
		return actorPelicula;
	}

	public void setActorPelicula(ActorPelicula actorPelicula) {
		this.actorPelicula = actorPelicula;
	}

	public List<Actor> getActores() {
		return actores;
	}

	public void setActores(List<Actor> actores) {
		this.actores = actores;
	}

	public List<Pelicula> getPeliculas() {
		return peliculas;
	}

	public void setPeliculas(List<Pelicula> peliculas) {
		this.peliculas = peliculas;
	}

	public List<ActorPelicula> getActorPeliculaList() {
		return actorPeliculaList;
	}

	public void setActorPeliculaList(List<ActorPelicula> actorPeliculaList) {
		this.actorPeliculaList = actorPeliculaList;
	}

}
