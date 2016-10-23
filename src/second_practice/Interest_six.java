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
public class Interest_six {
   public void interest_six(){
       double amount =100;
       double interest=(5*100)/100;
       double amount_interest = 0;
       double total=amount+interest;
       for(int i=0;i<=5;i++){
            amount_interest=amount_interest+total;
          
            //System.out.println("total Amount"+amount_interest);
       }
       System.out.println("total Amount"+amount_interest);
   }
}
