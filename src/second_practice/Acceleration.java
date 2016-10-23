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
public class Acceleration {
   Acceleration(){
       double v0,v1,t,a;
       Scanner sc=new Scanner(System.in);
       System.out.println("Insert the value of v0");
       v0=sc.nextDouble();
       System.out.println("Insert the value of v0");
       v1=sc.nextDouble();
       System.out.println("Insert the value of t1");
       t=sc.nextDouble();
       a=(v0+v1)/t;
       System.out.println("here the avarage ="+a);
   }
}
