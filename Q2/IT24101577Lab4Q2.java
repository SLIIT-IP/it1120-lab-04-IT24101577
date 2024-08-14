import java.util.Scanner;
public class IT24101577Lab4Q2{

	public static void main(String[] args){

	Scanner input = new Scanner(System.in);
	
	System.out.print("Please enter exam marks (out of 100): ");
	int examMarks = input.nextInt();

	if(examMarks<0 || examMarks>100){

		System.out.print("Invalid input for exam marks. Terminating program.");
		System.out.println();


	}

	else{

		System.out.print("Please enter lab submission marks (out of 100): ");
		int labMarks = input.nextInt();

		if(labMarks<0 || labMarks>100){
		
			
			System.out.print("Invalid input for lab marks. Terminating program.");
			System.out.println();
	



	}

		else{

			System.out.print("please enter the percentage given for the exam: ");
			double examPercentage = input.nextDouble();

			System.out.print("please enter the percentage given for the lab submission: ");
			double labPercentage = input.nextDouble();

			double totalPercentage = examPercentage + labPercentage;

			if(totalPercentage!=100){

				System.out.print("The percentages must add up to 100. Terminating program.");
				System.out.println();


			}

			else{

				double finalMark = (examMarks * examPercentage/100)+(labMarks * labPercentage/100);
				System.out.println();
				System.out.print("Final Exam Mark is : ");
				System.out.print(finalMark);


			}

			


		}

	

		




	}
	
	














	}



}