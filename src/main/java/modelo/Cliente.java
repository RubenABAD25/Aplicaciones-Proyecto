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
/**
 * 
 * @author Ruben
 *
 */
@Entity
public class Cliente {
	@Id
	@GeneratedValue
	@Column(name = "cli_id")
	private int id;
	@Column(name = "cli_nombres")
	private String nombres;
	@Column(name = "cli_apellidos")
	private String apellidos;
	
	@OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinColumn(name = "direccion_id")
	List<Direccion>direcciones;
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
	public List<Direccion> getDirecciones() {
		return direcciones;
	}
	/**
	 * 
	 * @param direcciones
	 */
	public void setDirecciones(List<Direccion> direcciones) {
		this.direcciones = direcciones;
	}

	@Override
	public String toString() {
		return "Cliente [id=" + id + ", nombres=" + nombres + ", apellidos=" + apellidos + ", direcciones="
				+ direcciones + "]";
	}
	/**
	 * 
	 * @param dir
	 * En este metodo se preocede agregar  uno o varios
	 */
	public void agregarDirecciones(Direccion dir)
	{
		if(dir == null) {
			direcciones= new ArrayList<Direccion>();
		}
		this.direcciones.add(dir);
	}
	
}
