
package forth;


public class Forth {


    public static void main(String[] args) {
        
        mularray m = new mularray();
        
        int [] first = {2,3,5};
        int [] second = {5,6,7};
        int v [] = m.mulArray(first , second);
        if(v != null)
       {
        for (int i=0 ; i < v.length ; i++ )
        System.out.println(v[i]);
                }
        else;
            System.out.println("result is null");
    }
        
    
}
