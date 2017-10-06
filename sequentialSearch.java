//Write a program to input numbers into an array and find the key 

import java.util.Scanner;
public class sequentialSearch
{
  public static void main (String[] args)
  {
    int list[]= new int[6];
    int key,i;
    
    Scanner kb=new Scanner (System.in);
    
    System.out.println("Enter 6 numbers and store them in array");
    for (i=0;i<6;i++)
    {
     list[i]=kb.nextInt();
    }
    System.out.println("Enter the key");
         key = kb.nextInt();
         
         SSearch sr= new SSearch(list, key);
         //Constructor and object is created
       
         sr.search(); //function search is called
         }
}

//Constructor and object is created
         /* 1)Has the same name as the class,
          * 2)DOes not have a return type
          * 3)Called when the object is created
          * 4)Takes the arguments and assigns them to instance variables
          * */