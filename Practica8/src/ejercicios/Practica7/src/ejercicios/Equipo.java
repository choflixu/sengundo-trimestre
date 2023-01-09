/*Identificador del equipo (int):idEquipo
Nombre del equipo
Array de Jugador*/

package ejercicios;

import java.util.Arrays;

public class Equipo {

	private int idEquipo;
	private String nombreEquipo;
	private Jugador[] Jugadores;

	/*
	 * Constructor: crea el equipo asignándole un identificador y un nombre, así
	 * como la lista de jugadores. Desde el main se le pasa el identificador y el
	 * nombre del equipo.
	 */

	public Equipo(String nombreEquipo, int idEquipo) {
		this.nombreEquipo = nombreEquipo;
		this.idEquipo = idEquipo;
		this.Jugadores = new Jugador[] { new Jugador(123,this), new Jugador(456,this), new Jugador(789,this), new Jugador(987,this),
				new Jugador(654,this), new Jugador(321,this), new Jugador(213,this), new Jugador(132,this), new Jugador(543,this),
				new Jugador(278,this) };

	}

	public Equipo(Jugador[] jugador, String nombreEquipo, int idEquipo) {

		this.Jugadores = jugador;
		this.idEquipo = idEquipo;
		this.nombreEquipo = nombreEquipo;

	}

	/* Mostrar mostrarDatosEquipo() que imprima los datos de todos los jugadores. */

	public String mostrarDatosEquipo() {

		return Arrays.toString(this.Jugadores);

	}

	/*
	 * Método mostrarDatosJugador (String nombre) que imprima los datos de un
	 * jugador a partir de su nombre.
	 */

	public String mostrarDatosJugador(String nombre) {

		for (int i = 0; i < Jugadores.length; i++) {

			if (Jugadores[i].getNombre().equalsIgnoreCase(nombre)) {

				return Jugadores[i].toString();

			}

		}
		return null;
	}

	/*
	 * mejorDelantero() que devuelve el nombre del jugador que ha marcado más goles
	 * en la temporada
	 */

	public String mejorDelantero() {

		int aux = 0;
		int pm = 0;

		for (int i = 0; i < Jugadores.length; i++) {

			if (Jugadores[i].getCantidadGoles() > aux) {

				aux = Jugadores[i].getCantidadGoles();
				pm = i;

			}

		}

		return Jugadores[pm].getNombre();

	}

	/*
	 * Método ordenarGoles() que ordene los jugadores dentro del Equipo de forma
	 * ascendente según el número de goles que hayan marcado.
	 */

	public void ordenarGoles() {

		Jugador aux;
		for (int i = 0; i < Jugadores.length - 1; i++) {
			for (int j = 0; j < Jugadores.length - i - 1; j++) {

				if (Jugadores[j].getCantidadGoles() > Jugadores[j + 1].getCantidadGoles()) {

					aux = Jugadores[j];
					Jugadores[j] = Jugadores[j + 1];
					Jugadores[j + 1] = aux;
				}

			}
		}

	}

	/*
	 * Método darBaja(int id) que permita dar de baja a un jugador del equipo a
	 * partir de su identificador
	 */

	public void darBaja(int id) {

		for (int i = 0; i < Jugadores.length; i++) {

			if (Jugadores[i].getIdJugador() == (id)) {

				Jugadores[i] = null;

			}

		}

	}

	public void daralta(int id) {

		for (int i = 0; i < Jugadores.length; i++) {

			if (Jugadores[i] == null) {

				Jugadores[i] = new Jugador(id,this);

			}

		}

	}

	
	/*Método traspasar(Equipo equipo2, int idJugador) 
	 * que permita traspasar un jugador 
	 * de un equipo a otro. El jugador 
	 * será identificado por la posición que ocupa en el array.*/
	
	public void traspasar(Equipo equipo, int idJugador) {
		darBaja(idJugador);
		equipo.daralta(idJugador);
	}
	
	
	
	
	public int getIdEquipo() {
		return idEquipo;
	}

	public String getNombreEquipo() {
		return nombreEquipo;
	}

	public Jugador[] getJugadores() {
		return Jugadores;
	}

}
