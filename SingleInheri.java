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

class SingleInheri
{
  public static void main(String args[])
  {
    Dog d = new Dog();
    d.eat();
     d.bark();
  }
}