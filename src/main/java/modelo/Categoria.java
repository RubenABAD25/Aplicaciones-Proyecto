package modelo;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
@Entity
@Table(name = "tb_Categoria")
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
}
