
package simplecalc;


public class anotherclass extends c
{
    public anotherclass() 
    {
        super();    // I think it is optional    
    }
    
    public anotherclass(int a , int b)
    {
        super(a,b);
    }
    
    public int mul()
    {
        return(this.getX()*this.getY());
    }
    
    public double div()
    {
        int y = this.getY();
        if(y == 0)
        {
            System.out.println("uknown process");
            
        }
        
        return(this.getX() / this.getY());
        
    }
    
 


    
}
