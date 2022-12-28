package figuras;

public class Punto {

	private double x;
	private double y;

	public Punto() {
		this.x = 0;
		this.y = 0;
	}

	public Punto(double x, double y) {
		this.x = x;
		this.y = y;
	}

	public double getX() {
		return x;
	}

	public double getY() {
		return y;
	}

	public double calcularDistanciaDesde(Punto b) {
		return Math.sqrt(Math.pow(b.x - this.x, 2) + Math.pow(b.y - this.y, 2));
	}

}
