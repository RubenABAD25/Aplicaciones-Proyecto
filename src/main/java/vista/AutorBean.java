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

@ManagedBean
@ViewScoped
/**
 * Esta clase ofrece la intereccion entre Vista-negocio
 */
public class AutorBean {
	
	//PropietiesBean
	private String nombre;
	private Actor ac;
	private int id;
	private List<Actor>actores;
	@Inject
	private FaceletContext fc;
	@Inject
	private ActorON on;
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
	public void setActores(List<Actor> actores) {
		this.actores = actores;
	}
	@PostConstruct
	public void init() {
		System.out.println("init " + ac);
		actores = on.getListadoActores();
	}

	/**
	 * Metodo de guardar Actor
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
	 */
	public String editar(int codigo) {
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
	public void buscar() {
		if(id==0)
			return;
		System.out.println("codigo editar " + this.id);
		ac = on.getActor(this.id);
		
		if(ac == null) {
			ac = new Actor();
			FacesMessage msg = new FacesMessage(FacesMessage.SEVERITY_INFO, 
					"Registro no existe", "InformaciÃ³n");
			//((FaceletContext) fc).addMessage(null, msg);
			
		}
	}

}
