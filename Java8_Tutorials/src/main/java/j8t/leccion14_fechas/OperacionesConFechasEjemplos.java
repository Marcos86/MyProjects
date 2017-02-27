package j8t.leccion14_fechas;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.Period;
import java.time.temporal.ChronoField;

/**
 * The Class InstantEjemplos.
 * Link ejemplo: http://www.arquitecturajava.com/java-time-package-y-clases-fundamentales/
 * 				 http://www.arquitecturajava.com/java-8-date-time-api/
 */
public class OperacionesConFechasEjemplos {

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		calcularDiferenciaEntreAhoraYUnSegundoDespues();		
		calcularDiferenciaEntreDosFechas();
		calcularDiferenciaEntreDosFechasEnFormatoConcreto();
		restarDiasAFecha();
		sumarDiasAFecha();
		sumarMinutosAFecha();
	}

	/**
	 * Calcular diferencia entre ahora Y un segundo despues.
	 */
	private static void calcularDiferenciaEntreAhoraYUnSegundoDespues() {
		Instant instante = Instant.now();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		Instant instante2=  Instant.now();
		System.out.println("calcularDiferenciaEntreAhoraYUnSegundoDespues:" );
		System.out.println("Instante 1: " + instante);
		System.out.println("Instante 2: " + instante2);
		System.out.println("Diferencia en milisegundos: " + Duration.between(instante, instante2).toMillis());
		// No hay forma de obtener los segundos directamente (el metodo es privado)
		System.out.println("Diferencia en segundos:     " + Duration.between(instante, instante2).toMillis() / 1000);
		System.out.println("Diferencia en minutos:      " + Duration.between(instante, instante2).toMinutes());
		System.out.println("************************************************************************************");
		System.out.println();
	}

	/**
	 * Calcular diferencia entre dos fechas.
	 */
	private static void calcularDiferenciaEntreDosFechas() {
		System.out.println("calcularDiferenciaEntreDosFechas:" );

		LocalDate dia1 = LocalDate.of(2017, 8, 31);
		LocalDate dia2 = LocalDate.of(2017, Month.SEPTEMBER, 30);
		Period periodo=Period.between(dia1, dia2);
		
		System.out.println("Fecha 1: " + dia1);
		System.out.println("Fecha 2: " + dia2);
		System.out.println("Periodo diferencia: " + periodo);
		System.out.println("Dias de diferencia: " + periodo.getDays());
		System.out.println("************************************************************************************");
		System.out.println();
	}
	
	
	private static void calcularDiferenciaEntreDosFechasEnFormatoConcreto() {
		System.out.println("calcularDiferenciaEntreDosFechasEnFormatoConcreto:" );

		LocalDate fecha1 = LocalDate.of(2007, 8, 26);
		LocalDate fecha2 = LocalDate.of(2017, 9, 28);
		Period periodo=Period.between(fecha1, fecha2);
		
		System.out.println("Fecha 1: " + fecha1);
		System.out.println("Fecha 2: " + fecha2);
		System.out.println(String.format("Entre la fecha %s y la fecha %s hay %d años, %d meses y %d dias%n",
				fecha1, fecha2, periodo.getYears(), periodo.getMonths(), periodo.getDays()));
		System.out.println("************************************************************************************");
		System.out.println();
	}

	/**
	 * Restar dias A fecha.
	 */
	private static void restarDiasAFecha() {
		System.out.println("restarDiasAFecha:" );

		LocalDate finAño = LocalDate.of(2017, 12, 31);
		LocalDate navidad = finAño.minusDays(6);
		
		System.out.println("Fecha Fin de año: " + finAño);
		System.out.println("Fecha Navidad (Fin de año - 6 días): " + navidad);
		System.out.println("Día de la fecha de Navidad (fin de año - 6 días): " + navidad.get(ChronoField.DAY_OF_MONTH));
		System.out.println("************************************************************************************");
		System.out.println();

	}
	
	
	/**
	 * Restar dias A fecha.
	 */
	private static void sumarDiasAFecha() {
		System.out.println("sumarDiasAFecha:" );

		LocalDate navidad = LocalDate.of(2017, 12, 25);
		LocalDate findeAño = navidad.plusDays(6);
		
		System.out.println("Fecha Navidad: " + navidad);
		System.out.println("Fecha Fin de Año(Navidad + 6 días): " + findeAño);
		System.out.println("Día de la fecha de Fin de año (fin de año + 6 días): " + findeAño.get(ChronoField.DAY_OF_MONTH));
		System.out.println("************************************************************************************");
		System.out.println();

	}
	
	

	private static void sumarMinutosAFecha() {
		System.out.println("sumarMinutosAFecha:" );

		LocalDateTime fechaConHoraMinutos = LocalDateTime.of(2016, 8, 31, 8, 2);
		LocalDateTime nuevaFecha=fechaConHoraMinutos.plusMinutes(25);
		
		System.out.println("Fecha1: " + fechaConHoraMinutos);
		System.out.println("Fecha2(Fecha1 + 25 minutos): " + nuevaFecha);
		System.out.println("Minutos Fecha 2 (Fecha1 + 25 minutos): " + nuevaFecha.getMinute());
		System.out.println("************************************************************************************");
		System.out.println();

	}
}
