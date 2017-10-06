import java.util.Scanner;

public class bSearch
{
  int list[], first=0, last=6, flag=0, mid=0, key;
 //passing the list of 7 numbers 
public bSearch(int list[])
{
  this.list=list;
}
public void searchKey()
{
  System.out.println("Enter in the key");
  Scanner kb= new Scanner(System.in);
  key= kb.nextInt();
  while(flag==0 && first <= last)
  {
    mid = (first+last)/2;
    if (key<list[mid])
    last= mid-1;
    else if(key > list[mid])
      first=mid+1;
    else if(key == list[mid])
      flag=1;
  }
  if(flag==1)
    System.out.println("Key is found at location " + mid);
  else
    System.out.println("Key is not found");
}
}

    