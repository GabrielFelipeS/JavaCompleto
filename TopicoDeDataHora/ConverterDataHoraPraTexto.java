package TopicoDeDataHora;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class ConverterDataHoraPraTexto {
	public static void main(String[] args) {
		LocalDate d04 = LocalDate.parse("2022-07-23");
		LocalDateTime d05 = LocalDateTime.parse("2022-07-23T01:30:26");
		Instant d06 = Instant.parse("2022-07-23T01:30:26Z");
		
		DateTimeFormatter fm01 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DateTimeFormatter fm02 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		DateTimeFormatter fm03 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());
		
		System.out.println("d04 = " + d04.format(fm01));
		System.out.println("d04 = " + fm01.format(d04));
		System.out.println("d04 = " + d04.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
	
		System.out.println("d05 = " + d05.format(fm02));
		System.out.println("d05 = " + fm02.format(d05));
		
		System.out.println("d06 = " + fm03.format(d06));
	}
}
