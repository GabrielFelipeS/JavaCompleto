package ExceptionsERuntimeException.Application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import ExceptionsERuntimeException.Model.Entity.Reservation;
import ExceptionsERuntimeException.Model.Exceptions.DomainException;

public class Bad {
	public static void main(String[] args) throws ParseException, DomainException  {
		Scanner scan = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.print("Room number: ");
		int numRoom = scan.nextInt();
		
		System.out.print("Check-In date (dd/MM/yyyy): ");
		Date checkIn = sdf.parse(scan.next());

		System.out.print("Check-Out date (dd/MM/yyyy): ");
		Date checkOut = sdf.parse(scan.next());
		
		//LocalDate ld = LocalDate.now();
		//ld.isAfter(LocalDate.now());
		
		if(!checkOut.after(checkIn)) {
			System.out.println("Error in reservation: Check-out date is must after check-it date ");
		} else {
			Reservation reservation = new Reservation(numRoom, checkIn, checkOut);
			System.out.println("Reservation: " + reservation);

			System.out.println("\nEnter date to update the reservation: ");
			System.out.print("Check-In date (dd/MM/yyyy): ");
			checkIn = sdf.parse(scan.next());

			System.out.print("Check-Out date (dd/MM/yyyy): ");
			checkOut = sdf.parse(scan.next());
			

			Date now = new Date();
			String error = reservation.updateDates_BadVersion(checkIn, checkOut);
			if(error != null) {
				System.out.println("Error in reservation: " + error);
			} else {
				System.out.println("Reservation: " + reservation);												
			}
			
		
		}
	}
}
