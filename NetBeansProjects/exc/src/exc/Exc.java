/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exc;

import java.util.Scanner;
import java.util.InputMismatchException;

/**
 *
 * @author Yasser
 */
public class Exc {

    /**
     * @param args the command line arguments
     */
  public static void main(String[] args) {
     
        Scanner SC = new Scanner(System.in);
        int x,y;
        
        try     
        {
        System.out.println("enter fir st number X = ");
        
         x = SC.nextInt();
         
         System.out.println("rnter the second number Y = ");
         
         y = SC.nextInt();
         
         System.out.println("result = " + (x / y));
         
        }
        
        catch (InputMismatchException e)   // e is  an obect which error caused b user input stored in it 
        {                     // Exeption is a class
         System.out.println("wrong input please enter your number only ! ");
         System.out.println("MIsmatch exeption"); 
        }
        
        catch(ArithmeticException e)
        {
            System.out.println("scientific error ");   
        }
        
        finally
        {
        System.out.println("Done");
        }
        
    }
    
}
