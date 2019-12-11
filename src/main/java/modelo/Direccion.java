package modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
/**
 * 
 * @author Ruben
 *
 */
@Entity
public class Direccion {
	@Id
	@GeneratedValue
	@Column(name = "dir_id")
	private int id;
	@Column(name = "dir_calles")
	private String calles;
	@Column(name = "dir_numero")
	private String numero;
	@Column(name = "dir_ciudad")
	private String  ciudad;
	
	@OneToOne
	@JoinColumn(name = "direccion_id")
	private Cliente cliente;
	
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
	public String getCalles() {
		return calles;
	}
	/**
	 * 
	 * @param calles
	 */
	public void setCalles(String calles) {
		this.calles = calles;
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
	public String getCiudad() {
		return ciudad;
	}
	/**
	 * 
	 * @param ciudad
	 */
	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}
	/**
	 * 
	 * @return
	 */
	public Cliente getCliente() {
		return cliente;
	}
	/**
	 * 
	 * @param cliente
	 */
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	@Override
	public String toString() {
		return "Direccion [id=" + id + ", calles=" + calles + ", numero=" + numero + ", ciudad=" + ciudad + ", cliente="
				+ cliente + "]";
	}
}
