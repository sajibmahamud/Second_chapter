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
public class Hexagon {
 Hexagon(){
     double s,area;
     Scanner Sc=new Scanner(System.in);
     System.out.println("Insert the side");
     s=Sc.nextDouble();
     area=((3*(3/2))/2)*(s*s);
     System.out.println("Area="+area);
 }   
}
