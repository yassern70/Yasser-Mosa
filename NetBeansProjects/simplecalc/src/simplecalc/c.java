
package simplecalc;
import java.util.Scanner;

public class c 
{
    private int x;
    private int y;
    private Scanner SC;
    private A a1;
    
    public c()
    {
        this.x  = 0;
        this.y = 0;
    }
    
    public c(int x , int y )
    {
        
        this.x  = x ;
        this.y = y ;
    /* this.SC = new Scanner(System.in);
     System.out.println("please enter your first number = ");
     this.x = this.SC.nextInt();
     System.out.println("please enter your second number");
     this.y = this.SC.nextInt();*/
    }
    
    public int sum()
    {
        return (this.x + this.y);
    }
    
    public int sub()
    {
        
        return (this.x - this.y);
    }
    
    public void setX( int a)
    {
        this.x = a;
    }
    
    public void setY(int a)
    {
        this.y = a;
    }
    
    public int getX()
    {
        return(this.x);
    }
    
    public int getY()
    {
        return(this.y);
        
        
    }
    
    
    
}
