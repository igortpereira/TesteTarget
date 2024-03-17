
package teste;

public class Questao5 {
    public static void main(String[] args) {
        String original = "Teste de estágio";
        
        String invertida = inverterString(original);
        
        System.out.println("String original: " + original);
        System.out.println("String invertida: " + invertida);
    }
    
    public static String inverterString(String original) {
        String invertida = "";
        
        for (int i = original.length() - 1; i >= 0; i--) {
            invertida += original.charAt(i);
        }
        
        return invertida;
    }
}
