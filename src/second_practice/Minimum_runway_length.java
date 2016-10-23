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
public class Minimum_runway_length {
    Minimum_runway_length(){
        double v,a,length;
        Scanner sc=new Scanner(System.in);
        System.out.println("Insert the value of v");
        v=sc.nextDouble();
        System.out.println("Insert the value of a");
        a=sc.nextDouble();
        length=(v*v)/2*a;
        System.out.println("The minimum runway length for this airplane is ="+length);
    }
}
