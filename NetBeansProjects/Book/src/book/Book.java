
package book;


public class Book {

  
    public static void main(String[] args) 
    {
        
        book1 java_book = new book1("JAVA","Yasser",2018,500);
        book1 PHP_book = new book1("PHP","ALI",2015,400);
        array arr = new array(java_book.author);
                
         char x [] = arr.strToArray();
         System.out.println(x);
         
         System.out.println(java_book.NO_ofpages);
         
         java_book.Openbook();
         PHP_book.Openbook();
         
         java_book.PrintBooktInfo();
         System.out.println("**********************");
         PHP_book.PrintBooktInfo();
         
         java_book.MoveToPage(140);
         
         
         java_book.Closebook();
         PHP_book.Closebook();
        
    }
}
