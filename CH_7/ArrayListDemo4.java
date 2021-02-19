package OBJECT_ORIENTED_PROGRAMMING_CHAMPLAIN.CH_7;

import java.util.ArrayList; // Needed for ArrayList class

/**
 *  This program demonstrates inserting an item.
 */

public class ArrayListDemo4
{
   public static void main(String[] args)
   {

      ArrayList<String> nameList = new ArrayList<String>();
      nameList.add("James");
      nameList.add("Catherine");
      nameList.add("Bill");
      nameList.add(1, "Mary");
      
      // Display the items in nameList and their indices.
      for (int index = 0; index < nameList.size(); index++)
      {
         System.out.println("Index: " + index + " Name: " +
                            nameList.get(index));
      }
      
      // Now insert an  item at index 1.
      nameList.add(1, "Mary");

      nameList.remove(1);
      
      System.out.println("Mary was added at index 1. " +
                         "Here are the items now.");
                         
      // Display the items in nameList and their indices.
      for (int index = 0; index < nameList.size(); index++)
      {
         System.out.println("Index: " + index + " Name: " +
                            nameList.get(index));
      }
      // this data types => AN OBJECT => Double
      ArrayList<Integer> arrayListIntegers = new ArrayList<Integer>();

   }
}