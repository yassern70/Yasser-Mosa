
package book;   // book


public class book1  
{
    // the name of the book
    String name;
    // the author of the book
    String author;
    //publishdata data of the book
    int pubData;
    //number of pages in the book
    int NO_ofpages;
    //current page that opened in the book now
    int current_page;
    //numbe rof last page
    int last_page;
    // the flag use to detect the status of the book ( closed or opened )
    boolean is_open = false; 
    
    
    /*
    this is the book constructor function
    */
    
    public book1(String a , String b , int p , int n )
  {
      this.name = a;
      this.author = b;
      this.pubData = p ;
      this.NO_ofpages = n; 
      this.is_open =  false ;
      this.current_page = 0 ;
            }
     
    // this function detecs if book is opened
    
    public void Openbook()
    {
        if(is_open)
            System.out.println("the book is opened");
        
        else;
        
       is_open = true;
       
       }
    
    //this function detect if this book is closed
    
       public void Closebook(){
           
           if(is_open)
               
               this.is_open = false;
           
           else 
           System.out.println("the book is closed");       
           
       }
       
       // htis function use to move to a convenient page in the book
       
       public int MoveToPage( int page)
   {
       if(!is_open)
           
       {System.out.println("please! open your book first  ");
        
       
       }
      else  if( page < this.NO_ofpages || page > 1 )
            
       
            System.out.println("you entered page number "+ page);
         
             
          int you_entered = page;
          return (you_entered);
   }
       
      //this function use to give us information about the book
       
       public void PrintBooktInfo()
       {
           System.out.println( "name is  " + this.name );
            System.out.println("Author is  " + this.author );
            System.out.println("publish data is " +this.pubData );
            System.out.println("numberofpages = "+this.NO_ofpages);
           
           
       }





       
   }    
           
       
        
        
        
    


