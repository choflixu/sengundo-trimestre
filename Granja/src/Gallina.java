
public class Gallina extends Animal {

	private int numHuevosDia;

	public Gallina(int id, String nombre, String fechaNacimiento, int numHuevosDia) {
		super(id, nombre, fechaNacimiento);
		this.numHuevosDia = numHuevosDia;
	}

	public int getNumHuevosDia() {
		return numHuevosDia;
	}

	public void setNumHuevosDia(int numHuevosDia) {
		this.numHuevosDia = numHuevosDia;
	}

	@Override
	public boolean esRentable() {
		return this.numHuevosDia > 5;
	}

	@Override
	public String toString() {
		return super.toString() + " Huevos/d: " + this.numHuevosDia;
	}
}
