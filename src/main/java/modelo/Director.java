package modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "tb_Director")
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
	/**
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
	public String getCedula() {
		return cedula;
	}
	/**
	 * 
	 * @param cedula
	 */
	public void setCedula(String cedula) {
		this.cedula = cedula;
	}
	/**
	 * 
	 * @return
	 */
	public String getFecha() {
		return fecha;
	}
	/**
	 * 
	 * @param fecha
	 */
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	/**
	 * 
	 * @return
	 */
	public int getNumero() {
		return numero;
	}
	/**
	 * 
	 * @param numero
	 */
	public void setNumero(int numero) {
		this.numero = numero;
	}
	//Mostramos la informacion del objeto Director
	@Override
	public String toString() {
		return "Director [id=" + id + ", nombres=" + nombres + ", apellidos=" + apellidos + ", nacionalidad="
				+ nacionalidad + ", cedula=" + cedula + ", fecha=" + fecha + ", numero=" + numero + "]";
	}
}
