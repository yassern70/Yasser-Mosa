
package java102;


public class Java102 {
    
    


    public static void main(String[] args) 
    {
       A zero = new A(50);
       A z = new A();
       A v = new A(15,4);
           System.out.println(z.val);
       B o = new B();
       o.PrintB();
       System.out.println(o.val);
   /*    C call = new C(); 
       
       System.out.println(call.val);*/
       

       
       z.val = 500;    // value of val in object  X = 10  ; changed value of int  = 10 to 500 then we print it
    System.out.println(z.val);
     /*  C hello = new C();
       
        
        call.printA();
        hello.PrintC();*/
        
        
       A y = new A();
        y.setVal(100);
        int m = y.getVal();
        System.out.println(m);
        
        
        
        
        
        
        
      
    }
    
}
