package figuras;

public class Circulo {
	private double radio;
	private Punto centro;

	public Circulo() {
		this.radio = 1;
		this.centro = new Punto();
	}
	public Circulo(double radio, Punto centro) {
		this.radio = radio;
		this.centro = centro;
	}
	public Circulo(double radio, double x, double y) {
		this.radio = radio;
		this.centro = new Punto(x, y);
	}
	public double getRadio() {
		return radio;
	}
	public Punto getCentro() {
		return centro;
	}

	public double calcularDistanciaDesde(Punto b) {
		return centro.calcularDistanciaDesde(b);
	}
	public double calcularArea() {
		return Math.PI * Math.pow(this.radio, 2);
	}
	public double calcularPerimetro() {
		return 2 * Math.PI * this.radio;
	}
}
