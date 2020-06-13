//Ivan Matias
//CS1400, section 03
//Project 8 - Text Editor
//4/22/2020

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

class TextEditor
{
   public static int MAX=200;
   private String lines[];
   private int size;

   public TextEditor(File myFile) throws FileNotFoundException
   {
      lines = new String[MAX];
      size = 0;
      Scanner sc = new Scanner(myFile);
      while(sc.hasNext())
      {
         lines[size++] = sc.nextLine();
      }
      sc.close();
   }
   public void print()
   {
      if(size == 0)
      {
         System.out.println("empty file");
      }
      else
      {
      for(int i = 0; i < size; i++)
         System.out.println(i + " : " + lines[i]);
      }
   }

   public void find()
   {
      Scanner sc = new Scanner(System.in);
      String pattern;
      System.out.print("enter pattern: ");
      pattern = sc.nextLine();
      for(int i = 0; i < size; i++)
      {
         if(lines[i].contains(pattern))
	 {
	    System.out.println(i + " : " + lines[i]);
	    int pos = lines[i].indexOf(pattern);
	    System.out.println("position = " + pos);
	 }
      }
   }

   public void replace()
   {
      Scanner sc = new Scanner(System.in);
      String oldPattern,newPattern;
      System.out.print("enter old pattern to replace: ");
      oldPattern = sc.nextLine();
      System.out.print("enter old pattern to replace with: ");
      newPattern = sc.nextLine();
      for(int i = 0; i < size; i++)
      {
         if(lines[i].contains(oldPattern))
	 {
	    System.out.println(i + " : " + lines[i]);
	    lines[i]=lines[i].replaceFirst(oldPattern, newPattern);
	 }
      }
   }

   public void sort()
   {
      String temp;
      for(int i = 0; i < size; i++)
      {
         for(int j = 0; j<size; j++)
	 {
	    if(lines[i].compareTo(lines[j]) < 1)
	    {
	       temp = lines[i];
	       lines[i] = lines[j];
	       lines[j] = temp;
	    }
	 }
      }
      System.out.println("Array has been sorted.");
   }
}
