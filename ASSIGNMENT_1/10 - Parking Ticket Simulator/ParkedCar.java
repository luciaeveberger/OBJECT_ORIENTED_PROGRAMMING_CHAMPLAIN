/**                       
 * Chapter 6      
 * Programming Challenge 10: Parking Ticket Simulator
 * The ParkedCar class stores information about a parked car.                 
 */

public class ParkedCar
{
   private String make;          // The car's make
   private String model;         // The car's model
   private String color;         // The car's color
   private String licenseNumber; // The car's licnese number
   private int minutesParked;    // Minutes parked
   
   /**
    * Constructor                                  
    */

   public ParkedCar(String mk, String mod, String col,
                    String lic, int min)
   {
      make = mk;
      model = mod;
      color = col;
      licenseNumber = lic;
      minutesParked = min;
   }

   /**
    * Copy constructor                             
    */

   public ParkedCar(ParkedCar car2)
   {
      make = car2.make;
      model = car2.model;
      color = car2.color;
      licenseNumber = car2.licenseNumber;
      minutesParked = car2.minutesParked;
   }
   /**
    * setMake method                               
    */

   public void setMake(String m)
   {
      make = m;
   }

   /**
    * setModel method                              
    */

   public void setModel(String m)
   {
      model = m;
   }

   /**
    * setColor method                              
    */

   public void setColor(String c)
   {
      color = c;
   }

   /**
    * setLicenseNumber method                      
    */

   public void setLicenseNumber(String l)
   {
      licenseNumber = l;
   }

   /**
    * setMinutesParked method                      
    */

   public void setMinutesParked(int m)
   {
      minutesParked = m;
   }

   /**
    * getMake method                               
    */

   public String getMake()
   {
      return make;
   }

   /**
    * getModel method                              
    */

   public String getModel()
   {
      return model;
   }

   /**
    * getColor method                              
    */

   public String getColor()
   {
      return color;
   }

   /**
    * getLicenseNumber method                      
    */

   public String getLicenseNumber()
   {
      return licenseNumber;
   }

   /**
    * getMinutesParked method                      
    */

   public int getMinutesParked()
   {
      return minutesParked;
   }

   /**
    * toString method                              
    */

   public String toString()
   {
      // Build a state string.
      String str = "Make: " + make +
                   "\nModel: " + model +
                   "\nColor: " + color +
                   "\nLicense Number: " + 
                   licenseNumber +
                   "\nMinutes Parked: " +
                   minutesParked;
      
      // Return the string.
      return str;
   }
}
