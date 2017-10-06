import java.util.Scanner;

public class SwitchDemo
{
  public static void main (String [] args)
  {
    Scanner kb= new Scanner (System.in);
    
    int numFlavors;
    System.out.println("Enter number of ice cream flavors:");
    numFlavors=kb.nextInt();
    
    switch (numFlavors)
    {
      case 32:
        System.out.println("Nice selection");
        break;
      case 1:
        System.out.println("I bet its vanilla");
        break;
      case 2:
        System.out.println("I hope its not chocholate");
        break;
      case 3:
        System.out.println(numFlavors + " Flavors ");
        System.out.println("is acceptable");
        break;
      default:
        System.out.println("I didnt plan for");
        System.out.println(numFlavors + " Flavors ");
        break;
    }
  }
}
    
    