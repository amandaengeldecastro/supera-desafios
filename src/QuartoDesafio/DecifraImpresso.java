package QuartoDesafio;
/*
 A sua impressora foi infectada por um vírus e está imprimindo de forma incorreta. Depois
de olhar para várias páginas impressas por um tempo, você percebe que ele está
imprimindo cada linha de dentro para fora. Em outras palavras, a metade esquerda de cada
linha está sendo impressa a partir do meio da página até a margem esquerda. Do mesmo
modo, a metade direita de cada linha está sendo impressa à partir da margem direita e
prosseguindo em direção ao centro da página.

Por exemplo a linha:
THIS LINE IS GIBBERISH
está sendo impressa como:
I ENIL SIHTHSIREBBIG S

Da mesma forma, a linha " MANGOS " está sendo impressa incorretamente como
"NAM SOG". Sua tarefa é desembaralhar (decifrar) a string a partir da forma como ela foi
impressa para a sua forma original. Você pode assumir que cada linha conterá um número
par de caracteres.

*****ENTRADA*****
*
A entrada contém vários casos de teste. A primeira linha de entrada contém um
inteiro N que indica a quantidade de casos de teste. Seguem N linhas, cada uma com uma
frase com no mínimo 2 e no máximo 100 caracteres de letras maiúsculas e espaços que
deverá ser desembaralhada (decifrada) à partir da forma impressa para a sua forma
original, conforme especificação acima.

*****SAIDA*****

Para cada linha de entrada deverá ser impressa uma linha de saída com a frase decifrada,
conforme a especificação acima.

 */
import java.io.IOException;
import java.util.Scanner;

public class DecifraImpresso {

	public static String readLine(Scanner entrada) {
		String frase = entrada.nextLine();
		while (frase.isEmpty()) 
			frase = entrada.nextLine();
		return frase;
	}

	public static void main(String[] args) throws IOException {

		Scanner entrada = new Scanner(System.in);

		int nLinha = entrada.nextInt();


		for (int i = 0; i <= nLinha; i++) {
			String frase = readLine(entrada);
			StringBuilder primeiraMetade = new StringBuilder(frase.substring(0, frase.length() / 2));
			StringBuilder segundaMetade = new StringBuilder(frase.substring(frase.length() / 2, frase.length()));
			primeiraMetade.reverse();
			segundaMetade.reverse();
			char min = 2, max = 100;
			if (frase.length() > min && frase.length() < max) {
				System.out.println(primeiraMetade.toString() + segundaMetade.toString());
			} else {
				System.out.println("Número de caracteres inválido!");
			}
		}
		entrada.close();
	}
}
