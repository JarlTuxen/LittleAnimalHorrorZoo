public class LittleAnimalHorrorZoo{
   
   public static void main(String[] args){
      boolean endOfGame = false;
      int iterations = 0;
      
      //create a snake and a rabbit
      Snake slange = new Snake();
      Rabbit kanin = new Rabbit();
      
      while(!endOfGame){
         //count iterations in game
         iterations++;
         //move rabbit and snake
         kanin.move();
         kanin.tell();
         slange.move();
         slange.tell();
         //kanin and snake at same position?
         endOfGame = (kanin.getX() == slange.getX() && kanin.getY() == slange.getY());
         //if (kanin.getX() == slange.getX() && kanin.getY() == slange.getY())
         //   endOfGame = true;
      }
      //closing scene
      kanin.beg();
      slange.eat();
      System.out.println("Took " + iterations + " moves before the snake ate the rabbit");
   }
}
