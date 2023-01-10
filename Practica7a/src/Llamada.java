
public class Llamada {

	protected int numOrigen;
	protected int numDestino;
	protected int duracion;
	protected double precio;
	
	
	public Llamada(int numOrigen, int numDestino, int duracion) {
		this.numOrigen = numOrigen;
		this.numDestino = numDestino;
		this.duracion = duracion;
	}
	
	public int getNumOrigen() {
		return numOrigen;
	}
	public int getNumDestino() {
		return numDestino;
	}
	public int getDuracion() {
		return duracion;
	}
	public double getPrecio() {
		return precio;
	}
	public void setNumOrigen(int numOrigen) {
		this.numOrigen = numOrigen;
	}
	public void setNumDestino(int numDestino) {
		this.numDestino = numDestino;
	}
	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}


}
