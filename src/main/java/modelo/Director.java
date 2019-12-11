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

@Entity
public class Director {
	@Id
	@GeneratedValue
	@NotNull
	@Column(name = "dir_id")
	private int id;
	@NotNull
	@Column(name = "dir_nombres")
	private String nombres;
	@NotNull
	@Column(name = "dir_apellidos")
	private String apellidos;
	@NotNull
	@Column(name = "dir_nacionalidad")
	private String nacionalidad;
	@NotNull
	@Column(name = "dir_cedula")
	private String cedula;
	@NotNull
	@Column(name = "dir_fecha")
	private String fecha;
	@NotNull
	@Column(name = "dir_numero")
	private int numero;
	
	@OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinColumn(name = "director_id")
	private List<DirectorPelicula>dpelicas;
	
	
	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getNombres() {
		return nombres;
	}


	public void setNombres(String nombres) {
		this.nombres = nombres;
	}


	public String getApellidos() {
		return apellidos;
	}


	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}


	public String getNacionalidad() {
		return nacionalidad;
	}


	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}


	public String getCedula() {
		return cedula;
	}


	public void setCedula(String cedula) {
		this.cedula = cedula;
	}


	public String getFecha() {
		return fecha;
	}


	public void setFecha(String fecha) {
		this.fecha = fecha;
	}


	public int getNumero() {
		return numero;
	}


	public void setNumero(int numero) {
		this.numero = numero;
	}


	public List<DirectorPelicula> getDpelicas() {
		return dpelicas;
	}


	public void setDpelicas(List<DirectorPelicula> dpelicas) {
		this.dpelicas = dpelicas;
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
		return "Director [id=" + id + ", nombres=" + nombres + ", apellidos=" + apellidos + ", nacionalidad="
				+ nacionalidad + ", cedula=" + cedula + ", fecha=" + fecha + ", numero=" + numero + ", dpelicas="
				+ dpelicas + "]";
	}
	
}
