package Códigos;
import java.util.Scanner;

public class InvertendoString {
        
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner (System.in);
        String palavraNova = "";
        
        System.out.print("Digite uma palavra: ");
        String string = entrada.next();

        for (int i = string.length() - 1; i >= 0; i--){
            palavraNova = palavraNova + Character.toString(string.charAt(i));

        }

        System.out.print(palavraNova);

    }
    
}
