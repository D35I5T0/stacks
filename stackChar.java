package pacote;
public class stackChar {  
    private char[] dados; 
    private int qtd; 

    public stackChar(int tam) { 
        dados = new char[tam]; 
    } 

    public void push(char letra) { 
         if (isFull() == true) {
            System.out.println("O vetor está cheio");
         }
         else {
            this.dados[qtd] = letra;
            qtd++;
         }
    } 

    public char pop() { 
        char letra = ' ';
        if (isEmpty() == true) {
            System.out.println("O vetor está vazio");
        }
        else {
            letra = top();
            this.dados[this.qtd - 1] = ' ';
            qtd--;
        }
        return letra;
    } 
    public char top() { 
        char letra = ' ';
        if (isEmpty() == true) {
            System.out.println("O vetor está vazio");
        }
        else {
            letra = this.dados[this.qtd - 1];
        }
        return letra;
    } 
    public boolean isEmpty() { 
        boolean result = false;
        if (this.qtd == 0) {
            result = true;
        }
        return result;
    } 

    public boolean isFull() { 
        boolean result = false;
        if (this.qtd == this.dados.length) {
            result = true;
        }
        return result;
    }
} 
