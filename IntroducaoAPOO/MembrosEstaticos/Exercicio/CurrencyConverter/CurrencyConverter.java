package IntroducaoAPOO.MembrosEstaticos.Exercicio.CurrencyConverter;

public class CurrencyConverter {
	
	public static double convert(double dollar, double bought) {
		double reais = dollar * bought;
		return reais * 1.06;
	}
}
