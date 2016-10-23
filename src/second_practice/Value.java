/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package second_practice;

import java.util.Scanner;

/**
 *
 * @author Sajib
 */
class Value {
      public void reasult(){
        double pie,radious,area,value,length;
        pie=3.1416;
        System.out.println("Insert the radious=");
        Scanner sc=new Scanner(System.in);
        radious=sc.nextDouble();
        area=radious*radious*pie;
        System.out.println("Area="+area);
          System.out.println("Insert the length=");
        length=sc.nextDouble();
        value=area*length;
        System.out.println("Value ="+value);
    
}
}
