package SegundoDesafio;

/*
Leia um valor de ponto flutuante com duas casas decimais. Este valor representa um valor
monetário. A seguir, calcule o menor número de notas e moedas possíveis no qual o valor
pode ser decomposto. As notas consideradas são de 100, 50, 20, 10, 5, 2. As moedas
possíveis são de 1, 0.50, 0.25, 0.10, 0.05 e 0.01. A seguir mostre a relação de notas
necessárias.

*****ENTRADA*****

O arquivo de entrada contém um valor de ponto flutuante N (0 ≤ N ≤ 1000000.00).

*****SAÍDA*****

Imprima a quantidade mínima de notas e moedas necessárias para trocar o valor inicial,
conforme exemplo fornecido.
 */
import java.io.IOException;
import java.util.Scanner;

public class ValorMonetario {

	public static void main(String[] args) throws IOException {

		Scanner entrada = new Scanner(System.in);
		System.out.println("Insira um valor: ");
	
		double valorMonetario = entrada.nextDouble();

		int valor = 0;

		if(valorMonetario > 0 && valorMonetario <=1000000.00) {
			System.out.println("NOTAS:");
			valor = (int) (valorMonetario/100);
			System.out.println(valor + " nota(s) de R$100.00");
			valorMonetario = valorMonetario % 100.00;

			valor = (int) (valorMonetario/50);
			System.out.println(valor + " nota(s) de R$50.00");
			valorMonetario = valorMonetario % 50.00;

			valor = (int) (valorMonetario/20);
			System.out.println(valor + " nota(s) de R$20.00");
			valorMonetario = valorMonetario % 20.00;

			valor = (int) (valorMonetario/10);
			System.out.println(valor + " nota(s) de R$10.00");
			valorMonetario = valorMonetario % 10.00;

			valor = (int) (valorMonetario/5);
			System.out.println(valor + " nota(s) de R$5.00");
			valorMonetario = valorMonetario % 5.00;

			valor = (int) (valorMonetario/2);
			System.out.println(valor + " nota(s) de R$2.00");
			valorMonetario = valorMonetario % 2.00;

			System.out.println("MOEDAS:");
			valorMonetario = valorMonetario * 100.00;
			valor = (int) (valorMonetario/100);
			System.out.println(valor + " moeda(s) de R$1.00");
			valorMonetario = valorMonetario % 100.00;

			valor = (int) (valorMonetario/50);
			System.out.println(valor + " moeda(s) de R$0.50");
			valorMonetario = valorMonetario % 50.00;
			valor = (int) (valorMonetario/25);
			System.out.println(valor + " moeda(s) de R$0.25");
			valorMonetario = valorMonetario % 25.00;

			valor = (int) (valorMonetario/10);
			System.out.println(valor + " moeda(s) de R$0.10");
			valorMonetario = valorMonetario % 10.00;
			valor = (int) (valorMonetario/5);
			System.out.println(valor + " moeda(s) de R$0.05");
			valorMonetario = valorMonetario % 5.00;
			valor = (int) (valorMonetario/1);
			System.out.println(valor + " moeda(s) de R$0.01");
			valorMonetario = valorMonetario % 1.00;

			}else {
				System.out.println("Valor inválido");
			}
			entrada.close();			
	}
}
