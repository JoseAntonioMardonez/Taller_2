public class Motor {
	private int numeroMotor;
	private int centimetrosCubicos;

	public Motor(int numeroMotor, int centimetrosCubicos) {
		this.numeroMotor = numeroMotor;
		this.centimetrosCubicos = centimetrosCubicos;
	}

	public int getNumeroMotor() {
		return this.numeroMotor;
	}

	public void setNumeroMotor(int numeroMotor) {
		this.numeroMotor = numeroMotor;
	}

	public int getCentimetrosCubicos() {
		return this.centimetrosCubicos;
	}

	public void setCentimetrosCubicos(int centimetrosCubicos) {
		this.centimetrosCubicos = centimetrosCubicos;
	}
	public String toString(){
		return "N° de Motor: "+numeroMotor+"\n "+"Centimetros cúbicos: "+centimetrosCubicos;
	}
}