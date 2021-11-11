class Animal
{
  void eat()
  {
    System.out.println("Animal is Eating...");
  }
}

class Dog extends Animal
{
  void bark()
  {
   System.out.println("Dog is Barking...");
  }
}

class BabyDog extends Dog
{
  void play()
  {
    System.out.println("Baby Dog is Playing...");
  }
}
class MultilevelInheri
{
  public static void main(String args[])
  {
    BabyDog d = new BabyDog();
    d.eat();
    d.bark();
    d.play();
  }
}