abstract class Vehicle
{
  abstract void start();
}

class Car extends Vehicle
{
 void start()
   {
      System.out.println("Car start by key");
   }
   void stop()
   {
     System.out.println("Car Stop");
   }
}

class Bike extends Vehicle
{
  void start()
   {
      System.out.println("Bike start by Kick");
   }
}

class Abstract 
{
  public static void main(String args[])
  {
     Car c = new Car();
      c.start();
      c.stop();
     
      Bike b = new Bike();
      b.start();
  }
}