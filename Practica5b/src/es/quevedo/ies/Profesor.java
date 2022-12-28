package es.quevedo.ies;

public class Profesor {

	public void ponerNotas(Alumno a) {
		a.getA1().setCalificacion(Math.random() * 10);
		a.getA2().setCalificacion(Math.random() * 10);
		a.getA3().setCalificacion(Math.random() * 10);
	}

	public double calcularMedia(Alumno a) {
		return (a.getA1().getCalificacion() + a.getA2().getCalificacion() + a.getA3().getCalificacion()) / 3;
	}
}
