/**
LABORATORIO DE PROGRAMAÇÃO - LAB01
SOFIA ROCHA CAVALCANTI -119210421
 */

import java.util.Scanner;
public class Wally {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);


		while (true) {
			String entrada = sc.nextLine();
			if(entrada.equals("wally")) {
				break;
			}
			String[] linha = entrada.split(" ");
			String saida = null;

			for (int i = 0; i < linha.length; i++) {
				int contador = 0;
				for (int j = 0; j < linha[i].length(); j++) {
					contador += 1;
				}
				if (contador == 5) {
						saida = linha[i];
					}
			}
				if (saida== null) {
					System.out.println("?");
				}
				else {
				System.out.println(saida);
				}
			}
		}
	}


