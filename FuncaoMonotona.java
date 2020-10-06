/**
 LABORATORIO DE PROGRAMAÇÃO - LAB 01 
 SOFIA ROCHA CAVLACANTI - 119210421
 **/

import java.util.Scanner;

public class  FuncaoMonotona{
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();

		if ((a > b) && (b>c) && (c > d)) {
			System.out.println("POSSIVELMENTE ESTRITAMENTE DECRESCENTE");

		}else if ((d > c) && (c > b) && (b >a)) {
			System.out.println("POSSIVELMENTE ESTRITAMENTE CRESCENTE");
		}else {
			System.out.println("FUNCAO NAO ESTRITAMENTE CRES/DECR");
		}
	}
}

