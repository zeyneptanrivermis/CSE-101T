//  ZEYNEP TANRIVERMİŞ
//  18.10.2023

import java.util.Scanner;

public class Assignment1b_20220808038 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		int total_sum;
		
		System.out.println("Please enter the grading weight (percentages) for the following categories:");
		
		System.out.println("Quizzes: ");
		int percentage_quizzes = input.nextInt();
		
		if(percentage_quizzes<0){
			System.out.println("ERROR: Invalid value entered (must be between 0 and 100)");
		}
		
		else {
			System.out.println("Homework: ");
			int percentage_homework = input.nextInt();
			
			if(percentage_homework<0) {
				System.out.println("ERROR: Invalid value entered (must be between 0 and 100)");
			}
			
			else {
				System.out.println("Midterm Exam: ");
				int percentage_midterm_exam = input.nextInt();
				
				if(percentage_midterm_exam<0) {
					System.out.println("ERROR: Invalid value entered (must be between 0 and 100)");
				}
				
				else {
					System.out.println("Final Exam: ");
					int percentage_final_exam = input.nextInt();
					
					if(percentage_final_exam<0) {
						System.out.println("ERROR: Invalid value entered (must be between 0 and 100)");
					}
					
					else {
						total_sum=percentage_quizzes+percentage_homework+percentage_midterm_exam+percentage_final_exam;
						if(total_sum!=100) {
							System.out.println("ERROR: The values sum to " + total_sum + " but should sum to 100");
						}
						
						else {
							System.out.println("Please enter the what Zeynep Tanrivermis earned for each category:");
							
							System.out.println("Quizzes: ");
							double student_quizzes = input.nextDouble();
							
							System.out.println("Homework: ");
							double student_homework = input.nextDouble();
							
							System.out.println("Midterm Exam: ");
							double student_midterm_exam = input.nextDouble();
							
							System.out.println("Final Exam: ");
							double student_final_exam = input.nextDouble();
							
							double total_score = (student_quizzes*percentage_quizzes/100) +
									(student_homework*percentage_homework/100) +
									(student_midterm_exam*percentage_midterm_exam/100) +
									(student_final_exam*percentage_final_exam/100);
							
							double gpa = total_score/25;
							
							if(88<=total_score && total_score<=100) {
								System.out.print("Zeynep TANRİVERMİS passed CSE 101 with a score of " + total_score + ", GPA points of" + gpa + ", and a grade letter of AA. ");
							}
							
							else if(81<=total_score && total_score<=87) {
								System.out.print("Zeynep TANRİVERMİS passed CSE 101 with a score of " + total_score + ", GPA points of " + gpa + ", and a grade letter of BA. ");
							}
							
							else if(74<=total_score && total_score<=80) {
								System.out.print("Zeynep TANRİVERMİS passed CSE 101 with a score of " + total_score + ", GPA points of " + gpa + ", and a grade letter of BB. ");
							}
							
							else if(67<=total_score && total_score<=73) {
								System.out.print("Zeynep TANRİVERMİS passed CSE 101 with a score of " + total_score + ", GPA points of " + gpa + ", and a grade letter of CB. ");
							}
							
							else if(60<=total_score && total_score<=66) {
								System.out.print("Zeynep TANRİVERMİS passed CSE 101 with a score of " + total_score + ", GPA points of " + gpa + ", and a grade letter of CC. ");
							}
							
							else if(53<=total_score && total_score<=59) {
								System.out.print("Zeynep TANRİVERMİS conditionally passed CSE 101 with a score of " + total_score + ", GPA points of " + gpa + ", and a grade letter of DC. ");
							}
							
							else if(46<=total_score && total_score<=52) {
								System.out.print("Zeynep TANRİVERMİS  conditionally passed CSE 101 with a score of " + total_score + ", GPA points of " + gpa + ", and a grade letter of DD. ");
							}
							
							else if(35<=total_score && total_score<=45) {
								System.out.print("Zeynep TANRİVERMİS failed CSE 101 with a score of " + total_score + ", GPA points of " + gpa + ", and a grade letter of FD. ");
							}
							
							else {
								System.out.print("Zeynep TANRİVERMİS failed CSE 101 with a score of " + total_score + ", GPA points of " + gpa + ", and a grade letter of FF. ");
							}
						}
					}
				}
				
			}
	
		}

	}

}
