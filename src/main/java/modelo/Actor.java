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
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
/**
 * 
 * @author Ruben
 *
 */
@Entity
public class Actor 
{
	@Id
	@GeneratedValue
	@NotNull
	@Column(name = "ac_id")
	private int id;
	@NotNull
	@Column(name = "ac_nombres")
	private String nombres;
	@NotNull
	@Column(name = "ac_apellidos")
	private String apellidos;
	@NotNull
	@Column(name = "ac_nacionalidad")
	private String nacionalidad;
	@NotNull
	@Column(name = "ac_fechaN")
	private String fechaN;
	
	@OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinColumn(name = "actor_id")
	private List<ActorPelicula> apeliculas;
	/**
	 * 
	 * @return
	 */
	public List<ActorPelicula> getLista() {
		return apeliculas;
	}
	/**
	 * 
	 * @param lista
	 */
	public void setLista(List<ActorPelicula> lista) {
		this.apeliculas = lista;
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
	public String getNombres() {
		return nombres;
	}
	/**
	 * 
	 * @param nombres
	 */
	public void setNombres(String nombres) {
		this.nombres = nombres;
	}
	/**
	 * 
	 * @return
	 */
	public String getApellidos() {
		return apellidos;
	}
	/**
	 * 
	 * @param apellidos
	 */
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	/**
	 * 
	 * @return
	 */
	public String getNacionalidad() {
		return nacionalidad;
	}
	/***
	 * 
	 * @param nacionalidad
	 */
	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}
	/**
	 * 
	 * @return
	 */
	public String getFechaN() {
		return fechaN;
	}
	/**
	 * 
	 * @param fechaN
	 */
	public void setFechaN(String fechaN) {
		this.fechaN = fechaN;
	}
	//Mostramos la informacion del objeto Actor
	@Override
	public String toString() {
		return "Actor [id=" + id + ", nombres=" + nombres + ", apellidos=" + apellidos + ", nacionalidad="
				+ nacionalidad + ", fechaN=" + fechaN + ", apeliculas=" + apeliculas + "]";
	}
	/**
	 * 
	 * @param ap
	 * En este metodo se procedera a agregarPelicula en la lista 
	 */
	public void agregarActorPelicula(ActorPelicula ap)
	{
		if(ap == null) {
			apeliculas= new ArrayList<ActorPelicula>();
		}
		this.apeliculas.add(ap);
	}
}
