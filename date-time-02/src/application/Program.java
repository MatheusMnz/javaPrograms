package application;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

/* --------Convertendo Data-Hora para Texto----------- */

//https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/time/format/DateTimeFormatter.html
public class Program {

	public static void main(String[] args) {
		LocalDate d01 = LocalDate.parse("2022-07-20");
		LocalDateTime d02 = LocalDateTime.parse("2022-07-20T01:30:23");
		Instant d03 = Instant.parse("2022-07-20T01:30:26Z");
		
		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		//Pegando o fuso do computador do usuário
		DateTimeFormatter fmt3 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());
		DateTimeFormatter fmt4 = DateTimeFormatter.ISO_DATE_TIME;
		DateTimeFormatter fmt5 = DateTimeFormatter.ISO_INSTANT;

		
		System.out.println("d01 = " + d01.format(fmt1));
		System.out.println("d01 = " + fmt1.format(d01));
		
		System.out.println("d02 = " + d02.format(fmt1));
		System.out.println("d02 = " + d02.format(fmt2));
		System.out.println("d02 = " + d02.format(fmt4));
		
		//Instant não permite a chamada de format, logo, temos que chamar fmt3 e dps o format
		//Data no instant é ambígua, logo precisa ser passado o fuso
		System.out.println("d03 = " + fmt3.format(d03));
		System.out.println("d03 = " + fmt5.format(d03));

		
	}

}
