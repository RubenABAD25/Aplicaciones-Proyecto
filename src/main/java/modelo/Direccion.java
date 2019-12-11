package modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

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
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCalles() {
		return calles;
	}
	public void setCalles(String calles) {
		this.calles = calles;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public String getCiudad() {
		return ciudad;
	}
	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	@Override
	public String toString() {
		return "Direccion [id=" + id + ", calles=" + calles + ", numero=" + numero + ", ciudad=" + ciudad + ", cliente="
				+ cliente + "]";
	}
}
