package pacote;
import java.util.Scanner;
public class App {
    public static void main (String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Digite uma frase: ");
        String frase = sc.nextLine();
        int tam = frase.length();
        stackChar pilha = new stackChar(tam);

        for (int i = 0; i < tam; i++) {
            char letra = frase.charAt(i);
            if (Character.isLetter(letra)) {
                pilha.push(letra);
            }
        }
        while (!pilha.isEmpty()) {
            System.out.print(pilha.pop());
        }
        sc.close();
    }
}

