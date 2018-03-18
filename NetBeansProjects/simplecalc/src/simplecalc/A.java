
package simplecalc;


public class A 
{
    public int x;
    public static int y ;
    
    public static int  add(int a , int b)
    { 
        return(a+b);  
       
    }
    
    public static int sub(int a , int b)
    {
        return(a-b);
    }
    
    public static int mul(int a , int b)
    {
        return(a*b);
    }
    
    public static int div(int a , int b)
    {
        if(b==0)
            System.out.println("unkonwn");
        
        return(a/b);
        
        
    }
    
    public static void setY (int a )
    {
        A.y = a;
    }
    public static int getY()
    {
        return(A.y);
        
        
    }
    
}
