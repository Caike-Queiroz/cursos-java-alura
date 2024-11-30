import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.time.YearMonth;
import java.time.format.DateTimeFormatter;

public class Datas {

	public static void main(String[] args) {
		
		LocalDate hoje = LocalDate.now();
		System.out.println(hoje);
		
		LocalDate copaDoMundo = LocalDate.of(2026, Month.JUNE, 5);
		int anos = copaDoMundo.getYear() - hoje.getYear();
		
		LocalDate dataFutura = LocalDate.of(2099, Month.JANUARY, 25);
        Period intervalo = Period.between(LocalDate.now(), dataFutura);
        System.out.println(intervalo);
		
		Period periodo = Period.between(hoje, copaDoMundo);
		System.out.println(periodo.getYears() + " ano(s) " 
						+ periodo.getMonths() + " meses " 
						+ periodo.getDays() + " dias");
		
		System.out.println(copaDoMundo.plusYears(4)); // 2026-06-05 + 4 anos
		
		LocalDate proximaCopa = copaDoMundo.plusYears(4);
		System.out.println(proximaCopa + " formato americano"); //formato americano
		
		DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		String proximaCopaFormatada = proximaCopa.format(formatador);
		System.out.println(proximaCopaFormatada);
		
		DateTimeFormatter formatador2 = DateTimeFormatter.ofPattern("dd/MM/yyyy | hh:mm");
		LocalDateTime agora = LocalDateTime.now();
		System.out.println(agora.format(formatador2));
		
		DateTimeFormatter formatador3 = DateTimeFormatter.ofPattern("hh:mm");
		LocalTime intervalo2 = LocalTime.of(3, 30);
		System.out.println(intervalo2.format(formatador3));
	}
}