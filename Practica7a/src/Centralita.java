
public class Centralita {

	private double costeTotal;
	private int numLlamadas;

	public double getCosteTotal() {
		return costeTotal;
	}

	public int getNumLlamadas() {
		return numLlamadas;
	}

	public void setCosteTotal(double costeTotal) {
		this.costeTotal = costeTotal;
	}

	public void setNumLlamadas(int numLlamadas) {
		this.numLlamadas = numLlamadas;
	}

	public void registrarLlamada(Llamada llamada) {
		numLlamadas++;
		costeTotal += llamada.precio;
	}
}
