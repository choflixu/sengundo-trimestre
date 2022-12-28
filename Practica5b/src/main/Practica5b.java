package main;

import es.quevedo.ies.*;

public class Practica5b {

	public static void main(String[] args) {

		Asignatura a1 = new Asignatura(1);
		Asignatura a2 = new Asignatura(2);
		Asignatura a3 = new Asignatura(3);

		Alumno alum1 = new Alumno(a1, a2, a3);
		
		Profesor p1 = new Profesor();
		
		p1.ponerNotas(alum1);
		
		System.out.println(p1.calcularMedia(alum1));
	}

}
