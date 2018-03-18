
package mover;


public class Moving 
{
    private int x,y;
    
    public int Demo(int a , int b)
    {
        this.x = a;
        this.y= b ;
        
        return(a + b);
    }        
    
    public int Demo(int a)
    {
        this.x = a;
        this.y = 10;
        
        return(a * this.y);
    }     
    
    public void how(int a)
    {
        System.out.println("how are ypu ??");
        
        
    }
    
    
    
}
