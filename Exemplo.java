import java.util.Scanner;

public class Exemplo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Diz mesmo... " + args[0]);
        System.out.println(sc.nextLine());
        int num = sc.nextInt();
        System.out.println(num * 2);
    }         
}