
package array;

public class setarray 
{
    public String value;
    
    public setarray(String s)
   {
       this.value = s;         
            }
    
    public char[] strToArray()         
    {
        char [] array = new char[value.length()];
    
         for(int i = 0 ; i < array.length ; i++)
         {     
            array [i] = value.charAt(i);
         }  
         return (array);
    }
    
    
    
    
    
}
