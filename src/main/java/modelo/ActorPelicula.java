package modelo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotNull;
@Entity
public class ActorPelicula {
	@Id
	@NotNull
	@GeneratedValue
	private int id;
	@OneToOne
	@JoinColumn(name = "actor_id")
	private Actor actor;
	
	@OneToOne
	@JoinColumn(name = "pelicula_id")
	private Pelicula pelicula;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	@Override
	public String toString() {
		return "ActorPelicula [id=" + id + ", actor=" + actor + ", pelicula=" + pelicula + "]";
	}

	

}
