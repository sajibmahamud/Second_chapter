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
public class Meater_reasult {
    public void meater(){
        double feet;
        double meater,reasult;
        meater=0.305;
        System.out.println("Insert the feet =");
        Scanner sc=new Scanner(System.in);
        feet=sc.nextDouble();
        reasult=feet*meater;
        System.out.println("Meater ="+reasult);
        
    }
}
