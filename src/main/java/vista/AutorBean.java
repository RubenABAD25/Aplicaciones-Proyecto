package vista;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.view.facelets.FaceletContext;
import javax.inject.Inject;

import modelo.Actor;
import negocio.ActorON;
/**
 * 
 * @author Ruben
 *
 */
@ManagedBean

public class AutorBean {
	
	//PropietiesBean
	private String nombre;
	private Actor ac;
	private int id;
	private List<Actor>actores;
	@Inject
	private ActorON on;
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
	public void setActores(List<Actor> actores) {
		this.actores = actores;
	}
	@PostConstruct
	public void init() {
		System.out.println("init " + ac);
		actores = on.getListadoActores();
	}

	/**
	 * 
	 * @return
	 */
	public String guardar() {
		try {
			on.guardar(ac);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	/**
	 * Metodo de editar Actor
	 * @throws Exception 
	 */
	public String editar(int codigo) throws Exception {
		System.out.println("codigo editar " + codigo);
		ac =on.getActor(codigo);
		System.out.println(ac.toString());
		
		return "personas?faces-redirect=true&id="+codigo;
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
			System.out.println("Error "+ e.getMessage());
			e.printStackTrace();
		}
		
		return null;
	}

}
