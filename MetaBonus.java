import java.util.Scanner;

public class MetaBonus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(calculaMeta(n));
        System.out.println(calculaBonus(n));
    }

    public static int calculaMeta(int n){
        int base = (int) (0.2 * n);
        return Math.min(20, base);
    }

    public static int calculaBonus(int n){
        int base = 2 * calculaMeta(n);
        return (int) Math.ceil((n - base) * 0.05);
    }
}
