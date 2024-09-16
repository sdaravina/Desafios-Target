import java.util.Scanner;

public class TesteString {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in); 
        
        System.out.println("Escreva uma palavra: ");
        String palavraRecebida = leitura.nextLine(); 

        String palavraInvertida = "";

        for(int i = palavraRecebida.length() - 1; i >= 0 ; i--) {
            palavraInvertida += palavraRecebida.charAt(i);
        }

        System.out.println("Palavra invertidade: " + palavraInvertida);
    }
}
