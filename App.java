package pacote;
import java.util.Scanner;
public class App {
    public static void main (String[] args) {
        Scanner sc = new Scanner (System.in);
        int op, valor;

        System.out.println("Informe o tamanho do vetor");
        int tam = sc.nextInt();
        stackInt pilha = new stackInt(tam);

        do {
            menu();
            op = sc.nextInt();
            switch (op) {
                case 1:
                    System.out.println("Informe o número: ");
                    valor = sc.nextInt();
                    pilha.push(valor);
                    break;
                case 2:
                    System.out.println(valor = pilha.pop()); 
                    break;
                case 3:
                    System.out.println(valor = pilha.top()); 
                    break;
                case 4:
                    pilha.exibirLista();
                    break;
                case 0:
                    System.out.println("Fim de programa");
                    break;
                default:
                    System.out.println("Tente de novo");
                    break;
            }

        } while (op != 0);

        sc.close();
    }
    public static void menu() {
        System.out.println("1 - Colocar numero na pilha");
        System.out.println("2 - Retirar numero da pilha");
        System.out.println("3 - Mostrar numero do topo da pilha");
        System.out.println("4 - Exibir pilha");
        System.out.println("0 - Finalizar programa");
    }
}
