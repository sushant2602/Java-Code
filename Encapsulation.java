class Employee
 {
    private int empid;
    private String empname;
    private String empaddress;
   
    public void setEmpId(int eid)
    {
       empid=eid; 
    }
    public int getEmpId()
    {
       return  empid;
    }

    public void setEmpName(String ename)
    {
       empname=ename; 
    }
    public String getEmpName()
    {
       return  empname;
    }

    public void setEmpAddress(String eaddress)
    {
       empaddress=eaddress; 
    }
    public String getEmpAddress()
    {
       return  empaddress;
    }
 }

class Encapsulation
{
  public static void main(String args[])
  {
    Employee e = new Employee();
    e.setEmpId(1);
    e.setEmpName("Sushant");
    e.setEmpAddress("Ahmednagar");

    System.out.println("Emp Id is:\t"+e.getEmpId()+"\nEmp Name is:\t"+e.getEmpName()+"\nEmp Address is:\t"+e.getEmpAddress());


  }
}