package book;

public class array 
{
    public String value;
    
    public array(String s)
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
