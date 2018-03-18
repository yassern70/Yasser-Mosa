
package ex.of.excep;


public class ExOfExcep {

   
   public static void main(String[] args) 
    {
        A MAx = new A();
        
        try{
            
        MAx.MaxVal(1000);
        
        }
        
        catch(Exception e)
        {
            System.out.println(e.getMessage());
            
            
           
            
            
        }
        
    
       
    }
    
}
