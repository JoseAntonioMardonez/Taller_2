import java.util.ArrayList;

public class Persona {
	//Atributos
	private String nombre;
	private String apellido;
	private String rut;
	private ArrayList<CorreoElectronico> correos = new ArrayList<CorreoElectronico>();
	private ArrayList<Automovil> automoviles = new ArrayList<Automovil>();
	//Constructor
	public Persona(String nombre, String apellido, String rut) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.rut = rut;
		this.correos = new ArrayList<CorreoElectronico>();
		this.automoviles = new ArrayList<Automovil>();
	}
	//Métodos
	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return this.apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getRut() {
		return this.rut;
	}

	public void setRut(String rut) {
		this.rut = rut;
	}
	public String toString(){
		return "Nombre: "+nombre+" "+apellido+"\n "+" RUT: "+rut;
	}
}