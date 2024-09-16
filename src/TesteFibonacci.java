import java.util.Scanner;

public class TesteFibonacci {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        System.out.println("Informe um número para leitura: ");
        int numero = leitura.nextInt();

        if(ehFibonacci(numero)) {
            System.out.println("O número " + numero + " pertence a sequencia de Fibonacci");
        } else {
            System.out.println("O numero " + numero + " não pertence a sequencia de Fibonacci");
        }
    }

    public static boolean ehFibonacci(int numero) {
        int a = 0;
        int b = 1;
        int c = 0;

        while (c < numero) {
            c = a + b;
            a = b;
            b = c;
        }
        return c == numero || numero == 0;
    }
}
