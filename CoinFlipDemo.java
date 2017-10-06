import java.util.Random;
public class CoinFlipDemo
{
  public static void main (String[] args)
  {
    Random randomGenerator = new Random();
    int counter=1;
    
    while (counter <= 60)
    {
      System.out.println("Flip  Number " + counter + ":");
      int coinflip = randomGenerator.nextInt(2);
      if (coinflip == 1)
        System.out.println("Heads");
        else
        System.out.println("Tails");
        counter++;
    }
  }
}