package PrimeiroDesafio;

/*
Considerando a entrada de valores inteiros não negativos, ordene estes valores segundo 
o seguinte critério:
• Primeiro os Pares
• Depois os Ímpares
Sendo que deverão ser apresentados os pares em ordem crescente e depois os ímpares
em ordem decrescente.

 *****ENTRADA*****

A primeira linha de entrada contém um único inteiro positivo N (1 < N <= 105) Este é o
número de linhas de entrada que vem logo a seguir. As próximas N linhas conterão, cada
uma delas, um valor inteiro não negativo.

 *****SAÍDA*****

Apresente todos os valores lidos na entrada segundo a ordem apresentada acima. Cada
número deve ser impresso em uma linha, conforme exemplo abaixo.
 */


import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ParCrescenteImparDecrescente {

	public static void main(String[] args) throws IOException {
		Scanner entrada = new Scanner(System.in);

		System.out.println("Insira a quantidade de números que deseja ordenar: \nObs: minimo 2 | maximo 10 ");
		int qtdNumeros = entrada.nextInt();

		List<Integer> listaNumeros = new ArrayList<>();

		if (qtdNumeros > 1 && qtdNumeros <=10) {

			System.out.println("Insira os valores que deseja ordenar: ");

			for (int i = 0; i < qtdNumeros; i++){
				listaNumeros.add(Integer.parseInt(entrada.next()));		
			}

			var par = listaNumeros.stream().filter(l -> l % 2 == 0).sorted().collect(Collectors.toList());
			var impar = listaNumeros.stream().filter(l -> l % 2 != 0).sorted(Comparator.reverseOrder()).collect(Collectors.toList());

			List<Integer> ordenacao = new ArrayList<>();
			ordenacao.addAll(par);
			ordenacao.addAll(impar);
			ordenacao.forEach(System.out::println);

		} else {
			System.out.println("Serão validos apenas números maiores que 1 ou iguais e menores que 10");
		}	
		entrada.close();
	}
}
