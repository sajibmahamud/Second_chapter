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
public class Gratuty_total {
    public void gratuty(){
        double subtotal,gratuty,percantage,total;
        Scanner sc=new Scanner(System.in);
        System.out.println("Inter the subtotal =");
        subtotal =sc.nextDouble();
        System.out.println("Inter the gratuty =");
        gratuty=sc.nextDouble();
        percantage=(subtotal*gratuty)/100;
        System.out.println("Gratuty ="+percantage);
        total=percantage+subtotal;
        System.out.println("total ="+total);
        }
    
}
