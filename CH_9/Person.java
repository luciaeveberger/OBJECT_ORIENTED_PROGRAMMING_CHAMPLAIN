package OBJECT_ORIENTED_PROGRAMMING_CHAMPLAIN.CH_9;

public class Person
{
   // general data points that represent our person
   private String name;
   private String address;
   
   // Constructor
   public Person(String n, String a)
   {

      name = n;
      address = a;
   }

   public String getAddress() {
      return address;
   }

   public String getName() {
      return name;
   }

   // display method
      public void display()
      {
         System.out.println("My name is " + name);
      }
}