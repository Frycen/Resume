import java.util.Scanner;
public class Story
{
	public static void main(String[] args)
	{
		//Ivan Matias
		//CS 1400, section 3
		//Project 1 - Word Game
		//January 31, 2020

		Scanner kb = new Scanner(System.in);
		
		System.out.print("Enter a name: ");
		String name = kb.nextLine();

		System.out.print("Enter an age number: ");
		int age = kb.nextInt();
		kb.nextLine();

		System.out.print("Enter the name of a city: ");
		String nameCity = kb.nextLine();

		System.out.print("Enter the name of a college: ");
		String nameCollege = kb.nextLine();

		System.out.print("Enter a profession: ");
		String profession = kb.nextLine();

		System.out.print("Enter a type of animal: ");
		String animalType = kb.nextLine();

		System.out.print("Enter a pet name: ");
		String animalName = kb.nextLine();
		
		System.out.print("There once was a person named " + name 
				+ " who lived in " + nameCity + ". At the age of "
				+ age + ", " + name + " went to college at "
				+ nameCollege + ". " + name
 				+ " graduated and went to work as a " + profession 
				+ ". Then, " + name + " adopted a(n) " + animalType
				+ " named " + animalName 
				+ ". They both lived happily ever after!\n");
	}
}
