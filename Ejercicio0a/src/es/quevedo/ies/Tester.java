package es.quevedo.ies;

public class Tester {

	public static void main(String[] args) {

		int[] arr = new int[10];
		OperacionesArray oa = new OperacionesArray(arr);
		
		oa.cargar();
		oa.listar();
		
		oa.ordenar();
		oa.listar();
		
		oa.setArr(oa.invertir());
		oa.listar();
	}

}
