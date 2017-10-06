public class AssignGrade
{
  String name[], temp2;
  int score[]; 
  char grade[]= new char[3],temp1;
  int i, flag=0, count=2;
  
  public AssignGrade(String name[], int score[])
  {
    this.name= name;
    this.score= score;
  }
 public void findgrade()
 {
  for(i=0;i<3;i++)
  {
     if(score[i]>=90)
     grade[i]='A';
     else if(score[i] >=80)
     grade[i]='B';
     else if(score[i] >=70)
     grade[i]='C';
     else if(score[i] >=60)
     grade[i]='D';
     else 
     grade[i]='F';
  }
     System.out.println();
     for(i=0;i<3;i++)
       System.out.println(name[i] + " " + grade[i]);
 }
 
 public void bsort()
 {
   while(flag == 0)
   {
     flag=1;
     for(i=0; i<count; i++)
     {
       if(grade[i] > grade[i+1])
       {
       temp1 = grade[i];
       grade[i] = grade[i+1];
       grade[i+1]= temp1;
       
       temp2= name[i];
       name[i]= name[i+1];
       name[i+1]= temp2;
       flag=0;
     }
   }
   count--;
 }
 System.out.println("The sorted list is: ");
 for(i=0;i<3;i++)
   System.out.println(name[i] + " " + grade[i]);
}
}
