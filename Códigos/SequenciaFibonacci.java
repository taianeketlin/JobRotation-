package Códigos;

import java.util.Scanner;

public class SequenciaFibonacci {


    public static void main(String[] args) {

        Scanner entrada = new Scanner (System.in);
    
    
         System.out.print("Digite um número: ");
         int valorSequencia = entrada.nextInt();
    
         int fibonacciUm = 0;
         int fibonacciDois = 1;
         int fibonacci = 0;
    
         while(fibonacci<valorSequencia){
            fibonacci = fibonacciUm;
            fibonacci = fibonacciUm + fibonacciDois;
            fibonacciUm = fibonacciDois;
            fibonacciDois = fibonacci;
        }
        
            if(fibonacci == valorSequencia){
                System.out.print("Esse número faz parte da sequência.");
            } else {
                System.out.print("Esse número não faz parte da sequência");
            }
    
    
    
    
    
    
        }
    



    
}
