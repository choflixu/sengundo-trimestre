
public class LlamadaProvincial extends Llamada {

	public LlamadaProvincial(int numOrigen, int numDestino, int duracion, int franja) {
		super(numOrigen, numDestino, duracion);
		switch (franja) {
		case 1:
			this.precio = 0.2;
			break;
		case 2:
			this.precio = 0.25;
			break;
		case 3:
			this.precio = 0.3;
		}
	}

}
