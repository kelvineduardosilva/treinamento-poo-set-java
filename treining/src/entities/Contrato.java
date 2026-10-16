package entities;

import java.util.Date;

public class Contrato {
	private int numero;
	private Date data;
	private double valorTotal;

	public Contrato(int numero, Date data, double valorTotal) {
		this.numero = numero;
		this.data = data;
		this.valorTotal = valorTotal;
	}

	public int getNumero() {
		return numero;
	}

	public Date getData() {
		return data;
	}

	public double getValorTotal() {
		return valorTotal;
	}

}
