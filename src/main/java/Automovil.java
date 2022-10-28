public class Automovil {
	private String marca;
	private String modelo;
	private int anioFabricacion;
	private int precio;
	public Motor motor;
	public Chasis chasis;

	public Automovil(String marca, String modelo, int anioFabricacion, int precio) {
		throw new UnsupportedOperationException();
	}

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
}