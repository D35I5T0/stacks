package pacote;
public class stackInt {  
    private int[] dados; 
    private int qtd; 

    public stackInt(int tam) { 
        dados = new int[tam]; 
    } 

    public void push(int valor) { 
         if (isFull() == true) {
            System.out.println("O vetor está cheio");
         }
         else {
            this.dados[qtd] = valor;
            qtd++;
            System.out.println("Operação realizada");
         }
    } 

    public int pop() { 
        int valor = 0;
        if (isEmpty() == true) {
            System.out.println("O vetor está vazio");
         }
         else {
            valor = this.dados[0];
            this.dados[0] = 0;
            qtd--;
            System.out.println("Operação realizada");
         }
         return valor;
    } 
    public int top() { 
        int valor = 0;
        if (isEmpty() == true) {
            System.out.println("O vetor está vazio");
        }
        else {
            valor = this.dados[0];
            System.out.println("Operação realizada");
        }
        return valor;
    } 
    public boolean isEmpty() { 
        boolean result;
        if (this.qtd == 0) {
            result = true;
        }
        else {
            result = false;
        }
        return result;
    } 

    public boolean isFull() { 
        boolean result;
        if (this.qtd == this.dados.length) {
            result = true;
        }
        else {
            result = false;
        }
        return result;
    }

    public void exibirLista() {
        if (isEmpty() == true) {
            System.out.println("Vetor vazio!");
        }
        else {
            for (int i = 0; i < this.qtd; i++) {
                System.out.print(this.dados[i] + " ");
            }
            System.out.println(" ");
        }
    }
} 
