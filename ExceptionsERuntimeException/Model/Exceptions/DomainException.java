package ExceptionsERuntimeException.Model.Exceptions;

public class DomainException extends Exception{
	private static final long serialVersionUID = 1L;

	public DomainException(String msg) {
		super(msg);
	}

}
