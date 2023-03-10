package Códigos;

import java.util.Scanner;

public class FaturamentoMensal {


    public static void main(String[] args) {
        
        Scanner teclado = new Scanner (System.in);

        double sp = 67836.43;
        double rj = 36678.66;
        double mg = 29229.88;
        double es = 27165.48;
        double outros = 19849.53;
        double total = sp + rj + mg + es + outros;

        System.out.println("Lista dos Estados:");
        System.out.println(" ");
        System.out.println("1. São Paulo (SP)");
        System.out.println("2. Rio de Janeiro (RJ)");
        System.out.println("3. Minas Gerais (MG)");
        System.out.println("4. Espírito Santo (ES)");
        System.out.println("5. Outros (OUT)");
        System.out.println(" ");

        System.out.print("Digite o mês que deseja calcular o percentual: ");
        
        int percentual = teclado.nextInt();

        switch(percentual){

            case 1: 
            System.out.print("O percentual relacionado ao Estado de São Paulo é de " + ((sp*100)/total) + "%");
            break;
            case 2: 
            System.out.print("O percentual relacionado ao Estado de Rio De Janeiro é de " + (rj*100)/total+ "%");
            break;
            case 3: 
            System.out.print("O percentual relacionado ao Estado de Minas Gerais é de " + (mg*100)/total+ "%");
            break;
            case 4: 
            System.out.print("O percentual relacionado ao Estado de Espírito Santo é de " + (mg*100)/total+ "%");
            break;
            case 5: 
            System.out.print("O percentual relacionado aos demais Estados é de " + (outros*100)/total+ "%");
            break;
            default:
            System.out.println(total);
        }
        

       


    }

















    
}
