package OBJECT_ORIENTED_PROGRAMMING_CHAMPLAIN.CH_6;

/**
 * This class uses an inner class.
 */

public class RetailItem
{
   private String description;  // Item description
   private int itemNumber;      // Item number
   private String shippingData = "10/20/2021";
   private CostData cost;       // Cost data

   /**
    * RetailItem class constructor
    */

   public RetailItem(String desc, int itemNum, 
                     double wholesale, double retail)
   {
      description = desc;
      itemNumber = itemNum;
      // be created by our inner class =>
      cost = new CostData(wholesale, retail);
   }

   /**
    * RetailItem class toString method 
    */

   public String toString()
   {
      String str;  // To hold a descriptive string.
      
      // Create a formatted string describing the item.
      str = String.format("Description: %s\n" +
                          "Item Number: %d\n" +
                          "Wholesale Cost: $%,.2f\n" +
                          "Retail Price: $%,.2f\n" +
                      "Shipping Data: %s\n",
                          description, itemNumber,
                          cost.wholesale, cost.retail, cost.getData());
      
      // Return the string.
      return str;
   }

   /**
    * CostData Inner Class
    */

   private class CostData
   {
      public double wholesale,  // Wholesale cost
                    retail;     // Retail price

      /**
       * CostData class constructor 
       */

      public CostData(double w, double r)
      {
         wholesale = w;
         retail = r;
      }
      public String getData(){
         return shippingData;
      }
   }
}