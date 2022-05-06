package TerceiroDesafio;
/*
Dado um array de inteiros e um valor alvo, determine o número de pares entre os elementos
do array em que a sua diferença seja igual ao valor alvo.

*****EXEMPLO*****
K = 1
arr = [1,2,3,4]
Existem 3 valores cuja diferença é igual ao valor alvo K: 2-1 = 1, 3-2 = 1, 4-3 = 1.

*****DESCRIÇÃO DO PROBLEMA****
Os pares têm os seguintes parâmetros:
int k: Um Inteiro, valor alvo.
int arr[n]: Um array de Inteiros.

*****RETORNO*****
int: O número de pares que satisfazem o critério.

*****FORMATOS DE ENTRADA*****
Seu código deve conter duas entradas n e k, que representam o tamanho do array e o valor
alvo.
Seu código deve conter um array de inteiros, de tamanho n.

*****EXEMPLO DE ENTRADA*****

STDIN Function
----- --------
5 2 arr[] tamanho n = 5, k =2
1 5 3 4 2 arr = [1, 5, 3, 4, 2]

*****EXEMPLO DE SAIDA*****
3
 */
import java.util.Scanner;

public class ValorAlvo{

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.println("Insira a quantidade de números que seu array irá conter: ");
		int n = entrada.nextInt();

		System.out.println("Insira o valor alvo: ");
		int k = entrada.nextInt();

		System.out.println("Insira os números do seu array: ");
		int [] arr = new int [n];
		int count = 0;

		for (int i = 0; i < arr.length-1; i++) {
			arr[i] = entrada.nextInt();	
			for (int j=0; j < arr.length; j++) {
				int diferenca = arr[i+1]-arr[i];
				if (diferenca == k) {
					count++;
				}
			}
		}
		System.out.println(count);
	}
}