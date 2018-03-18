
package java102;

//paremt class

public class A 
{
    
 
 protected int val;
    
    public A ()
   {
       this.val = 10;
     
            }
    
    public A(int c)
    {
        this.val= c ;
       
    }
    
    public A(int x , int y)
    {
        this.val = x % y ;
    }
    
    public void printA()
    {   
     System.out.println("class A");    
    }
    
    public void Start()
    {
        System.out.println("Hi ");
        printA();               /*  if you want to call function printA in another function  */
        this.printA();         
    }
    
    public void setVal( int x)
    {
        this.val = x * 10 ;
    }
    
    public int getVal ()   // INT because the attribute type is int adn it will return an integer
    {
         
        return (this.val);              /*            attribute  or
                                         known veraible in the same function
                                            */
    }
        
        
        
        
  
    
    
    
    

            }
