import java.util.Scanner;
class solution {
	public static void main(String[] args) {
	
	int num1;
	int num2;
	int solution;
	
	Scanner kb= new Scanner(System.in);
	System.out.println("Enter in the first number");
	num1=kb.nextInt();
	System.out.println("Enter in the second number");
	num2=kb.nextInt();
	
	solution=num1+num2;
	
	System.out.println("The solution is " + solution);
	}
}