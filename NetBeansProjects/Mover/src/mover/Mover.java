
package mover;


public class Mover {

    
    public static void main(String[] args) {
       
        Moving MO = new Moving();
        B MO2 = new B();
        
       int result = MO.Demo(10);
        int result2 = MO2.Demo(100, 200);
        
        System.out.println(result);
        System.out.println(result2);
        
      MO.how();
      MO2.how();
        
        
        
        
        
        
    }
    
}
