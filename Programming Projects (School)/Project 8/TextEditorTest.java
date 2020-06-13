//Ivan Matias
//CS1400, section 03
//Project 8 - Text Editor
//4/23/2020

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TextEditorTest
{
   public static void main(String[] args) throws FileNotFoundException
   {
      File newFile = new File("inFile.txt");
      TextEditor te = new TextEditor(newFile);
      Scanner sc = new Scanner(System.in);
      char userChoice;
      do
      {
         menu();
	 System.out.print("Your choice: ");
	 userChoice = sc.next().charAt(0);
	 switch(userChoice)
	 {
	    case 'p':
	    case 'P':
	    {
	       System.out.println("");
	       te.print();
	       System.out.println("");
	       break;
	    }
	    case 'f':
	    case 'F':
	    {
	       System.out.println("");
	       te.find();
	       System.out.println("");
	       break;
	    }
	    case 'r':
	    case 'R':
	    {
	       System.out.println("");
	       te.replace();
	       System.out.println("");
	       break;
	    }
	    case 's':
	    case 'S':
	    {
	       System.out.println("");
	       te.sort();
	       System.out.println("");
	       break;
	    }
	    case 'q':
	    case 'Q':
	    {
	       break;
	    }
	    default:
	       System.out.println("Invalid choice!!");
	 }
      }  while(userChoice!='q');
      System.out.println("bye");
   }

   private static void menu()
   {
      System.out.println("[p]rint input file with line numbers");
      System.out.println("[f]ind the leftmost occurrencese of pattern for all lines");
      System.out.println("[r]eplace all occurrences of old by new");
      System.out.println("[s]ort the input file");
      System.out.println("[q]uit the editor");
   }
}
