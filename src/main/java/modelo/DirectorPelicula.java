package modelo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotNull;
/**
 * 
 * @author Ruben
 *
 */
@Entity
public class DirectorPelicula {
	@Id
	@NotNull
	@GeneratedValue
	private int id;
	@OneToOne
	@JoinColumn(name = "director_id")
	private Director director;
	@OneToOne
	@JoinColumn(name = "pelc_id")
	private Pelicula pelicula;
	
	/**
	 * 
	 * @return
	 */
	public int getId() {
		return id;
	}
	/**
	 * 
	 * @param id
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * 
	 * @return
	 */
	public Director getDirector() {
		return director;
	}
	/**
	 * 
	 * @param director
	 */
	public void setDirector(Director director) {
		this.director = director;
	}
	/**
	 * 
	 * @return
	 */
	public Pelicula getPelicula() {
		return pelicula;
	}
	/**
	 * 
	 * @param pelicula
	 */
	public void setPelicula(Pelicula pelicula) {
		this.pelicula = pelicula;
	}
	@Override
	public String toString() {
		return "DirectorPelicula [id=" + id + ", director=" + director + ", pelicula=" + pelicula + "]";
	}
	
	
	

}
