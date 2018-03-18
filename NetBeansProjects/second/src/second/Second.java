
package second; // calculator


public class Second
        
{


    public static void main(String[] args)  
    {
        /*making new object adn put a vlue inthe parameters
        then printout the result ( which it is the object name )
        */ 
       
        calc c = new calc();
        
      int result = c.sum(23,5);
      System.out.println(result);
      
      result = c.min(25,50);
      System.out.println(result);
      
      result = c.mul(5,8);
      System.out.println(result);
      
      result = c.div(25, 25);
      System.out.println(result);
            
    }
    
}
