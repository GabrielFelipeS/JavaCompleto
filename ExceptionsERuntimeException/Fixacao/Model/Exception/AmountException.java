package ExceptionsERuntimeException.Fixacao.Model.Exception;

@SuppressWarnings("serial")
public class AmountException extends RuntimeException{
	public AmountException(String msg) {
		super(msg);
	}
}
