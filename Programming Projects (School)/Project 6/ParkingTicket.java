//Ivan Matias
//CS1400, section 03
//Project 06 - Parking Ticket Simulator
//3-17-20

public class ParkingTicket
{
   private ParkedCar parkedCar;
   private PoliceOfficer policeOfficer;
   private double fineAmount;
   private int minutes;

   public final double FIRST_HOUR_FINE = 25.0;
   public final double ADDITIONAL_HOUR_FINE = 10.0;

   public ParkingTicket (ParkedCar car, PoliceOfficer officer, int min)
   {
      parkedCar = car;
      policeOfficer = officer;
      minutes = min;
      computeFine();
   }

   private void computeFine()
   {
      double timeInHours = minutes / 60.0;
      int intHours = (int) timeInHours;

      fineAmount = FIRST_HOUR_FINE;
      fineAmount += (intHours * ADDITIONAL_HOUR_FINE);
   }

   public ParkedCar getCar()
   {
      return parkedCar;
   }

   public void setCar(ParkedCar car)
   {
      parkedCar = car;
   }

   public PoliceOfficer getOfficer()
   {
      return policeOfficer;
   }

   public void setOfficer(PoliceOfficer officer)
   {
      policeOfficer = officer;
   }

   public double getFine()
   {
      return fineAmount;
   }

   public void setFine(double fine)
   {
      fineAmount = fine;
   }

   public int getMinutes()
   {
      return minutes;
   }

   public void setMinutes(int min)
   {
      minutes = min;
   }

   public String toString()
   {
      String result = "";

      result += parkedCar + "\n";
      result += policeOfficer + "\n";
      result += "Minutes Illegally Parked-- " + minutes + "\n";
      result += "Fine-- $" + String.format("%.2f", fineAmount);

      return result;
   }
}
