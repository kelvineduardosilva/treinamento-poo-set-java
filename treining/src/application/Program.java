package application;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import classesConcretas.PagamentoPaypal;
import entities.Parcelas;

public class Program {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");

		System.out.println("Entre com os dados do contrato: ");

		System.out.print("Número: ");
		int numeroContrato = entrada.nextInt();
		entrada.nextLine();

		System.out.print("Data: ");
		String dataf = entrada.nextLine();
		LocalDate data = LocalDate.parse(dataf, fmt1);

		System.out.print("Valor do contrato: ");
		double valor = entrada.nextDouble();
		entrada.nextLine();

		System.out.print("Digite o número de parcelas: ");
		int parcelas = entrada.nextInt();
		entrada.nextLine();

		Parcelas parcela = new Parcelas(data, valor, parcelas);
		PagamentoPaypal paypal = new PagamentoPaypal();

		System.out.println("Parcelas:");
		double[] valores = paypal.pagar(parcela.valorParcelas());
		for (int i = 0; i < parcela.valorParcelas().length; i++) {
			System.out.println(parcela.dataParcela()[i] + " - " + valores[i]);
		}
	}
}
