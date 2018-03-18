
package simplecalc;

import java.util.Scanner;  // scanner is a class conatain plenty of functions
                           // scanner waits c user to enter input adn give us outputs (results
public class Simplecalc {


    public static void main(String[] args) {
       
       anotherclass calc = new anotherclass(4,2); 

       
       /*Scanner F = new Scanner(System.in);
       
       
       System.out.println("please enter your name : ");
       String name = F.next();
               
       
       System.out.println("please enter your age ");
       int c = F.nextInt();      // nextint is a function included in class scanner 
       System.out.println("Your name is :" + name);
       System.out.println("your age is : " + c);
       
       double x = Math.random();
       System.out.println(x);*/
       
       
      int result = calc.sub();
       System.out.println(result);
       
       calc.setX(100);
       calc.setY(200);
       
       result = calc.sum();
       System.out.println(result);
       
       result = calc.sub();
       System.out.println(result);
       
       result = calc.mul();
       System.out.println(result);
       
       double result1  = calc.div();
       System.out.println(result1);
       
       
       System.out.println(calc.getX());
       System.out.println(calc.getY());
       
       A z = new A();
       A c =new A();
       
       z.y = 100 ;
       c.y = 150 ;   // A.y = 150  because java cinsider c.y as A.y 
       System.out.println(A.y);
       
    
       // static application it is distinguished by  
       
       
       
       
       /*int result = A.add(5 , 6);
       System.out.println(result);
       
       result = A.sub(5 , 6);
       System.out.println(result);
       
       result = A.mul(5,6);
       System.out.println(result);
       
       result = A.div(5, 6);
       System.out.println(result);
       
       A.setY(150);
       System.out.println(A.getY());*/
       
       
       
       
        
    }
    
}
