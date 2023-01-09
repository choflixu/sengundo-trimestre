
public class Granja {

	private Animal[] animales;

	public Granja(int numAnimales) {

		this.animales = new Animal[numAnimales];

		for (int i = 0; i < this.animales.length; i++) {
			if (i % 2 == 0)
				this.animales[i] = new Gallina(i, "Gallina", "01-01-2000", (int) (Math.random() * 10) + 1);
			else
				this.animales[i] = new Vaca(i, "Vaca", "01-01-2000", (int) (Math.random() * 100) + 1);
		}

	}

	public String listarAnimales() {
		String str = "";
		for (int i = 0; i < this.animales.length; i++) {
			if (this.animales[i] != null)
				str += this.animales[i].toString() + "\n";
			else
				str += "Sin animal \n";
		}
		return str;
	}

	public String listarAnimales(int id) {
		String str = "";
		for (int i = 0; i < this.animales.length; i++) {
			if (id < this.animales[i].getId())
				if (this.animales[i] != null)
					str += this.animales[i].toString() + "\n";
				else
					str += "Sin animal \n";
		}
		return str;
	}

	public String listarAnimalesRentables() {
		String str = "";
		for (int i = 0; i < this.animales.length; i++) {
			if (this.animales[i] != null)
				if (this.animales[i].esRentable())
					str += this.animales[i].getClass().getSimpleName() + " " + this.animales[i].toString() + "\n";
		}
		return str;
	}

	/**
	 * Crea una vaca o una gallina según si la posición del array es par o impar.
	 * 
	 * @param pos             Crea una gallina si pos es par o una vaca si es impar.
	 * @param nombre
	 * @param fechaNacimiento
	 * @param num             Número entero usado para indicar el número de huevos o
	 *                        litros de leche.
	 */
	public void altaAnimal(int pos, String nombre, String fechaNacimiento, int num) {

		for (int i = 0; i < this.animales.length; i++) {
			if (pos == i) {
				if (pos % 2 == 0)
					this.animales[i] = new Gallina(pos, nombre, fechaNacimiento, num);
				else
					this.animales[i] = new Vaca(pos, nombre, fechaNacimiento, num);
			}
		}
	}

	public void bajaAnimal(int id) {
		for (int i = 0; i < this.animales.length; i++) {
			if (id == this.animales[i].getId()) {
				this.animales[i] = null;
			}
		}
	}

	public void modificarIdAnimal(int id, int nuevoId) {
		for (int i = 0; i < this.animales.length; i++) {
			if (this.animales[i] != null)
				if (id == this.animales[i].getId())
					this.animales[i].setId(nuevoId);
		}
	}

}
