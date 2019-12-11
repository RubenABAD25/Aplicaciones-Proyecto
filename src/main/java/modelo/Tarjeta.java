package modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
public class Tarjeta {

	@Id
	@GeneratedValue
	@NotNull
	@Column(name = "tar_id")
	private int id;
	
	@NotNull
	@Column(name = "tar_nombres")
	private String nombre;
	
	@NotNull
	@Column(name = "tar_numero")
	private String numero;
	
	@NotNull
	@Column(name = "tar_fecha_caducidad")
	private String fechaCaducidad;
	
	@NotNull
	@Column(name = "tar_codigo_seguridad")
	private int codigoSeguridad;

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
	public String getNumero() {
		return numero;
	}

	/**
	 * 
	 * @param numero
	 */
	public void setNumero(String numero) {
		this.numero = numero;
	}

	/**
	 * 
	 * @return
	 */
	public String getFechaCaducidad() {
		return fechaCaducidad;
	}

	/**
	 * 
	 * @param fechaCaducidad
	 */
	public void setFechaCaducidad(String fechaCaducidad) {
		this.fechaCaducidad = fechaCaducidad;
	}

	/**
	 * 
	 * @return
	 */
	public int getCodigoSeguridad() {
		return codigoSeguridad;
	}

	/**
	 * 
	 * @param codigoSeguridad
	 */
	public void setCodigoSeguridad(int codigoSeguridad) {
		this.codigoSeguridad = codigoSeguridad;
	}

	//Mostramos la informacion del objeto Tarjeta
	@Override
	public String toString() {
		return "Tarjeta [id=" + id + ", nombre=" + nombre + ", numero=" + numero + ", fechaCaducidad=" + fechaCaducidad
				+ ", codigoSeguridad=" + codigoSeguridad + "]";
	}
	
}
