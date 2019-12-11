package modelo;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
/**
 * 
 * @author Ruben
 *
 */
@Entity
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
	private int aniooPublicacion;
	@NotNull
	@Column(name = "pel_precio")
	private double precio;
	
	@OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinColumn(name = "pelicula_id")
	private List<ActorPelicula> apeliculas;
	
	@OneToOne
	@JoinColumn(name = "categoria_id")
	private Categoria unaCategoria;
	
	@OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinColumn(name = "pelc_id")
	private List<DirectorPelicula>dpelicas;
	
	
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
	public int getAniooPublicacion() {
		return aniooPublicacion;
	}
	/**
	 * 
	 * @param aniooPublicacion
	 */
	public void setAniooPublicacion(int aniooPublicacion) {
		this.aniooPublicacion = aniooPublicacion;
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
	/**
	 * 
	 * @return
	 */
	public List<ActorPelicula> getApeliculas() {
		return apeliculas;
	}
	/**
	 * 
	 * @param apeliculas
	 */
	public void setApeliculas(List<ActorPelicula> apeliculas) {
		this.apeliculas = apeliculas;
	}
	/**
	 * 
	 * @return
	 */
	public Categoria getUnaCategoria() {
		return unaCategoria;
	}
	/**
	 * 
	 * @param unaCategoria
	 */
	public void setUnaCategoria(Categoria unaCategoria) {
		this.unaCategoria = unaCategoria;
	}
	/**
	 * 
	 * 
	 * 
	 * @return
	 */
	public List<DirectorPelicula> getDpelicas() {
		return dpelicas;
	}
	/**
	 * 
	 * @param dpelicas
	 */
	public void setDpelicas(List<DirectorPelicula> dpelicas) {
		this.dpelicas = dpelicas;
	}
	/**
	 * 
	 * @param ap
	 */
	public void agregarActorPelicula(ActorPelicula ap)
	{
		if(ap == null) {
			apeliculas= new ArrayList<ActorPelicula>();
		}
		this.apeliculas.add(ap);
	}
	/**
	 * 
	 * @param dp
	 * Metodo se encargara de crear o almacenar dentro de la lista
	 */
	public void agregarDirectorPelicula(DirectorPelicula dp)
	{
		if(dp == null) {
			dpelicas= new ArrayList<DirectorPelicula>();
		}
		this.dpelicas.add(dp);
	}
	@Override
	public String toString() {
		return "Pelicula [id=" + id + ", sinopsis=" + sinopsis + ", nombre=" + nombre + ", portada=" + portada
				+ ", aniooPublicacion=" + aniooPublicacion + ", precio=" + precio + ", apeliculas=" + apeliculas
				+ ", unaCategoria=" + unaCategoria + ", dpelicas=" + dpelicas + "]";
	}
	
}
