package es.quevedo.ies;

public class Alumno {

	private Asignatura a1;
	private Asignatura a2;
	private Asignatura a3;

	public Alumno(Asignatura a1, Asignatura a2, Asignatura a3) {
		this.a1 = a1;
		this.a2 = a2;
		this.a3 = a3;
	}

	public Alumno(int idA1, int idA2, int idA3) {
		this.a1 = new Asignatura(idA1);
		this.a2 = new Asignatura(idA2);
		this.a3 = new Asignatura(idA3);
	}

	public Asignatura getA1() {
		return a1;
	}

	public Asignatura getA2() {
		return a2;
	}

	public Asignatura getA3() {
		return a3;
	}

}
