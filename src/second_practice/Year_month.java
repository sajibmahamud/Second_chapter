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
public class Year_month {
    public void calculate(){
    int day;
    Scanner sc=new Scanner(System.in);
        System.out.println("insert the number of day =");
    day =sc.nextInt();
    if(day<365){
     int a=day/1;
        System.out.println("day"+a);
    }
    else{
        if(day%365==0){
          int c=day/365;
            System.out.println("year +"+c);
        }
        else{
         int c=day/365;
            System.out.println("year ="+c);
            int d=day%365;
            System.out.println("day ="+d);
        }
       
    }
}
}
