package ejercicios;

public class Jugador  {
	
	private int idJugador;
	private String nombre;
	private int idEquipo;
	private int cantidadPartidos;
	private int cantidadGoles;
	private Equipo equipo;
	
	
	Jugador(int idJugador, Equipo equipo){
		
		this.idJugador=idJugador;
		this.equipo= equipo;
		this.nombre=" ";
		
	}	
	
	/*metodo de promedio de goles*/
	public double promedioGoles() {
		
		double promedioGoles=this.cantidadGoles/this.cantidadPartidos;
		
		return promedioGoles;
				
	
	}
	
	/*metodo que imprime todos los atributos y (el nombre del equipo)*/
	
	public String toString() {
		
		return this.idJugador+" "+ this.nombre+" "+this.idEquipo+" "+this.cantidadPartidos+" "+this.cantidadGoles+" "+this.equipo.getNombreEquipo();
		
		
	}
	
	public int getIdJugador() {
		return idJugador;
	}

	public void setIdJugador(int idJugador) {
		this.idJugador = idJugador;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getCantidadPartidos() {
		return cantidadPartidos;
	}

	public void setCantidadPartidos(int cantidadPartidos) {
		this.cantidadPartidos = cantidadPartidos;
	}

	public int getCantidadGoles() {
		return cantidadGoles;
	}

	public void setCantidadGoles(int cantidadGoles) {
		this.cantidadGoles = cantidadGoles;
	}

}
