//Wrapper program 
public class WrapperDemo 
{
  public static void main (String[] args)
  {
    //Integer. is the wrapper class
    int intNumber = Integer.parseInt("1234");
    
    double dblNumber = Double.parseDouble("1245");
    //Double. is the wrapper class
    System.out.println("The integer value of intNumber is = " + intNumber);
    System.out.println("The floating - point value of dblNumber is = " + dblNumber);
  }
}