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
public class Second_practice {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //TODO code application logic here
        //System.out.println("insert the celsious =");
        Scanner sc=new Scanner(System.in);
        int celsious=sc.nextInt();
        float farenhite;
        farenhite=(9/5)*(celsious+32);
        System.out.println("Farenhite ="+farenhite);
        Value a =new Value();
        a.reasult();
        //comment
        Meater_reasult b=new Meater_reasult();
        b.meater();
        kilogram c=new kilogram();
        c.ans();
        Gratuty_total d=new Gratuty_total();
        d.gratuty();
        Year_month e=new Year_month();
        e.calculate();
        Reminder m=new Reminder();
        m.reminder();
        Interest f=new Interest();
       Interest_six z=new Interest_six();
       z.interest_six();
       Temparecher y=new Temparecher();
       y.tempereture();
       Display x=new Display();
      x.display();
      Distance w=new Distance();
      Triangle v=new Triangle();
      Hexagon u=new Hexagon();
      Acceleration g=new Acceleration();
       Minimum_runway_length h=new Minimum_runway_length();
        
    }
    
}
