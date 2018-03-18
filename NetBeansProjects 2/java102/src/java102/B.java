
package java102;

//child class

public class B extends A {

    public B()
    {
        super(14%6);
        this.val= 90;
        
        
            
    }
    
    public void PrintB(){
        
        System.out.println("class B");
        
     super.printA();     //  we use this function beacuasee inheritance with  class A
        
        
    }
    
    
    
}
