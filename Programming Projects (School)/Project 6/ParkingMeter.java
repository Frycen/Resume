//Ivan Matias
//CS1400, section 03
//Project 6 - Parking Ticket Simulator
//3-17-2020

public class ParkingMeter
{
   private int parkingMinutes;

   public ParkingMeter(int minutes)
   {
      parkingMinutes = minutes;
   }

   public int getMinutesPurchased()
   {
      return parkingMinutes;
   }

   public void setMinutesPurchased(int minutes)
   {
      parkingMinutes = minutes;
   }

   public String toString()
   {
      return "Minutes Parked: " + parkingMinutes;
   }
}
