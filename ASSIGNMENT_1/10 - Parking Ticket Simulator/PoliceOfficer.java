/**                       
 * Chapter 6      
 * Programming Challenge 10: Parking Ticket Simulator
 * The PoliceOfficer class stores information about a police officer.                 
 */

public class PoliceOfficer
{
   private String name;          // Officer's name
   private String badgeNumber;   // Badge number

   /**
    * Constructor
    */

   public PoliceOfficer(String n, String bn)
   {
      name = n;
      badgeNumber = bn;
   }
   
   /**
    * Copy constructor
    */

   public PoliceOfficer(PoliceOfficer officer2)
   {
      name = officer2.name;
      badgeNumber = officer2.badgeNumber;
   }

   /**
    * setName method
    */

   public void setName(String n)
   {
      name = n;
   }

   /**
    * setBadgeNumber method
    */

   public void setBadgeNumber(String b)
   {
      badgeNumber = b;
   }

   /**
    * getName method
    */

   public String getName()
   {
      return name;
   }

   /**
    * getBadgeNumber method
    */

   public String getBadgeNumber()
   {
      return badgeNumber;
   }
   
   /**
    * patrol method
    * This method looks at the number of minutes a
    * car has been parked and the number of
    * minutes purchased. If the minutes parked is
    * greater than the minutes purchased, a
    * ParkingTicket object is returned. Otherwise
    * the method returns null.
    */
   
   public ParkingTicket patrol(ParkedCar car, 
                               ParkingMeter meter)
   {
      ParkingTicket ticket = null; // To reference the ticket

      // Get the minutes parked over the amount purchased.
      int illegalMinutes = car.getMinutesParked() - 
                           meter.getMinutesPurchased();
      
      // Determine whether the car is illegally parked.     
      if (illegalMinutes > 0)
      {
         // Yes, it is illegally parked.
         ticket = new ParkingTicket(car, this, illegalMinutes);
      }
      
      // Return the ticket, if any.
      return ticket;
   }
   
   /**
    * toString method
    */

   public String toString()
   {
      // Build a state string.
      String str = "Name: " + name +
                   "\nBadgeNumber: " + badgeNumber;
      
      // Return the String.
      return str;
   }
}
