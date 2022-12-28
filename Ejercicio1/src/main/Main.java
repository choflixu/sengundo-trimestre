package main;

import figuras.Triangulo;

public class Main {

	public static void main(String[] args) {

		Triangulo t1 = new Triangulo(3, 6, 7);
		
		System.out.println(t1.perimetro());
		
		System.out.println(t1.area());

	}

}
