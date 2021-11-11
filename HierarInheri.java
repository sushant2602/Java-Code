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

class Cat extends Animal
{
  void meow()
  {
    System.out.println("Cat is Meowing...");
  }
}

class HierarInheri
{
  public static void main(String args[])
  {
    Dog c = new Dog();
    c.eat();
    c.bark();
  }
}