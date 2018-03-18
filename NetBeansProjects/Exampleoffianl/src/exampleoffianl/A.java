
package exampleoffianl;


public final class A {  // fi class : means that you cant use inheritance with this function
                        // (you cannt use extend with this class ) EX| public void hello() extends A    it is wrong    
  
    public final static float PI = 3.14f;
    public final float OC;
    public float result;
    
    
    public A()
    {
        this.OC = 0;   
    }
    
    public A(float c)
    {
        this.OC = c ;
        this.result = (2 * PI + this.OC);
        
        
        
    }
    
        public final void dem(){         /* final with methods: we use it to force extend class to not edit this function when calling it
                                            you cannt use Override*/
        System.out.println("hello world");
        
    }

}
