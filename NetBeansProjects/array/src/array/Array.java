
package array;


public class Array {

  
    public static void main(String[] args) 
    
    {
       setarray a = new setarray("www.msn.com");
       char x [] = a.strToArray();
       System.out.println(x);
       
        // to print String vertically
        
        for(int i=0 ; i < x.length ; i++ )
           System.out.println(x[i]);
        
        
        
       
    }
    
}
