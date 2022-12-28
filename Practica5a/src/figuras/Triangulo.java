package figuras;

public class Triangulo {

	private Punto verticeA;
	private Punto verticeB;
	private Punto verticeC;

	public Triangulo() {
		this.verticeA = new Punto(0, 0);
		this.verticeB = new Punto(0, 1);
		this.verticeC = new Punto(1, 0);
	}

	public Triangulo(Punto verticeA, Punto verticeB, Punto verticeC) {
		this.verticeA = verticeA;
		this.verticeB = verticeB;
		this.verticeC = verticeC;
	}

	public Triangulo(double xA, double yA, double xB, double yB, double xC, double yC) {
		this.verticeA = new Punto(xA, yA);
		this.verticeB = new Punto(xB, yB);
		this.verticeC = new Punto(xC, yC);
	}

	public double calcularDistanciaDesde(Punto b) {
		Punto centro = new Punto(((this.verticeA.getX() + this.verticeB.getX() + this.verticeC.getX()) / 3),
				(this.verticeA.getY() + this.verticeB.getY() + this.verticeC.getY()) / 3);
		return centro.calcularDistanciaDesde(b);
	}

	public double calcularArea() {
		return Math.abs(this.verticeA.getX() * (this.verticeB.getY() - this.verticeC.getY())
				+ this.verticeB.getX() * (this.verticeC.getY() - this.verticeA.getY())
				+ this.verticeC.getX() * (this.verticeA.getY() - this.verticeB.getY())) / 2;
	}

	public double calcularPerimetro() {
		return this.verticeA.calcularDistanciaDesde(verticeB) + this.verticeA.calcularDistanciaDesde(verticeC)
				+ this.verticeB.calcularDistanciaDesde(verticeC);
	}
}
