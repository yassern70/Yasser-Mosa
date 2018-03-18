        /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package my.third.app;

/**
 *
 * @author Yasser
 */
public class MyThirdApp {

    public static void printVal(int x)
    {
        if(x <= 0)  
            
            return;
     
        for( int y = x ; y >= 0 ; y--)
           
           System.out.println(y);
 
       }
    
    
    
    public static void main(String[] args) {
        
     printVal(15);
        
        
    }
}

   