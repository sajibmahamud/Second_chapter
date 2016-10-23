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
public class Reminder {
    public void reminder(){
        Scanner sc= new Scanner(System.in);
        int number  ;
        System.out.println("Enter a number");
        number = sc.nextInt();
        
        int lastIndex = number%10; 
        
        int secondIndex = (number/10)%10; 
        int thirdIndex = ((number/10)/10)%10;
        
        
        System.out.println(lastIndex+secondIndex+thirdIndex);
        
    }
    
}
