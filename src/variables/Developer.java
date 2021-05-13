package variables;

/**
 * Formacion Java
 * 
 * @author sebas
 * 
 */
public class Developer {

	private int idEmployee;
	private int holidays;
	private String name;
	private static byte numEmployees = 0;
	private static final String COMPANY = "EVERIS";

	/**
	 * Constructor de la clase Developer.
	 * 
	 * @param name
	 * @param holidays
	 */
	public Developer(String name, int holidays) {

		if (holidays > 21) {

			System.out.println("Los días de vacaciones no pueden superar los 21 días.");

		} else if (numEmployees >= 127) {

			System.out.println("No hay puestos vacíos para nuevos empleados");

		} else {

			this.name = name;
			idEmployee = numEmployees + 1;
			this.holidays = holidays;
			numEmployees++;

		}
	}

	/**
	 * 
	 * @return numEmployees
	 */
	public static int getNumEmployees() {

		return numEmployees;

	}

	/**
	 * 
	 * @return name
	 */
	public String getName() {

		return name;

	}

	/**
	 * 
	 * @return COMPANY
	 */
	public static String getCompany() {

		return COMPANY;

	}

	/**
	 * 
	 * @return idEmployee
	 */
	public int getIdEmployee() {

		return idEmployee;

	}

	/**
	 * 
	 * @return holidays
	 */
	public int getHolidays() {

		return holidays;

	}

	/**
	 * Se descuentan x dias de vacaciones al empleado siempre y cuando no seran
	 * mayores a los dias de vacaciones del empleado.
	 * 
	 * @param holidays
	 */
	public void reduceHolidays(int holidays) {

		if (holidays > this.holidays) {

			System.out.println("Los días de vacaciones no pueden ser negativos.");

		} else {

			this.holidays -= holidays;

		}
	}

	/**
	 * Se añaden x dias de vacaciones al empleado siempre y cuando no superen los 21
	 * dias.
	 * 
	 * @param holidays
	 */
	public void addHolidays(int holidays) {

		if (this.holidays + holidays > 21) {

			System.out.println("Los días de vacaciones no pueden superar los 21 días.");

		} else {

			this.holidays += holidays;

		}
	}

}
