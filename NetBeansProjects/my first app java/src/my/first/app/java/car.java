

package my.first.app.java;

public class car {
    
   
    public int speed;
    public int price;

  public car(/*int c*/) 
  {
        
    /*  this.speed = c;
      
    System.out.println("intial speed = " + c);*/
    
        }
  public void printArray ( int s [] )
  {
      for (int i : s )
          
          System.out.println(i);
      
  }
  

    public void setspeed(int s)
    {
        this.speed= s;
        
        System.out.println("setspeed = " + s);
        
        if(this. speed <  120){
            System.out.println("hurry up");
            
        }
        else if (this.speed < 220){
        System.out.println("slow down");
        }
        
        else if(this. speed >= 220){
            System.out.println (" Are you crazy.man ???" +" please be carful");
        }
       
     
        
    }

    public void incspeed(int z)
    {
        this.speed= z ;
    }
    
    public int getSpeed()
    {
     return this.speed;
       
        
    }

}


