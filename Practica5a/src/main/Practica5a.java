package main;

import figuras.*;

public class Practica5a {

	public static void main(String[] args) {

			Punto p1 = new Punto(0 , 0);
			Punto p2 = new Punto(1 , 2);
			
			System.out.println(p1.calcularDistanciaDesde(p2));
			
			Circulo c1 = new Circulo();

			System.out.println(c1.calcularArea());
			System.out.println(c1.calcularPerimetro());
			System.out.println(c1.calcularDistanciaDesde(p1));
			System.out.println(c1.calcularDistanciaDesde(p2));
			
			Triangulo t1 = new Triangulo();
			
			System.out.println(t1.calcularArea());
			System.out.println(t1.calcularPerimetro());
			System.out.println(t1.calcularDistanciaDesde(new Punto(2, 2)));


	}

}
