package ExceptionsERuntimeException.Application;

import java.io.FileReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import java.util.Scanner;

import ExceptionsERuntimeException.Model.Entity.Reservation;
import ExceptionsERuntimeException.Model.Exceptions.DomainException;

public class VeryBad {
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
			if(checkIn.before(now) || checkOut.before(now)) {
				System.out.println("Error in reservation: Reservation dates for update must be future dates");	
			} else if(!checkOut.after(checkIn)) {				
				System.out.println("Error in reservation: Check-out date is must after check-it date ");		
			} else {
				reservation.updateDates_VeryBadVersion(checkIn, checkOut);
				System.out.println("Reservation: " + reservation);				
			}
		}
	}
}
