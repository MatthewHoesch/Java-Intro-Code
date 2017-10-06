import java.util.Scanner;
public class myAccount
{
  //instance variable
  double initbal, balance, dep;
  Scanner KB = new Scanner (System.in);
  
  //Constructor 
  public myAccount(double initbal, double balance)
  {
    this.initbal= initbal;
    this.balance= balance;
  }
  
  public void menu()
  {
    System.out.println("\t 1:Deposit");
    System.out.println("\t 2:Print");
    System.out.println("\t 3:Quit");
  }
  
  public void Deposit()
  {
    System.out.println("Enter Deposit");
    dep= KB.nextDouble();
    balance = balance + dep;
  }
  
  public void Print()
  {
    System.out.println("The initial balance was = " + initbal);
    System.out.println("The current balance is = " + balance);
  }
}//End