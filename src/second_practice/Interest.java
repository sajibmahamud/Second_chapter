/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package second_practice;

/**
 *
 * @author Sajib
 */
import java.util.Scanner;
public class Interest {
    Interest(){
        double parcentage,balence,interest;
        Scanner sc= new Scanner(System.in);
        System.out.println("Insert the balence =");
        balence=sc.nextDouble();
        System.out.println("Insert parcentage ");
        parcentage=sc.nextDouble();
        interest=(parcentage*balence)/100;
        double monthly_interest=(interest/12);
        System.out.println("Interest ="+monthly_interest);
    }
    
}
