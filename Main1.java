import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int indice = 13;
        int soma = 0;
        int K = 0;

        while (K < indice) {
            K += 1;
            soma += K;
        }
        System.out.println("O valor da variavel soma é de: " + soma);
    }
}