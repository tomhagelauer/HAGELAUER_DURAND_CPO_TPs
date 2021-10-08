/*
 * TP0 calculator
 * Tom Hagelauer
 * Groupe C
 * 27/09/2021
 */
package Calculator;

import java.util.Scanner;

/**
 *
 * @author tomh
 */
public class Calculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Please enter the operator: ");
        System.out.println("1) add ");
        System.out.println("2) substract ");
        System.out.println("3) multiply ");
        System.out.println("4) divide ");
        System.out.println("5) modulo ");
        int operateur;
                Scanner sc = new Scanner(System.in);
                        System.out.println("\n Entrer un nombre entier entre 1 et 5 :");
                                operateur=sc.nextInt();
                                if ((operateur>5)||(operateur<0)){
                                    System.out.println("Choissisez un nombre entre 0 et 5 svp");
                                    System.exit(0);
                                }
        int operande1;
                 sc = new Scanner(System.in);
                        System.out.println("\n Entrer le 1er nombre :");
                                operande1=sc.nextInt();
        int operande2;
                 sc = new Scanner(System.in);
                        System.out.println("\n Entrer le 2ème nombre :");
                                operande2=sc.nextInt();
        if (operateur==1) {
            System.out.println("Le résultat est: "+(operande1+operande2));
        } 
        else {
            if (operateur==2) {
                System.out.println("Le résultat est: "+(operande1-operande2));
            } 
        else {
            }
                if (operateur==3){
                    System.out.println("Le résultat est: "+(operande1*operande2));
                }
        else {
                if (operateur==4){
                    System.out.println("Le résultat est: "+(operande1/operande2));
                }
        else {
                if (operateur==5){
                    System.out.println("Le résultat est: "+(operande1%operande2));
                }
                }}}
                
    }
    
}
