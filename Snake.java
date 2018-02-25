public class Snake{
   //fields
   private int x;
   private int y;
   private String sound;   
   //constructors
   public Snake(){
      x = (int) Math.floor(Math.random()*10);
      y = (int) Math.floor(Math.random()*10);
      sound = "I'm the snake and I'm standing at ";
   }
   
   public Snake(int x0, int y0){
      //x in [0;9]
      if (x0<0)
         x = 0;
      else if (x0>9)
         x = 9;
      else
         x = x0;
      //y in [0;9]
      if (y0<0)
         y = 0;
      else if (y0>9)
         y = 9;
      else
         y = y0;
      sound = "I'm the snake and I'm standing at ";
   }
   
   //setters and getters
   public void setX(int dx){
      x = dx;
   }
   public void setY(int dy){
      y = dy;
   }
   public int getX(){
      return x;
   }
   public int getY(){
      return y;
   }
   
   //move random -1, 0 or 1
   public void move(){
      x += Math.floor(Math.random()*3)-1;
      y += Math.floor(Math.random()*3)-1;
      //x in [0;9]
      if (x<0)
         x = 0;
      else if (x>9)
         x = 9;
      //y in [0;9]
      if (y<0)
         y = 0;
      else if (y>9)
         y = 9;
   }
   
   //tell message
   public void tell(){
      System.out.println(sound + "(" + x + "," + y + ")");
   }
   
   //beg
   public void eat(){
      System.out.println("I'm hungry not much longer. Slurp!");
   }
}