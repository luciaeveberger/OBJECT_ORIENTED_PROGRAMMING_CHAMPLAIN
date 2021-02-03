package OBJECT_ORIENTED_PROGRAMMING_CHAMPLAIN.CH_9;
public class SubClass2 extends SuperClass2
{
   // Constructor   
   public SubClass2()
   {
      // Call the superclass constructor.
      super(10);
      
      // Display a message.
      System.out.println("This is the subclass " +
                         "constructor.");
   }
}