public class Automovil {
	//Atributos
	private String marca;
	private String modelo;
	private int anioFabricacion;
	private int precio;
	private Motor motor;
	private Chasis chasis;
	//Constructor
	public Automovil(String marca, String modelo, int anioFabricacion, int precio, Motor motor, Chasis chasis) {
		this.marca = marca;
		this.modelo = modelo;
		this.anioFabricacion = anioFabricacion;
		this.precio = precio;
		this.motor = motor;
		this.chasis = chasis;
	}
	//Métodos
	public String getMarca() {
		return this.marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return this.modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getAnioFabricacion() {
		return this.anioFabricacion;
	}

	public void setAnioFabricacion(int anioFabricacion) {
		this.anioFabricacion = anioFabricacion;
	}

	public int getPrecio() {
		return this.precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}
	public String toString(){
		return "Marca: "+marca+"\n "+"Modelo: "+modelo+"\n "+"Año de Fabricación: "+anioFabricacion+"\n "+"Precio: "+precio;
	}
}