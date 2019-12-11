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
	private int añoPublicacion;
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
	
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getSinopsis() {
		return sinopsis;
	}
	public void setSinopsis(String sinopsis) {
		this.sinopsis = sinopsis;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getPortada() {
		return portada;
	}
	public void setPortada(String portada) {
		this.portada = portada;
	}
	public int getAñoPublicacion() {
		return añoPublicacion;
	}
	public void setAñoPublicacion(int añoPublicacion) {
		this.añoPublicacion = añoPublicacion;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public List<ActorPelicula> getApeliculas() {
		return apeliculas;
	}
	public void setApeliculas(List<ActorPelicula> apeliculas) {
		this.apeliculas = apeliculas;
	}
	public Categoria getUnaCategoria() {
		return unaCategoria;
	}
	public void setUnaCategoria(Categoria unaCategoria) {
		this.unaCategoria = unaCategoria;
	}
	public List<DirectorPelicula> getDpelicas() {
		return dpelicas;
	}
	public void setDpelicas(List<DirectorPelicula> dpelicas) {
		this.dpelicas = dpelicas;
	}
	public void agregarActorPelicula(ActorPelicula ap)
	{
		if(ap == null) {
			apeliculas= new ArrayList<ActorPelicula>();
		}
		this.apeliculas.add(ap);
	}
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
				+ ", añoPublicacion=" + añoPublicacion + ", precio=" + precio + ", apeliculas=" + apeliculas
				+ ", unaCategoria=" + unaCategoria + ", dpelicas=" + dpelicas + "]";
	}
}
