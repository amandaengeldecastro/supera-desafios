package TerceiroDesafio;
/*
Dado um array de inteiros e um valor alvo, determine o n�mero de pares entre os elementos
do array em que a sua diferen�a seja igual ao valor alvo.

*****EXEMPLO*****
K = 1
arr = [1,2,3,4]
Existem 3 valores cuja diferen�a � igual ao valor alvo K: 2-1 = 1, 3-2 = 1, 4-3 = 1.

*****DESCRI��O DO PROBLEMA****
Os pares t�m os seguintes par�metros:
int k: Um Inteiro, valor alvo.
int arr[n]: Um array de Inteiros.

*****RETORNO*****
int: O n�mero de pares que satisfazem o crit�rio.

*****FORMATOS DE ENTRADA*****
Seu c�digo deve conter duas entradas n e k, que representam o tamanho do array e o valor
alvo.
Seu c�digo deve conter um array de inteiros, de tamanho n.

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

		System.out.println("Insira a quantidade de n�meros que seu array ir� conter: ");
		int n = entrada.nextInt();

		System.out.println("Insira o valor alvo: ");
		int k = entrada.nextInt();

		System.out.println("Insira os n�meros do seu array: ");
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