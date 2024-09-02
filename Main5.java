import java.util.Scanner;


public class Main5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite uma frase: ");
        String frase = scanner.nextLine();

        System.out.println(new StringBuilder(frase).reverse().toString());
    }
}