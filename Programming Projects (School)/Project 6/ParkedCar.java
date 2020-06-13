//Ivan Matias
//CS1400, section 03
//Project 6 - Parking Ticket Simulator
//3-17-2020

public class ParkedCar
{
   private String make;
   private String model;
   private String color;
   private String licenseNumber;
   private int minutesParked;
   
   public ParkedCar(String mk, String mod, String col, String lic, int min)
   {
      make = mk;
      model = mod;
      color = col;
      licenseNumber = lic;
      minutesParked = min;
   }

   public ParkedCar(ParkedCar obj2)
   {
      make = obj2.make;
      model = obj2.model;
      color = obj2.color;
      licenseNumber = obj2.licenseNumber;
      minutesParked = obj2.minutesParked;
   }

   public void setMake(String mk)
   {
      make = mk;
   }

   public void setModel(String mod)
   {
      model = mod;
   }

   public void setColor(String col)
   {
      color = col;
   }

   public void setLicense(String lic)
   {
      licenseNumber = lic;
   }

   public void setMinutes(int min)
   {
      minutesParked = min;
   }

   public String getMake()
   {
      return make;
   }

   public String getModel()
   {
      return model;
   }

   public String getColor()
   {
      return color;
   }

   public String getLicNum()
   {
      return licenseNumber;
   }

   public int getMinutes()
   {
      return minutesParked;
   }

   public String toString()
   {
      String result = "";
      
      result +="Car Data --" + "\n";
      result +="Make: " + make + "\n";
      result += "Model: " + model + "\n";
      result += "Color: " + color + "\n";
      result += "License Number: " + licenseNumber + "\n";
      result += "Minutes Parked: " + minutesParked;

      return(result);
   }
}
