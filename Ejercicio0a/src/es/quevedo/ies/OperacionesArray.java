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
	/* crear los atributos */

	private int arr[];
	/* constructores */

	public OperacionesArray(int arr[]) {
		this.arr = arr;
	}

	/* getters and setters */
	public int[] getArr() {
		return arr;
	}

	public void setArr(int arr[]) {
		this.arr = arr;
	}

	public void cargar() {
		for (int i = 0; i < this.arr.length; i++) {
			this.arr[i] = (int) (Math.random() * 10) + 1;
		}
	}

	public void listar() {
		for (int i = 0; i < this.arr.length; i++) {
			System.out.print(this.arr[i] + " ");
		}
		System.out.println();
	}

	public void ordenar() {
		Arrays.sort(this.arr);
	}

	public double media() {
		int tot = 0;
		for (int i = 0; i < this.arr.length; i++) {
			tot += this.arr[i];
		}
		return tot / this.arr.length;
	}
	public int[] invertir() {
		int[] copia = Arrays.copyOf(this.arr, this.arr.length);
		for(int i = 0; i < copia.length / 2; i++) {
		    int temp = copia[i];
		    copia[i] = copia[copia.length - i - 1];
		    copia[copia.length - i - 1] = temp;
		}
		return copia;
	}
}
