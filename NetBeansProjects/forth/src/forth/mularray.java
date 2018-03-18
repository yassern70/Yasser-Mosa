
package forth;


public class mularray 
{
    public int [] mulArray ( int [] a , int [] b )
    { 
        if (  a.length !=  b.length  )
        return (null);
        
        int [] result = new int[b.length]; 
        for(int i = 0 ; i < a.length ; i++ )
            
              result [i] =  a[i] *  b[i];
            
    
            return(result);
    }
    
    
    
    
    
    
    
}
