import java.util.Scanner;

class Scores {
	public static void main(String[] args) {
		Scanner kb=new Scanner (System.in);
		double[] score= new double[5];
		int index;
		double max;
		
		System.out.println("Enter in 5 scores");
		score[0] =kb.nextDouble();
		max=score[0];
		for (index =1; index<5; index++)
		{
			score[index]=kb.nextDouble();
			if (score[index]> max)
				max= score[index];
		}
		System.out.println("The highest score is=" + max);
		System.out.println("The scores are:");
		for (index =0; index<5; index++)
		System.out.println(score[index] + "differs from max by" + (max - score[index]));
	}
}