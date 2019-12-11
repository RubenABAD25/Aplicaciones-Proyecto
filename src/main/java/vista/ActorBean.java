package vista;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.inject.New;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.view.facelets.FaceletContext;
import javax.inject.Inject;

import modelo.Actor;
import negocio.ActorON;

<<<<<<< HEAD:src/main/java/vista/ActorBean.java
/**
 * 
 * @author Ruben
 *
 */
@ManagedBean

public class ActorBean {

	// PropietiesBean
=======
@ManagedBean

public class AutorBean {
	
	//PropietiesBean
>>>>>>> 1ca6bd06177bf6f4b52fd1bd087e6caec5ac2fa5:src/main/java/vista/AutorBean.java
	private String nombre;
	
	private Actor ac;
	private int id;
	private List<Actor> actores;
	@Inject
	private ActorON on;
<<<<<<< HEAD:src/main/java/vista/ActorBean.java

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
	public Actor getAc() {
		return ac;
	}

	/**
	 * 
	 * @param ac
	 */
	public void setAc(Actor ac) {
		this.ac = ac;
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
	public List<Actor> getActores() {
		return actores;
	}

	/**
	 * 
	 * @param actores
	 */
=======
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Actor getAc() {
		return ac;
	}
	public void setAc(Actor ac) {
		this.ac = ac;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public List<Actor> getActores() {
		return actores;
	}
>>>>>>> 1ca6bd06177bf6f4b52fd1bd087e6caec5ac2fa5:src/main/java/vista/AutorBean.java
	public void setActores(List<Actor> actores) {
		this.actores = actores;
	}

	@PostConstruct
	public void init() {
		ac = new Actor();
		System.out.println("init " + ac);
		actores = on.getListadoActores();
	}

	/**
	 * Metodo de guardar Actor
	 */
	public String guardar() {
		System.out.println("act " + ac);
		try {
			on.guardar(this.ac);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	/**
	 * Metodo de editar Actor
<<<<<<< HEAD:src/main/java/vista/ActorBean.java
	 * 
	 * @throws Exception
=======
>>>>>>> 1ca6bd06177bf6f4b52fd1bd087e6caec5ac2fa5:src/main/java/vista/AutorBean.java
	 */
	public String editar(int codigo) {
		System.out.println("codigo editar " + codigo);
		ac = on.getActor(codigo);
		System.out.println(ac.toString());

		return "personas?faces-redirect=true&id=" + codigo;
	}

	/**
	 * Metodo de eliminar Actor
	 */
	public String borrar(int codigo) {
		System.out.println("codigo borrar " + codigo);

		try {
			on.borrar(codigo);
			init();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("Error " + e.getMessage());
			e.printStackTrace();
		}

		return null;
	}
//	public void buscar() {
//		if(id==0)
//			return;
//		System.out.println("codigo editar " + this.id);
//		ac = on.getActor(this.id);
//		
//		if(ac == null) {
//			ac = new Actor();
//			FacesMessage msg = new FacesMessage(FacesMessage.SEVERITY_INFO, 
//					"Registro no existe", "InformaciÃ³n");
//			//((FaceletContext) fc).addMessage(null, msg);
//			
//		}
//	}
<<<<<<< HEAD:src/main/java/vista/ActorBean.java
=======
	
	
>>>>>>> 1ca6bd06177bf6f4b52fd1bd087e6caec5ac2fa5:src/main/java/vista/AutorBean.java

}
