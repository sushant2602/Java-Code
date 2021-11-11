interface Animal
{
   void animalSound();
   void sleep();
}

class Pig implements Animal
{
   public void animalSound()
  {
    System.out.println("wewe...");
  }
   public void sleep()
   {
      System.out.println("zzzz...");
   }
} 

class Goat implements Animal
{
   public void animalSound()
  {
    System.out.println("mehmeh..");
  }
   public void sleep()
   {
      System.out.println("zzzz...");
   }
} 

class Interface
{
  public static void main(String args[])
  {
    Pig p =new Pig();
    p.animalSound();
    p.sleep();
    
    Goat g = new Goat();
     g.animalSound();
     g.sleep();
  }
}