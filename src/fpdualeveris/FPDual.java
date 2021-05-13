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
		System.out.println("Número total de trabajadores: " + dev1.getNumEmployees());
		System.out.println("Número total de trabajadores: " + dev4.getNumEmployees() + "\n");

		// Se muestra el numero de empleado asignado a cada programador.
		System.out.println("El número de empleado de " + dev1.getName() + " es: " + dev1.getIdEmployee());
		System.out.println("El número de empleado de " + dev2.getName() + " es: " + dev2.getIdEmployee());
		System.out.println("El número de empleado de " + dev3.getName() + " es: " + dev3.getIdEmployee());
		System.out.println("El número de empleado de " + dev4.getName() + " es: " + dev4.getIdEmployee() + "\n");

		// Se descuentan 2 dias de vacaciones al segundo empleado.
		dev2.reduceHolidays(2);

		// Se consultan los dias de vacaciones que tiene asignado cada empleado.
		System.out.println("El número de días de vacaciones disfrutables de " + dev1.getName() + " son de: "
				+ dev1.getHolidays() + " días");
		System.out.println("El número de días de vacaciones disfrutables de " + dev2.getName() + " son de: "
				+ dev2.getHolidays() + " días");
		System.out.println("El número de días de vacaciones disfrutables de " + dev3.getName() + " son de: "
				+ dev3.getHolidays() + " días");
		System.out.println("El número de días de vacaciones disfrutables de " + dev4.getName() + " son de: "
				+ dev4.getHolidays() + " días");

	}

}
