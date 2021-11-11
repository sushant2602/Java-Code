class Cal2
{
   void add(int a, int b)
   {
      int result = a + b;
      System.out.println("Addition of two number is\t"+result);
   }
}
 
}
class Cal3 extends Calculation
{
  void add(int a, int b, int c)
   {
      int result = a + b + c;
      System.out.println("Addition of three number is\t"+result);
   }


class OverloadExamp
{
   public static void main(String args[])
   {
      Cal3 cl = new Cal3();
       cl.add(5,8);
       cl.add(6,2,9);
   }
}