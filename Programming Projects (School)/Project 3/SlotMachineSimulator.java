//Ivan matias
//CS1400, Section 03
//Project 3 - Slot Machine Simulation
//Feburary 19, 2020

import java.util.Scanner;
import java.util.Random;

public class SlotMachineSimulator
{
   public static void main(String[] args)
   {
      double totalInput = 0;
      double totalEarned = 0;
      String repeatEnd;
      Scanner keyboard = new Scanner(System.in);
      Random random = new Random();
      
      System.out.println("Welcome to the Slot Machine Simulator!");
      System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");

      do
      {
         int cherryCounter = 0;
         int orangeCounter = 0;
         int plumCounter = 0;
         int bellCounter = 0;
         int melonCounter = 0;
         int barCounter = 0;
         double moneyWon = 0;

         System.out.print("Enter the amount you would like to bet: $");
         double userInput = keyboard.nextDouble();
	 keyboard.nextLine();

         totalInput += userInput;
         
         for(int i = 0; i <= 2; ++i)
         {
            int randomNumber = random.nextInt(5);

            switch(randomNumber)
            {
               case 0:
               {
                  System.out.print("-- Cherry ");
                  ++cherryCounter; 
               }
               break;

               case 1:
               {
                  System.out.print("-- Orange ");
                  ++orangeCounter;
               }
               break;

               case 2:
               {
                  System.out.print("-- Plum ");
                  ++plumCounter;
               }
               break;

               case 3:
               {
                  System.out.print("-- Bell ");
                  ++bellCounter;
               }
               break;

               case 4:
               {
                  System.out.print("-- Melon ");
                  ++melonCounter;
               }
               break;

               case 5:
               {
                  System.out.print("-- Bar ");
                  ++barCounter;
               }
               break;
            }
         }
         
         System.out.print(" --\n");

         if((cherryCounter == 2) || (orangeCounter == 2) || (plumCounter == 2)
            || (bellCounter == 2) || (melonCounter == 2) || (barCounter == 2))
         {
            totalEarned += (userInput * 2);
            moneyWon = (userInput * 2);
            System.out.printf("Great! Two matches. \nThat doubles your bet!\n");
            System.out.printf("You win $%,.2f\n", (moneyWon));
         }
         
         else if ((cherryCounter == 3) || (orangeCounter == 3) || (plumCounter == 3)
            || (bellCounter == 3) || (melonCounter == 3) || (barCounter == 3))
         {
            totalEarned += (userInput * 3);
            moneyWon = (userInput * 3);
            System.out.printf("Wow! All three match!\nThat triples your bet!\n");
            System.out.printf("You win $%,.2f\n", (moneyWon));
         }

         else
            System.out.println("Sorry, none match . . .\nYou win $0.00");

         System.out.println("Would you like to play again?");
         System.out.print("Enter Y for yes or N for no: ");

         repeatEnd = keyboard.nextLine();

         while(!(repeatEnd.equalsIgnoreCase("Y")) && !(repeatEnd.equalsIgnoreCase("N")))
         {
            System.out.print("Invalid value, input again: ");
            repeatEnd = keyboard.nextLine();
         }
         
      }
      while(repeatEnd.equalsIgnoreCase("Y"));


      System.out.printf("You bet a total of $%,.2f\n", totalInput);
      System.out.printf("You won a total of $%,.2f\n", totalEarned);
   }
}
