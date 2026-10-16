package classesConcretas;

import interfaces.Pagamento;

public class PagamentoPaypal implements Pagamento {
	@Override
	public double[] pagar(double[] valorParcelas) {

		for (int i = 0; i < valorParcelas.length; i++) {
			double total = (valorParcelas[i] + valorParcelas[i] * 0.01 * (i + 1)) * 1.02;
			valorParcelas[i] = total;
		}

		return valorParcelas;
	}

}
