//Ivan Matias
//CS1400, section 03
//Project 6 - Parking Ticket Simulator
//3-17-2020

public class PoliceOfficer
{
   private String name;
   private String badgeNumber;

   public PoliceOfficer(String n, String bn)
   {
      name = n;
      badgeNumber = bn;
   }

   public PoliceOfficer(PoliceOfficer officer2)
   {
      name = officer2.name;
      badgeNumber = officer2.badgeNumber;
   }

   public void setName(String n)
   {
      name = n;
   }

   public void setBadge(String bn)
   {
      badgeNumber = bn;
   }

   public String getName()
   {
      return name;
   }

   public String getBadge()
   {
      return badgeNumber;
   }

   public ParkingTicket patrol(ParkedCar parkedCar, ParkingMeter parkingMeter)
   {
      ParkingTicket parkingTicket = null;

      int numberOfIllegalMinutes = parkedCar.getMinutes() - parkingMeter.getMinutesPurchased();

      if(numberOfIllegalMinutes > 0)
      {
         parkingTicket = new ParkingTicket(parkedCar, this, numberOfIllegalMinutes);
      }

      return parkingTicket;
   }

   public String toString()
   {
      String result = "";

      result += "Officer Data--" + "\n";
      result += "Name: " + name + "\n";
      result += "BadgeNumber: " + badgeNumber;

      return result;
   }
}
