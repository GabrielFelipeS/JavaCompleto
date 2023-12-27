package Interfaces.ExerFixacao.models;

public class PaypalService implements OnlinePaymentService{

	@Override
	public double interest(double amount, int month) {
		return amount * 0.01 * month;
	}

	@Override
	public double paymentFee(double amount) {
		return amount * 0.02;
	}

}
