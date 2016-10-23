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
public class Triangle {
 Triangle(){
     double x1,x2,x3,y1,y2,y3,set1,set2,set3,s,area;
     Scanner Sc=new Scanner(System.in);
     System.out.println("Insert the value of x1");
     x1=Sc.nextDouble();
     System.out.println("Insert the value of x2");
     x2=Sc.nextDouble();
     System.out.println("Insert the value of x3");
     x3=Sc.nextDouble();
     System.out.println("Insert the value of y1");
     y1=Sc.nextDouble();
     System.out.println("Insert the value of y2");
     y2=Sc.nextDouble();
     System.out.println("Insert the value of y3");
     y3=Sc.nextDouble();
     set1=x1+x2;
     set2=y1+y2;
     set3=y3+y3;
     s = (set1+set2+set3)/2;
     area=(s*(s-set1)*(s-set2)*(s-set3))*.5;
     System.out.println("Area="+area);
     
     
 }   
}
