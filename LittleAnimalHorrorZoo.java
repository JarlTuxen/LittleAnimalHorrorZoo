public class LittleAnimalHorrorZoo{
   
   public static void main(String[] args){
      boolean endOfGame = false;
      int iterations = 0;
      Snake slange = new Snake();
      Rabbit kanin = new Rabbit();
      
      while(!endOfGame){
         iterations++;
         kanin.move();
         kanin.tell();
         slange.move();
         slange.tell();
         //kanin and snake on same position?
         if (kanin.getX() == slange.getX() && kanin.getY() == slange.getY())
            endOfGame = true;
      }
      kanin.beg();
      slange.eat();
      System.out.println("Took " + iterations + " moves before the snake ate the rabbit");
   }
}
