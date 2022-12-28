package figuras;

public class Triangulo {
	private double ladoA;
	private double ladoB;
	private double ladoC;

	public Triangulo() {
		this.ladoA = 1;
	}
	public Triangulo(double ladoA, double ladoB, double ladoC) {
		this.ladoA = ladoA;
		this.ladoB = ladoB;
		this.ladoC = ladoC;
	}
	public double getLadoA() {
		return ladoA;
	}
	public void setLadoA(double ladoA) {
		this.ladoA = ladoA;
	}
	
	public double getLadoB() {
		return ladoB;
	}
	public void setLadoB(double ladoB) {
		this.ladoB = ladoB;
	}
	public double getLadoC() {
		return ladoC;
	}
	public void setLadoC(double ladoC) {
		this.ladoC = ladoC;
	}
	public double perimetro() {
		return this.ladoA + this.ladoB + this.ladoC;
	}
	public double area() {
		double s = this.perimetro()/2;
		return Math.sqrt(s*(s-this.ladoA)*(s-this.ladoB)*(s-this.ladoC));
	}
}
