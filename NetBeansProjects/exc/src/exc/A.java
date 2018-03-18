
package exc;


public class A 
{
    public void fan (int val)
    {
        try
        {
            if(val > 100)
            throw new Exception("unsupported number");   
            System.out.println(val);
        }
        
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
    
}
