//Ivan Matias
//CS1400, section 3
//Project 6 - Parking Ticket Simulator
//3-17-2020

public class ParkingTicketTest
{
   public static void main(String[] args)
   {
      System.out.println("\n. . . set minutes purchased to 60, and");
      System.out.println("parked for 125 minutes. . .");

      ParkedCar car = new ParkedCar("Volkswagen", "2002", "Red", "3RHZ147", 125);

      ParkingMeter meter = new ParkingMeter(60);

      PoliceOfficer officer = new PoliceOfficer("Joe Friday", "4788");

      ParkingTicket ticket = officer.patrol(car, meter);

      if(ticket != null)
         System.out.println(ticket);
      else
         System.out.println("No crimes committed!");
      
      System.out.println("\n. . . change minutes parked to 60");
      car.setMinutes(60);

      ticket = officer.patrol(car, meter);

      if(ticket != null)
         System.out.println(ticket);
      else
         System.out.println("No crimes committed!");
      
      System.out.println("\n. . . change minutes parked to 61");
      car.setMinutes(61);

      ticket = officer.patrol(car, meter);

      if(ticket != null)
         System.out.println(ticket);
      else
         System.out.println("No crimes committed!");

      
      System.out.println("\n. . . change car model to 2010. . .");
      car.setModel("2010");

      ticket = officer.patrol(car, meter);

      if(ticket != null)
         System.out.println(ticket);
      else
         System.out.println("No crimes committed!");

      System.out.print("\n. . . change minutes purchased to 70. . .");
      meter.setMinutesPurchased(70);

      ticket = officer.patrol(car, meter);

      if(ticket != null)
         System.out.println(ticket);
      else
         System.out.println("\nNo crimes committed!");
   }
}
