package Interfaces.ExerFixacao.models;

public interface OnlinePaymentService {
	double interest(double amount, int months);
	double paymentFee(double amount);
}
