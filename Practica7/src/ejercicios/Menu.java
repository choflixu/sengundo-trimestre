
/* 
Crear un programa principal que cree dos equipos y mediante un menú permita 
al usuario llamar a los métodos.
Con el fin de asegurar
la legibilidad y la encapsulación de 
datos podrás crear más métodos y 
los get/set de los atributos que te hagan falta
. De la misma forma, si consideras necesario puedes 
modificar el diseño de la aplicación siempre y cuando no pierda en complejidad.
*/
package ejercicios;

import java.util.Scanner;

public class Menu {

	public static void main(String[] args) {

		Scanner tcl= new Scanner(System.in);
		Equipo equipo1 = new Equipo("equipo1", 123143);
		
		equipo1.getJugadores()[1].setNombre("juan");
		equipo1.getJugadores()[1].setCantidadGoles(4);

		Equipo equipo2 = new Equipo("equipo2", 4859234);

		int option = 0;
		
		while (option != 8) {
			
			System.out.println("selecciona una opcion");
			System.out.println("1: mostrarDatosEquipo()");
			System.out.println("2: mostrarDatosJugador()");
			System.out.println("3: mejorDelantero()");
			System.out.println("4: ordenarGoles()");
			System.out.println("5: darBaja()");
			System.out.println("6: daralta()");
			System.out.println("7: traspasar()");
			System.out.println("8: salir");
            option=tcl.nextInt();
			switch (option) {
			case 1:
				
				System.out.println(equipo1.mostrarDatosEquipo());
				System.out.println(equipo2.mostrarDatosEquipo());

				break;
			case 2:
				tcl.nextLine();
				String nombre = null;
				System.out.println("introduce el nombre del jugador del equipo1");
				nombre=tcl.nextLine();
				System.out.println(equipo1.mostrarDatosJugador(nombre));
				System.out.println("introduce el nombre del jugador del equipo2");
				System.out.println(equipo2.mostrarDatosJugador(nombre));
				equipo2.mostrarDatosJugador(nombre);
				break;
				
			case 3:
				System.out.println(equipo1.mejorDelantero());
				System.out.println(equipo2.mejorDelantero());
			
				break;
			case 4:
				equipo1.ordenarGoles();
				equipo2.ordenarGoles();
				
				break;
				
			case 5:
				int id;
				System.out.println("introduzca el jugador que desea dar de baja en el equipo1");
				id=tcl.nextInt();
				equipo1.darBaja(id);
				System.out.println("introduzca el jugador que desea dar de baja en el equipo2");
				id=tcl.nextInt();
				equipo2.darBaja(id);
				
				break;
				
			case 6:
				int id1;
				System.out.println("introduzca el jugador que desea dar de alta en el equipo1");
				id1=tcl.nextInt();
				equipo1.daralta(id1);
				System.out.println("introduzca el jugador que desea dar de alta en el equipo2");
				id1=tcl.nextInt();
				equipo2.daralta(id1);
				
				
				break;
				
			case 7:
				int id2;
				System.out.println("Escriba el id del jugador que quiere pasar del equipo 1 al equipo2 ");
				id2=tcl.nextInt();
				equipo1.traspasar(equipo2, id2);
				
				break;
			}
		}
	}

}
