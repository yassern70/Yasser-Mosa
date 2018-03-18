
package third; // print every letter in single line


public class Third {

    
    public static void main(String[] args) {
        
        /*this method use to  arrange number with decreasin( from up to down) 
        *and function call*/
        loop d = new loop();
         d.Dec(15);
      
     /* this method use to write  an only one letter in the line  like:
     *Y
      a
      s
      s
      r
      etc..   
      */   
     
      String name ="Yasser Mosa";
      for(int i = 0 ;  i <  name.length()  ; i++)
      {    
          // this code use to store every letter in String 
        char x =  name.charAt(i); 
        System.out.println(x);
          
              }
          
      /* thsi method use to  print letters reversly Respectively
      */
     
      String site ="www.yaser.com";
      
      for(int i = site.length() -1  ; i >= 0  ; i-- )
      {   
       // this code use to store every letter in String 
          
         char ch  = site.charAt(i);
         System.out.print(ch);
          
          
      }
    }
}
