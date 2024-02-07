package ExceptionsERuntimeException.Model.Entity;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import ExceptionsERuntimeException.Model.Exceptions.DomainException;

public class Reservation {
	private Integer roomNumber;
	private Date checkIn;
	private Date checkOut;

	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	//private DateTimeFormatter dtf = DateTimeFormatter.ofPattern(null);
	
	public Reservation(Integer roomNumber, Date checkIn, Date checkOut) throws DomainException {	
		this.roomNumber = roomNumber;
		updateDates(checkIn, checkOut);
	}

	public Integer getRoomNumber() {
		return roomNumber;
	}

	public void setRoomNumber(Integer roomNumber) {
		this.roomNumber = roomNumber;
	}

	public void setCheckIn(Date checkIn) {
		this.checkIn = checkIn;
	}

	public Date getCheckOut() {
		return checkOut;
	}

	public long duration() {
		long diff = checkOut.getTime() - checkIn.getTime();
		return TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS);
	}
	
	public String updateDates_BadVersion(Date checkIn, Date checkOut) {
		Date now = new Date();
		if(checkIn.before(now) || checkOut.before(now)) {
			return "Reservation dates for update must be future dates";	
		} 
		
		if(!checkOut.after(checkIn)) {				
			return "Check-out date is must after check-it date ";		
		} 
		
		this.checkIn = checkIn;
		this.checkOut = checkOut;
		return null;
	}
	
	
	public void updateDates_VeryBadVersion(Date checkIn, Date checkOut) {
		this.checkIn = checkIn;
		this.checkOut = checkOut;
	}
	
	@Override
	public String toString() {
		return String.format("Room: %d, check-in: %s, check-out: %s, %d nights", 
				roomNumber, sdf.format(checkIn), sdf.format(checkOut), duration());
	}

	public void updateDates(Date checkIn, Date checkOut) throws DomainException {
		Date now = new Date();
		if(checkIn.before(now) || checkOut.before(now)) {
			throw new DomainException("Reservation dates for update must be future dates");	
		} 
		
		if(!checkOut.after(checkIn)) {				
			throw new DomainException("Check-out date is must after check-it date ");		
		}
		
		this.checkIn = checkIn;
		this.checkOut = checkOut;
	}
}
