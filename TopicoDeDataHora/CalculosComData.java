package TopicoDeDataHora;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class CalculosComData {
	public static void main(String[] args) {
		LocalDate d04 = LocalDate.parse("2022-07-20");
		LocalDateTime d05 = LocalDateTime.parse("2022-07-23T01:30:26");
		Instant d06 = Instant.parse("2022-07-23T01:30:26Z");
		
		LocalDate pastWeekLocalDate = d04.minusDays(7);
		LocalDate nextWeekLocalDate = d04.plusWeeks(1);
		
		System.out.println("Local Date: ");
		System.out.println("Past week = " + pastWeekLocalDate);
		System.out.println("Next week = " + nextWeekLocalDate);
		
		LocalDateTime pastWeekLocalDateTime = d05.minusDays(7);
		LocalDateTime nextWeekLocalDateTime = d05.plusWeeks(1);
		
		System.out.println("\nLocal Date time: ");
		System.out.println("Past week = " + pastWeekLocalDateTime);
		System.out.println("Next week = " + nextWeekLocalDateTime);
		
		Instant pastWeekLocalInstant = d06.minus(1, ChronoUnit.DAYS);
		Instant nextWeekLocalInstant = d06.plus(1, ChronoUnit.DAYS);
		System.out.println("\nIntant: ");
		System.out.println("Past week = " + pastWeekLocalInstant);
		System.out.println("Next week = " + nextWeekLocalInstant);
		//atTime e atStartsOfDay fazem a mesma coisa
		Duration t1 = Duration.between(pastWeekLocalDate.atTime(0, 0), d04.atStartOfDay());
		Duration t2 = Duration.between(pastWeekLocalDateTime, d05);
		Period t3 = Period.between(LocalDate.parse("2003-04-14"), LocalDate.now());
		d05.toLocalDate();
		System.out.println("t2 dias = " + t1.toDays());
		System.out.println("t2 dias = " + t2.toDays());
		System.out.println("t2 dias = " + t3.getYears());
		

	}
}
