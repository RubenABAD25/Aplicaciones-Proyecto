package modelo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
/**
 * 
 * @author Ruben
 *
 */
@Entity
public class Categoria {
	@Id
	@GeneratedValue
	@NotNull
	@Column(name = "cat_id")
	private int id;
	@NotNull
	@Column(name = "cat_fecha")
	private Date Fecha;
	@NotNull
	@Column(name = "cat_nombre")
	private String nombre;
	@OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinColumn(name = "categoria_id")
	List<Pelicula>peliculas;
	/**
	 * 
	 * @return
	 */
	public List<Pelicula> getPeliculas() {
		return peliculas;
	}
	/**
	 * 
	 * @param peliculas
	 */
	public void setPeliculas(List<Pelicula> peliculas) {
		this.peliculas = peliculas;
	}
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
	public Date getFecha() {
		return Fecha;
	}
	/**
	 * 
	 * @param fecha
	 */
	public void setFecha(Date fecha) {
		Fecha = fecha;
	}
	/**
	 * 
	 * @return
	 */
	public String getNombre() {
		return nombre;
	}
	/**
	 * 
	 * @param nombre
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	//Mostramos la informacion del objeto Categoria
	@Override
	public String toString() {
		return "Categoria [id=" + id + ", Fecha=" + Fecha + ", nombre=" + nombre + "]";
	}
	public void agregarPeliculas(Pelicula pe)
	{
		if(pe == null) {
			peliculas= new ArrayList<Pelicula>();
		}
		this.peliculas.add(pe);
	}
}
