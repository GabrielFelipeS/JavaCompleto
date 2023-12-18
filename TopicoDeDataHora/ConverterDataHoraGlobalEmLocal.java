package TopicoDeDataHora;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class ConverterDataHoraGlobalEmLocal {
	public static void main(String[] args) {
		LocalDate d04 = LocalDate.parse("2022-07-23");
		LocalDateTime d05 = LocalDateTime.parse("2022-07-23T01:30:26");
		Instant d06 = Instant.parse("2022-07-23T01:30:26Z");
		
		LocalDate r1 = LocalDate.ofInstant(d06, ZoneId.systemDefault());
		LocalDate r2 = LocalDate.ofInstant(d06, ZoneId.of("Portugal"));
		LocalDateTime r3 = LocalDateTime.ofInstant(d06, ZoneId.systemDefault());
		LocalDateTime r4 = LocalDateTime.ofInstant(d06, ZoneId.of("Portugal"));
	
		System.out.println("r1 = " + r1);
		System.out.println("r2 = " + r2);
		System.out.println("r3 = " + r3);
		System.out.println("r4 = " + r4);
		
		
		System.out.println("d04 = " + d04.getDayOfMonth());
		System.out.println("d04 = " + d04.getMonth());
		System.out.println("d04 = " + d04.getYear());
		System.out.println("d05 = " + d05.getHour());
		System.out.println("d05 = " + d05.getMinute());
	}
}
