
package overcalc;


public class Overcalc {

  
    public static void main(String[] args) {
       
        calc Re = new calc();
        
        double result = Re.add(5.5 ,5.6 , 5.2);
        System.out.println(result);
        
       float result2 = Re.add(1.2f, 1.5f);
        System.out.println(result2);
        
        
        calc fin = new calc();
        
       // fin.y = 100;     // you cacnt identify y here because the veriable Y is final integer which you cant edit it 
        System.out.println(fin.y);
        
        
        
        
    }
    
}
