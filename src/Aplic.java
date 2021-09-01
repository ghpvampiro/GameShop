import java.util.Scanner;
import fatec.poo.model.GameShop;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author gusta
 */
public class Aplic {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int usuario,idade;
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Digite o codigo do usuário:");
        usuario = entrada.nextInt();
        
        System.out.println("Digite a idade:");
        idade = entrada.nextInt();
        
        GameShop gm = new GameShop(usuario,idade);
        
        int opcao;
        
        do { 
            
            System.out.println("************************");
            System.out.println("*****GAME SHOP*****");
            System.out.println("************************");
            System.out.println("\n\n");
        
            System.out.println("1 - Comprar Horas");
            System.out.println("2 - Jogar");
            System.out.println("3 - Brinde");
            System.out.println("4 - Consultar Saldo de Horas");
            System.out.println("5 - Sair");
            System.out.print("\n\n\t Digite a opcao: ");
            opcao = entrada.nextInt();
            System.out.println("\n");  

            switch (opcao) {
                case 1: /*Comprar Horas*/
                    double tempComp = 0;
                    System.out.println("Digite a quantidade de horas que deseja Comprar:");
                    tempComp = entrada.nextDouble();
                    
                    gm.comprar(tempComp);
                    System.out.println("Você comprou " + tempComp + " Horas e agora possui em sua conta " + gm.getQtdeHoras() + " Horas!");
                    
                    break;

                case 2:/*Jogar*/
                    double tempJog = 0;
                    System.out.println("Digite a quantidade de horas que deseja Jogar:");
                    tempJog = entrada.nextDouble();
                    
                    gm.jogar(tempJog);
                    System.out.println("Você gastou " + tempJog + " Horas e agora possui em sua conta " + gm.getQtdeHoras() + " Horas!");
                    
                    break;

                case 3: /*Brinde*/
                    System.out.println("*******************************");
                    System.out.println("ESTE USUARIO ACABA DE GANHAR UM BRINDE!");
                    System.out.println("*******************************");
                    System.out.println("O total de horas em sua conta era de " + gm.getQtdeHoras());
                    gm.brinde();
                    System.out.println("Agora o total é de " + gm.getQtdeHoras());
                    
                    break;
                    
                case 4: /*Consultar Saldo de Horas*/
                    System.out.println("A quantidade de horas disponivel para este usuário é de " + gm.getQtdeHoras());
                    
                    break;
            }
           
        System.out.println("************************");
        System.out.println("\n\n");  
        } while (opcao < 5);
        
        
        
        
    }
    
}
