public class Temperature
{
   private double degrees;
   private char scale;

   public Temperature()
   {
      degrees = 0;
      scale = 'C';
   }

   public Temperature(double deg)
   {
      degrees = deg;
      scale = 'C';
   }

   public Temperature (char ch)
   {
      degrees = 0.0;
      scale = ch;
   }

   public Temperature (double deg, char ch)
   {
      degrees = deg;
      scale = ch;
   }

   //Getters
   public double getDegreesC()
   {
      if(scale == 'C' || scale == 'c')
      {
         return degrees;
      }
      else
      {
         double degreesC = (degrees - 32)*5/9;
         return degreesC;
      }
   }

   public double getDegreesF()
   {
      if(scale == 'F' || scale == 'f')
      {
         return degrees;
      }
      else
      {
         double degreesF = (degrees * 9/5) + 32;
         return degreesF;
      }
   }

   //Setters
   public void setDegrees(double deg)
   {
      degrees = deg;
   }

   public void setScale(char ch)
   {
      if(ch == 'F' || ch == 'f' || ch == 'C' || ch == 'c')
         scale = ch;
      else
      {
         System.out.println("Invalid scale");
         System.exit(0);
      }
   }

   public void setBoth(double deg, char ch)
   {
      degrees = deg;
      scale = ch;
   }

   //Comparisons
   public boolean equals(Temperature t)
   {
      double temp;
      if(this.degrees == t.degrees)
         return true;
      
      else if(this.scale == 'c' || this.scale == 'C' && t.scale == 'F' || t.scale == 'f')
      {
         temp = t.getDegreesC();
         if(this.degrees == temp)
            return true;
         else
            return false;
      }

      else if(this.scale == 'F' || this.scale == 'f' && t.scale == 'c' || t.scale == 'C')
      {
         temp = t.getDegreesF();
         if(this.degrees == temp)
            return true;
         else
            return false;
      }

      else
         return false;
   }

   public boolean lessThan(Temperature t)
   {
      double temp;
      if(this.scale == 'c' || this.scale == 'C' && t.scale == 'F' || t.scale == 'f')
      {
         temp = t.getDegreesC();
         if(this.degrees < temp)
            return true;
         else
            return false;
      }

      else if(this.scale == 'F' || this.scale == 'f' && t.scale == 'c' || t.scale == 'C')
      {
         temp = t.getDegreesF();
         if(this.degrees < temp)
            return true;
         else
            return false;
      }

      else
      {
         if(this.degrees < t.degrees)
            return true;
         else
            return false;
      }
   }

   public boolean greaterThan(Temperature t)
   {
      double temp;
      if(this.scale == 'c' || this.scale == 'C' && t.scale == 'F' || t.scale == 'f')
      {
         temp = t.getDegreesC();
         if(this.degrees > temp)
            return true;
         else
            return false;
      }

      else if(this.scale == 'F' || this.scale == 'f' && t.scale == 'c' || t.scale == 'C')
      {
         temp = t.getDegreesF();
         if(this.degrees > temp)
            return true;
         else
            return false;
      }

      else
      {
         if(this.degrees > t.degrees)
            return true;
         else
            return false;
      }
   }
