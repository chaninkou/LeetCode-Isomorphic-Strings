package example26;
import java.util.Scanner;
import java.util.Random;
/*   
    Author: Chan In Kou
    Purpose: The Display will show the generation of a license plate number
*/
public class Example26
{ 
    public static void main(String[] args) 
	{
		
		//declare variable
		int licenseNumber = 1000 + (int)(Math.random() * ((9999-1000) + 1));
		Random randomLetter = new Random();
        char licenseLetter1 = (char)(randomLetter.nextInt(26) + 'A');
		char licenseLetter2 = (char)(randomLetter.nextInt(26) + 'A');
		char licenseLetter3 = (char)(randomLetter.nextInt(26) + 'A');

		//display the random license plate
		System.out.println("Your license plate number is: " + licenseLetter1 + licenseLetter2 + licenseLetter3 + licenseNumber);
	} 
}