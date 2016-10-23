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
public class kilogram {
    public void ans(){
        double pound,kilo,kilogram;
        kilo=0.454;
        Scanner sc=new Scanner(System.in);
        System.out.println("insert the pound =");
        pound=sc.nextDouble();
        kilogram=pound*kilo;
        System.out.println("kilogram"+kilogram);
    }
}
