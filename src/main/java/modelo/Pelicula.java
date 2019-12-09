package modelo;

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

@Entity
@Table(name = "tb_Pelicula")
public class Pelicula {
	@Id
	@GeneratedValue
	@NotNull
	@Column(name = "pel_id")
	private int id;
	@NotNull
	@Column(name = "pel_sinopsis")
	private  String sinopsis;
	@NotNull
	@Column(name = "pel_nombre")
	private String nombre;
	@NotNull
	@Column(name = "pel_portada")
	private String portada;
	@NotNull
	@Column(name = "pel_anioPublicacion")
	private int añoPublicacion;
	@NotNull
	@Column(name = "pel_precio")
	private double precio;
	@OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	@JoinColumn(name = "pel_id")
	private List<Actor>actores;
	/**
	 * 
	 * @return
	 */
	public List<Actor> getActores() {
		return actores;
	}
	/**
	 * 
	 * @param actores
	 */
	public void setActores(List<Actor> actores) {
		this.actores = actores;
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
	public String getSinopsis() {
		return sinopsis;
	}
	/**
	 * 
	 * @param sinopsis
	 */
	public void setSinopsis(String sinopsis) {
		this.sinopsis = sinopsis;
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
	/**
	 * 
	 * @return
	 */
	public String getPortada() {
		return portada;
	}
	/**
	 * 
	 * @param portada
	 */
	public void setPortada(String portada) {
		this.portada = portada;
	}
	/**
	 * 
	 * @return
	 */
	public int getAñoPublicacion() {
		return añoPublicacion;
	}
	/**
	 * 
	 * @param añoPublicacion
	 */
	public void setAñoPublicacion(int añoPublicacion) {
		this.añoPublicacion = añoPublicacion;
	}
	/**
	 * 
	 * @return
	 */
	public double getPrecio() {
		return precio;
	}
	/**
	 * 
	 * @param precio
	 */
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	//Mostramos la informacion del objeto Pelicula
	@Override
	public String toString() {
		return "Pelicula [id=" + id + ", sinopsis=" + sinopsis + ", nombre=" + nombre + ", portada=" + portada
				+ ", añoPublicacion=" + añoPublicacion + ", precio=" + precio + "]";
	}
	
	
}
