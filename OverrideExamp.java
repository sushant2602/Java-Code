class LivingThings
{
   public void eat()
   {
      System.out.println("Living Things are Eating..");
   }
}

class Birds extends LivingThings
{
   public void eat()
   {
   System.out.println("Birds are Eating..");
    }
}

class Animals extends LivingThings
{
   public void eat()
   {
   System.out.println("Animals are Eating..");
    }
}

class OverrideExamp
{
   public static void main(String args[])
   {
   Birds bd = new Birds();
   bd.eat();

   Animals an = new Animals();
   an.eat();
   }
}