package my.second.app;



public class car {
    
   
    public int speed;
    public int price;

   public car() {
      
       
       
    }

    public void setspeed(int s)
    {
        this.speed = s ;
        
switch(this.speed)
{
    
    case 10 :
    case 20 :
    case 50 :
    case 400 :
    case 6000 :
        
        System.out.println("take care" + " you should do your best");
        
        break;
        
    case 5000 :
        System.out.println("50000km");
        break;
        
    default :      //   غير ذالك
        System.out.println("None" + " speed");
    
          }
    }
    public car(int c){
        
     this.speed=c;
     
    }
    public void incspeed(int z)
    {  
        this.speed=z;
    }
    
    public int getSpeed()
    {
     return this.speed;
       
        
    }

 

}