package es.quevedo.ies;

public class Tester {

	public static void main(String[] args) {

		int[] arr = new int[10];
		
		OperacionesArray.cargar(arr);
		OperacionesArray.listar(arr);
		
		OperacionesArray.ordenar(arr);
		OperacionesArray.listar(arr);

		arr = OperacionesArray.invertir(arr);
		OperacionesArray.listar(arr);

	}

}
