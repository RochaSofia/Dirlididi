import java.util.Scanner;

public class Centavo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int soma = 0;
        int cont = 0;
        int num = 0;
        int maior = -1;
        while(true){
            num = sc.nextInt();
            if(num == 0 || cont == 100) {break;}
            soma += num;
            cont++;
            if(num > maior){
                maior = num;
            }
        }
        System.out.println("A soma é " + soma);
        int media = (int) soma/cont;
        System.out.println("A média é " + media);
        System.out.println("O maior valor foi de " + maior + " centavos.");
    }
}
