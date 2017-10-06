//Matthew Hoesch
//Create a program that will make the user guess for the number, either higher or lower
import java.util.Scanner;
  public class Game
{
  public static void main(String[] args)
  {
    int randnum, Guess, count=1;
    
    randnum = 1+(int)(Math.random()*50);
    Scanner kb = new Scanner (System.in);
    
   System.out.println("Enter in your guess number between 1 and 50");
   
   while (count <=5)
   {
     Guess=kb.nextInt();
     
     if (Guess<randnum)
       System.out.println("Higher");
     
     else if (Guess > randnum)
       System.out.println("Lower");
     
   
     else if (Guess == randnum)
     {
       System.out.println("You won with  " + count + "tries");
       System.out.println("The random number was" + randnum);
     
     break;
   }
   count++;
  }
    if (count > 5)
    System.out.println("Sorry you lost the game,"+ "the random number was " + randnum);
  }
  }
  
  
  
  
  
  
  
