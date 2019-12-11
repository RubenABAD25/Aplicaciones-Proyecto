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
	private int codigoSeguridad;
	
}
