import java.text.DecimalFormat;

/**                       
 * Chapter 6      
 * Programming Challenge 10: Parking Ticket Simulator
 * The ParkingTicket class stores information about a parking ticket.                 
 */

public class ParkingTicket
{
   private ParkedCar car;           // The parked car
   private PoliceOfficer officer;   // The police officer
   private double fine;             // The parking fine
   private int minutes;             // Minutes illegally parked

   // Constant for the base fine.
   public final double BASE_FINE = 25.0;
   
   // Contant for the additional hourly fine.
   public final double HOURLY_FINE = 10.0;

   /**
    * Constructor
   */
   
   public ParkingTicket(ParkedCar aCar, 
                        PoliceOfficer anOfficer,
                        int min)
   {
      // Make a copy of the object referenced by aCar.
      car = new ParkedCar(aCar);
      
      // Make a copy of the object referenced by anOfficer.
      officer = new PoliceOfficer(anOfficer);
      
      // Assign the minutes illegally parked.
      minutes = min;
      
      // Calculate the fine.
      calculateFine();
   }

   /**
    * Copy constructor
    */
   
   public ParkingTicket(ParkingTicket ticket2)
   {
      // Make a copy of the object referenced by aCar.
      car = new ParkedCar(ticket2.car);
      
      // Make a copy of the object referenced by anOfficer.
      officer = new PoliceOfficer(ticket2.officer);
      
      // Assign the fine.
      fine = ticket2.fine;
   }
   
   /**
    * calculateFine method
    */

   private void calculateFine()
   {
      // Get the time parked in hours.
      double hours = minutes / 60.0;
      
      // Get the hours as an int.
      int hoursAsInt = (int)hours;
      
      // If there was a portion of an hour, round up.
      if ((hours - hoursAsInt) > 0)
         hoursAsInt++;
      
      // Assign the base fine.
      fine = BASE_FINE;
      
      // Add the additional hourly fines.
      fine += (hoursAsInt * HOURLY_FINE);
   }
   
   /**
    * setCar method
    */

   public void setCar(ParkedCar c)
   {
      // Make a copy of the object referenced by c.
      car = new ParkedCar(c);
   }

   /**
    * setFine method
    */

   public void setFine(double f)
   {
      fine = f;
   }

   /**
    * setOfficer method
    */

   public void setOfficer(PoliceOfficer o)
   {
      // Make a copy of the object referenced by o.
      officer = new PoliceOfficer(o);
   }

   /**
    * getCar method
    */

   public ParkedCar getCar()
   {
      // Return a copy of the car object.
      return new ParkedCar(car);
   }

   /**
    * getFine method
    */

   public double getFine()
   {
      return fine;
   }

   /**
    * getOfficer method
    */

   public PoliceOfficer getOfficer()
   {
      // Return a copy of the officer object.
      return new PoliceOfficer(officer);
   }

   /**
    * toString method
    */

   public String toString()
   {
      // Create a DecimalFormat object for formatting.
      DecimalFormat dollar = new DecimalFormat("#,##0.00");
      
      // Build a state string.
      String str = "Car Data:\n" + car +
                   "\nOfficer Data:\n" + officer +
                   "\nMinutes Illegally Parked: " + minutes +
                   "\nFine: $" + dollar.format(fine);
      
      // Return the string.
      return str;
   }
}
