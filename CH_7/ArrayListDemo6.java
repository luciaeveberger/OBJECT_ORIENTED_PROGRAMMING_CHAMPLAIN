package OBJECT_ORIENTED_PROGRAMMING_CHAMPLAIN.CH_7;

// importing our arraylist -> we need this class!!
import java.util.ArrayList;   // Needed for the ArrayList class

/**
 * This program demonstrates how to use a cast operator
 * with the ArrayList class's get method.
 */

public class ArrayListDemo6
{
   public static void main(String[] args)
   {
      // Create an ArrayList to hold InventoryItem objects. => an object type arraylist
      ArrayList<InventoryItem> list = new ArrayList<InventoryItem>();
      
      // Add three InventoryItem objects to the ArrayList.
      list.add(new InventoryItem("Nuts", 100));
      list.add(new InventoryItem("Bolts", 150));
      list.add(new InventoryItem("Washers", 75));
      // add the default inventory item
      list.add(new InventoryItem());
      // if we want only the description specfied
      list.add(new InventoryItem("TShirt"));
      // if we both the description and the units specified
      list.add(new InventoryItem("PS4", 2000));

      // we are going to run into some issues!!
//      list.add("This string!!!");

      // how to add a new element here!
      
      // Display each item.
      for (int index = 0; index < list.size(); index++)
      {
         InventoryItem item = (InventoryItem)list.get(index);
         System.out.println("Item at index " + index +
                            "\nDescription: " + item.getDescription() +
                            "\nUnits: " + item.getUnits());
      }      
   }
}