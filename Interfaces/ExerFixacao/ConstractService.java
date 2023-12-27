package Interfaces.ExerFixacao;

import Interfaces.ExerFixacao.models.Contract;
import Interfaces.ExerFixacao.models.Installment;
import Interfaces.ExerFixacao.models.OnlinePaymentService;

public class ConstractService {
	private OnlinePaymentService service;
	
	public ConstractService(OnlinePaymentService service) {
		this.service = service;
	}
	
	public void processContract(Contract contract, int months) {
		double valueBasicPerMonth = contract.getTotalValue() / months;
		for(int month = 1;month <= months; month++) {
			double totalValue = valueBasicPerMonth + service.interest(valueBasicPerMonth, month);
			totalValue += service.paymentFee(totalValue);
			
			contract.add(new Installment(contract.getDate().plusMonths(month), totalValue));
		}
	}
}
