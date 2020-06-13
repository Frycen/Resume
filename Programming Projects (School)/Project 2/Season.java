//Ivan Matias
//CS 1400, Section 3
//Project 2 - determining the seasons
//Feb 07, 2020

import java.util.Scanner;

public class Season
{
   public static void main (String[] args)
   {
      Scanner kb = new Scanner(System.in);
      int days = 1;
      String daysPhrase = "";

      System.out.print("Enter month (1-12): ");
      int month = kb.nextInt();
      kb.nextLine();

      if(month >= 1 && month <= 12)
      {
         switch (month)
         {
	    case 1:
	    case 3:
	    case 5:
	    case 7:
	    case 8:
	    case 10:
	    case 12:
	    {
	       daysPhrase = "Enter day (1-31): ";
	    }
	    break;

	    case 4:
	    case 6:
	    case 9:
	    case 11:
	    {
	       daysPhrase = "Enter day (1-30): ";
	    }
	    break;


	    case 2:
	    {
	       daysPhrase = "Enter day (1-29): ";
	    }
         }
      }

      else
      {
         System.out.print("Invalid Month!\n");
	 return;
      }

      System.out.print(daysPhrase);
      days = kb.nextInt();

      if(days <= 0)
      {
         System.out.print("This date isn't real!\n");
	 return;
      }
      else if(month >= 1 && month <= 3)
      {
         if ((month == 1 && days >31) || (month == 2 && days >28) || (month == 3 && days>31))
         {
            System.out.print("This date does not exist!\n");
            return;
         }
         else if(month == 3 && days > 20)
	    System.out.print(month + "/" + days + " is in the Spring season.\n");
	 else
	    System.out.print(month + "/" + days + " is in the Winter season.\n");
      }
      else if(month >= 4 && month <= 6)
      {
         if ((month == 4 && days >30) || (month == 5 && days >31) || (month == 6 && days>30))
         {
         System.out.print("This date does not exist!\n");
         return;
         }
         else if (month == 6 && days > 20)
	    System.out.print(month + "/" + days + " is in the Summer season.\n");
         else
	    System.out.print(month + "/" + days + " is in the Spring season.\n");
      }
      else if (month >= 7 && month <= 9)
      {
         if ((month == 7 && days >31) || (month == 8 && days >31) || (month == 9 && days>30))
         {
            System.out.print("This date does not exist!\n");
            return;
         }
         else if ( month == 9 && days > 20)
	    System.out.print(month + "/" + days + " is in the Fall season.\n");
	 else
	    System.out.print(month + "/" + days + " is in the Summer season.\n");
      }
      else if(month >= 10 && month <=12)
      {
         if ((month == 10 && days >31) || (month == 11 && days >30) || (month == 12 && days>31))
         {
            System.out.print("This date does not exist!\n");
            return;
         }

         else if (month == 12 && days > 20)
            System.out.print(month + "/" + days + " is in the Winter season.\n");
         else
	    System.out.print(month + "/" + days + " is in the Fall season.\n");
      }
      else
      {
         System.out.print("This date isn't real!\n");
	 return;
      }
   }
}
