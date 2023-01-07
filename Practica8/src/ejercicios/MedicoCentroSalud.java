/*Atributo: Clase CentroSalud (int identificador, String nombre,
 *  String domicilio, localidad (código postal))
Método mostrarDatos que muestra todos sus atributos.
Método calcularSalario()
 que a partir de las horas 
 trabajadas devuelve el importe del sueldo correspondiente.
*/
package ejercicios;

public class MedicoCentroSalud extends Medico {
	private CentroSalud centro;
	
	public String mostrarDatos() {
		return centro.getNombre();
	}
	
	public double calcularSalario() {
		
		return getHoras()*getSalarioHora();
	}

}
