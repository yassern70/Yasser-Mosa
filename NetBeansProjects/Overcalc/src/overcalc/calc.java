
package overcalc;


public class calc extends Overcalc 
{
    public int x;                     // final: means that this attribute has one value even if any  oboject call it it has a single value 
    public final static int y = 100;  // you can identify Y when it is an attribute and in the construction function
                                  // static : meeans that the attribute is mutural between all objects because it is owned by class CALC 
    public calc()
    {
     
    }
    
    public int add(int a , int b)
    {
        return(a+b);
        
    }
    
    public float add(float a , float b)
    {
        return a+b;   
    }
    
    public double add(double a , double b , double c)
    {
        return a+b+c;
    }
    
    
    
}
