//Name:Matthew Hoesch
public class Circle
{ //Instance variables 
  int radius;
  double area;
  
  public Circle (int radius) //Circle is the constructor(method- receives the variables from the program and 
                            // assigns instances, radius is the argument(in the parentheses)
  {
    this.radius=radius; //the first radius is the instance variable radius.
  }
public void findarea()
{
  area= radius* radius* Math.PI;
}
public void print()
{
  System.out.println("area = " + area);
}
}