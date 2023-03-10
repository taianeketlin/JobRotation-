package Códigos;
import java.util.Arrays;


public class FaturamentoDiario {
    

    public static void main(String[] args) {
   
  
        //Vetor com os valores diário 
    
        double valorDiario [] = {22174.1664, 24537.6698, 26139.6134, 0.0, 0.0, 26742.6612, 0.0, 42889.2258, 46251.174, 11191.4722, 0.0, 0.0, 3847.4823, 373.7838, 2659.7563, 48924.2448, 18419.2614, 0.0, 0.0, 35240.1826, 43829.1667,43829.1667, 18235.6852, 4355.0662, 13327.1025, 0.0, 0.0, 25681.8318, 1718.1221, 13220.495, 8414.61
        };
    
        // Cálculo do menor faturamento:
    
        double menorFaturamento = Arrays.stream(valorDiario).min().getAsDouble();
        System.out.println("Menor faturamento diário: " + menorFaturamento);
    
        // Cálculo do maior faturamento:
    
        double maiorFaturamento = Arrays.stream(valorDiario).max().getAsDouble();
        System.out.println("Maior faturamento diário: " + maiorFaturamento);
    
        //Cálculo da média de faturamento:
        
         double soma=0;
          for(int i =0; i < valorDiario.length; i++){
             soma += valorDiario[i];
          }
         double media = soma/valorDiario.length;
         System.out.print("A média de faturamento foi de "+ media);
    
         //Dias em que o faturamento foi maior que a média.
    
        
    
    
    
         }










}
