public class CorreoElectronico {
	private String direccionCorreo;
	private String proveedorCorreo;

	public CorreoElectronico(String direccionCorreo, String proveedorCorreo) {
		throw new UnsupportedOperationException();
	}

	public String getDireccionCorreo() {
		return this.direccionCorreo;
	}

	public void setDireccionCorreo(String direccionCorreo) {
		this.direccionCorreo = direccionCorreo;
	}

	public String getProveedorCorreo() {
		return this.proveedorCorreo;
	}

	public void setProveedorCorreo(String proveedorCorreo) {
		this.proveedorCorreo = proveedorCorreo;
	}
}