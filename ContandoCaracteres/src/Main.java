import java.util.Scanner;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um número: ");
        String num = sc.next();
        int quantidade = num.length();
        if (quantidade <= 4) {
            System.out.println("Este número tem " + quantidade + " caracteres!");
        } else {
            System.out.println("Este número tem 5 caracteres ou mais!");
        }

    }
}