/**                       
 * Chapter 6      
 * Programming Challenge 10: Parking Ticket Simulator
 * The ParkingMeter class stores information about a parking meter.                 
 */

public class ParkingMeter
{
   private int minutesPurchased; // Minutes purchased

   /**
    * Constructor
    */

   public ParkingMeter(int m)
   {
      minutesPurchased = m;
   }

   /**
    * setMinutesPurchased method
    */

   public void setMinutesPurchased(int m)
   {
      minutesPurchased = m;
   }

   /**
    * getMinutesPurchased method
    */

   public int getMinutesPurchased()
   {
      return minutesPurchased;
   }
}
