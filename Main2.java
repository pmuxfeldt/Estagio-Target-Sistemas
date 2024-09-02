import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número:");
        int numero = scanner.nextInt();

        if (Fibonacci(numero)) {
            System.out.println(numero + " pertence à sequência de Fibonacci.");
        } else {
            System.out.println(numero + " não pertence à sequência de Fibonacci.");
        }
    }

    public static boolean Fibonacci(int verificador) {
        int primFibo = 0;
        int segFibo = 1;

        if (verificador == 0 || verificador == 1) {
            return true;
        }

        while (segFibo < verificador) {
            int nextFibo = primFibo + segFibo;
            primFibo = segFibo;
            segFibo = nextFibo;
        }

        return segFibo == verificador;
    }

        /* int primFibo = 0;
        int segFibo = 1;

        int nextFibo = 0;

        while (nextFibo != numero) {

            do {
                //int cont = 1; cont <= numero; cont++ {

                System.out.println(primFibo);

                nextFibo = primFibo + segFibo;
                primFibo = segFibo;
                segFibo = nextFibo;

            } while (primFibo != numero);
        } */

        //System.out.println("O valor da variavel soma é de: " + numero);






/* nextFibo = primFibo + segFibo;
nextFibo = primFibo - segFibo;
segFibo = nextFibo;
segFibo = nextFibo; */


}