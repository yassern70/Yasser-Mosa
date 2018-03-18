
package ex.of.excep;


public class A {   /* we have  two types of Exception :
                        1- exception catcher :    need  try and catch in the same function                      
                        2- exception propagator : you must write after class signature   thrown Exception,inputMismatchException adn you use try and catch when you call function in the main  class*/
    
    public void MaxVal(int val) throws Exception
    {
      //  try{
        if ( val > 100 )       // if this condition doent consist it will throw Exception to try{} and catch {}
            throw new Exception ("Your value is incorrect");
        
        System.out.println("you entered number = " + val);
        
        }
        
  /*jumping to catch if  the condition is incorrect */   
  
          // catch(Exception e)
      //    {
        //    System.out.println(e.getMessage());
            
            
            
        //  }
    }
    

