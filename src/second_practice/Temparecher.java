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
public class Temparecher {
    public void tempereture(){
        double m,q,initial_tempereture,needed_tempereture;
        Scanner sc=new Scanner(System.in);
        System.out.println("Insert the amount of water");
        m=sc.nextDouble();
        System.out.println("Insert the initial tempereture");
        initial_tempereture=sc.nextDouble();
        System.out.println("Insert the needed tempereture");
        needed_tempereture=sc.nextDouble();
        q=m*(needed_tempereture-initial_tempereture)*4148;
        System.out.println("the energy needed"+q);
    }
    
}
