package entities;

import java.time.LocalDate;
import java.util.Date;

public class Parcelas {
	private LocalDate data;
	private Double valor;
	private int numeroParcelas;

	public Parcelas(LocalDate data, Double valor, int numeroParcelas) {
		this.data = data;
		this.valor = valor;
		this.numeroParcelas = numeroParcelas;
	}

	public LocalDate getData() {
		return data;
	}

	public Double getValor() {
		return valor;
	}

	public LocalDate[] dataParcela() {
		LocalDate[] datas = new LocalDate[numeroParcelas];
		for (int i = 0; i < numeroParcelas; i++) {
			datas[i] = data.plusMonths(i + 1);

		}
		return datas;
	}

	public double[] valorParcelas() {
		double[] parcelas = new double[numeroParcelas];
		double op = valor / numeroParcelas;
		for (int i = 0; i < numeroParcelas; i++) {
			parcelas[i] = op;
		}
		return parcelas;
	}

}
