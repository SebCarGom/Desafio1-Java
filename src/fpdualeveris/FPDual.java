package fpdualeveris;

import variables.Developer;

/**
 * Formacion Java
 * 
 * @author sebas
 * 
 */
public class FPDual {

	/**
	 * Metodo principal
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		variablesChallenge();

	}

	/**
	 * Metodo clase FPDual.
	 */
	private static void variablesChallenge() {

		// Creacion de los 4 empleados.
		Developer dev1 = new Developer("Juan", 13);
		Developer dev2 = new Developer("Alberto", 19);
		Developer dev3 = new Developer("Aurelio", 9);
		Developer dev4 = new Developer("Antonio", 17);

		// Se muestra el numero total de empleados.
		System.out.println("Número total de trabajadores: ".concat(Integer.toString(dev1.getNumEmployees())));
		System.out.println("Número total de trabajadores: ".concat(Integer.toString(dev4.getNumEmployees())));

		// Se muestra el numero de empleado asignado a cada programador.
		System.out.println("\nEl número de empleado de ".concat(dev1.getName()).concat(" es: ")
				.concat(Integer.toString(dev1.getIdEmployee())));
		System.out.println("El número de empleado de ".concat(dev2.getName()).concat(" es: ")
				.concat(Integer.toString(dev2.getIdEmployee())));
		System.out.println("El número de empleado de ".concat(dev3.getName()).concat(" es: ")
				.concat(Integer.toString(dev3.getIdEmployee())));
		System.out.println("El número de empleado de ".concat(dev4.getName()).concat(" es: ")
				.concat(Integer.toString(dev4.getIdEmployee())));

		// Se descuentan 2 dias de vacaciones al segundo empleado.
		dev2.reduceHolidays(2);

		// Se consultan los dias de vacaciones que tiene asignado cada empleado.
		System.out.println("\nEl número de días de vacaciones disfrutables de ".concat(dev1.getName())
				.concat(" son de: ").concat(Integer.toString(dev1.getHolidays())).concat(" días"));
		System.out.println("El número de días de vacaciones disfrutables de ".concat(dev2.getName()).concat(" son de: ")
				.concat(Integer.toString(dev2.getHolidays())).concat(" días"));
		System.out.println("El número de días de vacaciones disfrutables de ".concat(dev3.getName()).concat(" son de: ")
				.concat(Integer.toString(dev3.getHolidays())).concat(" días"));
		System.out.println("El número de días de vacaciones disfrutables de ".concat(dev4.getName()).concat(" son de: ")
				.concat(Integer.toString(dev4.getHolidays())).concat(" días"));

	}

}
