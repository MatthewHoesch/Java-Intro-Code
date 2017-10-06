//Name: Matthew Hoesch
/* In the game of craps, a bet procedes as follows: Two six sided dice are rolled; the first roll of the dice in craps is the come out roll. A come out roll of 7 or 11 wins, and a come out of 2,3 or 12 
 * loses. If 4,5,6,8,9,or 10 are rolled on the come out roll, that number becomes "the point." The player keeps rolling the dice until either 7 or the point is rolled. If the point is rolled first, then
 * the player wins the bet. If a 7 is rolled first, then the player loses. Write a program that simulates a craps using these rules without human input.

Variable Dictionary:
dice1= The first dice.
dice2= The second dice.
i= 
roll= THe roll of the two dice.
wincount= The amount of wins.
losecount= The amount of loses.
probability= The frequency of wins 

Input:
------
Output:
Total amout of wins, Total amount of losses, Probability of winning.
*/
public class prog5
{
 public static void main(String[] args) 
 {
 int dice1= 0; 
 int dice2= 0;
 int i=0; 
 int roll= 0;
 double wincount=0;
 double losecount=0; 
 double probability=0;
 
 for(i=0; i<10; i++) //The dice will be rolled 10 times.
 {
  dice1= 1+(int)(Math.random() * 6);
  dice2= 1+(int)(Math.random() * 6);
  roll = dice1 + dice2;
  System.out.println("You have rolled a " + roll);
 
 if (roll==7 || roll== 11) //If you roll a 7 or 11 on the first roll you win.
 {
  System.out.println("You rolled a " + roll + " You win!");
  wincount++;
 }
 else if (roll==2 || roll== 3 || roll== 12) //If you roll a 2,3, or 12 on the first roll, you lose.
 {
  System.out.println("You rolled a " + roll + " You lose!");
  losecount++;
 }
 else //The second number rolled is the point
  {
  System.out.println("The point is " + roll);
  dice1 = 1 + (int)(Math.random() * 6);
  dice2 = 1 + (int)(Math.random() * 6);
  int roll2= dice1 + dice2; //The second roll 
  System.out.println("You rolled a " + roll2);
  
  while (roll2 !=7) //Lose if the point roll is a 7
  {
   if (roll == roll2) //If the first roll equals the second roll you win
   {
    System.out.println("You win");
    wincount++;
    break;
   }
   else 
   {
    System.out.println("The point is " + roll);
   }
   
    dice1= 1+ (int)(Math.random() * 6);
    dice2= 1+ (int)(Math.random() * 6);
    roll2= dice1 + dice2;
    System.out.println("You rolled a " + roll2);
  }
  if(roll2 ==7) //Lose if the second roll is 7
  {
   System.out.println("You lose ");
   losecount++;
  }
  }
  probability = (wincount/(wincount + losecount)); //The win probability
  System.out.println("Your total amount of wins " +wincount);
  System.out.println("Your total amount of losses " + losecount);
  System.out.println("Probability of winning " + probability);
 }
 }
}
 
 
