package teste;
import java.util.Scanner;


public class Questao2 {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        
        System.out.print("Digite um número: ");
        int numero = scn.nextInt();
        
        boolean pertence = calcularFibonacci(numero);
        
        if (pertence) {
            System.out.println("O número " + numero + " pertence à sequência de Fibonacci.");
        } else {
            System.out.println("O número " + numero + " não pertence à sequência de Fibonacci.");
        }
    }
    
   public static boolean calcularFibonacci(int numero) {
        int a = 0;
        int b = 1;
        
        if (numero == 0 || numero == 1) {
            return true;
        }
        
        while (b <= numero) {
            int aux = b;
            b = a + b;
            a = aux;
            
            if (b == numero) {
                return true;
            }
        }
        
        return false;
    }
}
