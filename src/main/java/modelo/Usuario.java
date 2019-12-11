package modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
/**
 * 
 * @author Ruben
 *
 */
@Entity
public class Usuario {
	@Id
	@GeneratedValue
	@NotNull
	@Column(name = "usr_id")
	private int id ;
	@NotNull
	@Column(name = "usr_name")
	private String username;
	@NotNull
	@Column(name = "usr_pass")
	private String password;
	@NotNull
	@Column(name = "usr_estado")
	private boolean admin;
	
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
	public String getUsername() {
		return username;
	}
	/**
	 * 
	 * @param username
	 */
	public void setUsername(String username) {
		this.username = username;
	}
	/**
	 * 
	 * @return
	 */
	public String getPassword() {
		return password;
	}
	/**
	 * 
	 * @param password
	 */
	public void setPassword(String password) {
		this.password = password;
	}
	/**
	 * 
	 * @return
	 */
	public boolean isAdmin() {
		return admin;
	}
	/**
	 * 
	 * @param admin
	 */
	public void setAdmin(boolean admin) {
		this.admin = admin;
	}
	@Override
	public String toString() {
		return "Usuario [id=" + id + ", username=" + username + ", password=" + password + ", admin=" + admin + "]";
	}
		
}
