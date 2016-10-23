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
public class Distance {
    Distance(){
      double x1,y1,result;
      int x2,y2;
      Scanner sc=new Scanner(System.in);
        System.out.println("Insetr the value of x1");
     x1= sc.nextDouble();
      System.out.println("Insetr the value of y1");
      y1=sc.nextDouble();
      System.out.println("Insetr the value of x2");
      x2=sc.nextInt();
      System.out.println("Insetr the value of y2");
      y2=sc.nextInt();
      result=(((x2-x1)*(x2-x1))+((y2-y1)*(y2-y1)))*.5;
        System.out.println("The distance of the two points is"+result);
    }
}
