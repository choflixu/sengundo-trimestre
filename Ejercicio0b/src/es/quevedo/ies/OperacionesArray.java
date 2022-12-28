package es.quevedo.ies;

import java.util.Arrays;

/* Una versión que tenga como atributo el array
 * Otra versión que no tenga atributos y por lo tanto sus métodos serán estáticos. 
  Definir una clase OperacionesArray con los siguientes métodos:
 * Cargar un array 
   Listar contenido array
   Ordenar array
   Calcular media
   Devolver una copia del array invertido
*/

public class OperacionesArray {

	private OperacionesArray() {}

	public static void cargar(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random() * 10) + 1;
		}
	}

	public static void listar(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

	public static void ordenar(int[] arr) {
		Arrays.sort(arr);
	}

	public static double media(int[] arr) {
		int tot = 0;
		for (int i = 0; i < arr.length; i++) {
			tot += arr[i];
		}
		return tot / arr.length;
	}
	public static int[] invertir(int[] arr) {
		int[] copia = Arrays.copyOf(arr, arr.length);
		for(int i = 0; i < copia.length / 2; i++) {
		    int temp = copia[i];
		    copia[i] = copia[copia.length - i - 1];
		    copia[copia.length - i - 1] = temp;
		}
		return copia;
	}
}
