import java.util.Scanner;
public class BankAccount
{
  public static void main(String[] args)
  {
    
    int option;
    double initbal;
    double balance;
    Scanner kb= new Scanner (System.in);
    System.out.println("Enter the intitial balance");
    initbal= kb.nextDouble();
    
    balance = initbal;
    //The object BK is created and the constructor myAccount is invoked.
    
    myAccount BK = new myAccount(initbal, balance);
    
    BK.menu();
    do
    {
      System.out.println("What is the option? ");
      option = kb.nextInt();
      
      switch (option)
      {
        case 1: BK.Deposit();
                break;
                
        case 2: BK.Print();
                break;
               
        case 3: System.out.println("Quit");
                break;
      }//Switch
    }//loop
    while (option!=3);
  }//main
}//class