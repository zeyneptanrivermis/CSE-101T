//ZEYNEP TANRIVERMIS 20220808038 09.12.2023
import java.util.Scanner;
public class Assignment3_20220808038 {	
//METHOD OF MENU
public static int menu(String[] array, Scanner scan) {
	System.out.println("Please enter a choice below:");
	for (int i = 0; i<array.length; i++) {
        System.out.println(array[i]);
    }
	String choice = scan.nextLine();
	if(choice.equals("0")) {return 0;}
	else if(choice.equals("1")) {return 1;}
	else if(choice.equals("2")) {return 2;}
	else if(choice.equalsIgnoreCase("Q")) {return -1;}
	else {System.out.println("Invalid choice.");
	return menu(array, scan);}
}

//METHOD OF QUANTITY VALID
public static boolean isQuantityValid(int[] quantity) {
	boolean result=true;
	for(int i=0; i<quantity.length; i++){
	if(quantity[i] <= 0){return false;}
    else{result= true;}
}
	return result;
}

//METHOD OF WEIGHT VALID
public static boolean isWeightValid(int[] weight) {
	int total_weight=0;
	for(int i=0; i< weight.length ; i++){
		total_weight+=weight[i];
	}
	return total_weight==100 ;
}

//METHOD OF FORMAT CATEGORY
public static void formatCategoryName(String[] category) {
	for (int i=0; i<category.length; i++) {
      if (category[i] != null && !category[i].isEmpty()) {
      	category[i] = category[i].substring(0, 1).toUpperCase() 
      			+ category[i].substring(1).toLowerCase();
      }
	}
}
		
//METHOD OF GRADE LETTER
public static String gradeLetter(double grade) {
	String gradeletter;
	if(grade<=34) {gradeletter="FF";}
	else if(grade<=45) {gradeletter="FD";}
	else if(grade<=52) {gradeletter="DD";}
	else if(grade<=59) {gradeletter="DC";}
	else if(grade<=66) {gradeletter="CC";}
	else if(grade<=73) {gradeletter="CB";}
	else if(grade<=80) {gradeletter="BB";}
	else if(grade<=87) {gradeletter="BA";}
	else {gradeletter="AA";}
	return gradeletter;
}


//METHOD OF GPA POINTS
public static double gpaPoints(double grade) {
	double gpapoints;
	if(grade<=34) {gpapoints=0.0;}
	else if(grade<=45) {gpapoints=0.5;}
	else if(grade<=52) {gpapoints=1.0;}
	else if(grade<=59) {gpapoints=1.5;}
	else if(grade<=66) {gpapoints=2.0;}
	else if(grade<=73) {gpapoints=2.5;}
	else if(grade<=80) {gpapoints=3.0;}
	else if(grade<=87) {gpapoints=3.5;}
	else {gpapoints=4.0;}
	return gpapoints;
}


//METHOD OF STATUS
public static String status(double grade) {
	String result;
	if (grade<=45){result="failed";}
	else if(grade<=59){result="conditionally passed";}
	else {result="passed";}
	return result;
}

//METHOD OF CALCULATE GRADE
public static void calculateGrade(String[]category, 
		int[] quantity, int[] weight) {
	Scanner scan = new Scanner(System.in);
	int length=0; 
    for(int i=0; i< quantity.length;i++){
    	length += quantity[i];
    }
    int [] grade = new int[length];
    if (!(category.length == quantity.length 
    		&& quantity.length == weight.length)) {
        System.out.println("ERROR: Array lengths are not all the same");
    }
	else {
		if (isQuantityValid(quantity)==false) {
			System.out.println("ERROR:Invalid quantity entered");
		}
		else if (isWeightValid(weight)==false) {
			System.out.println("ERROR:Invalid weight entered");
		}
		else {
			System.out.println("Welcome to our university grade system.");
			String[] menu = new String[4];
			menu[0] = "0 - Enter all grades";
			menu[1] = "1 - Display grade information";
			menu[2] = "2 - Change a single grade";
			menu[3] = "Q - to Quit";
			int user_choice = 0;
			double sum1 = 0, sum2 = 0, sum3 = 0, sum4 = 0;
			int[] grades1 = new int[quantity[0]];
			int[] grades2 = new int[quantity[1]];
			int[] grades3 = new int[quantity[2]];
			int[] grades4 = new int[quantity[3]];
			while(true) {
				user_choice = menu(menu, scan);
				//ENTER ALL VALUES
			  	if(user_choice==0) {
			  		formatCategoryName(category);
			  		for(int i=0; i<quantity[0]; i++) {
			  			System.out.println("Please enter grade for " +
			  		category[0] + " " + (i + 1) + ">>");
			  			grades1[i] = scan.nextInt();
			  			sum1 += grades1[i];
			  		}
			  		for(int i=0; i<quantity[1]; i++) {
			  			System.out.println("Please enter grade for " +
			  		category[1] + " " + (i + 1) + ">>");
			  			grades2[i] = scan.nextInt();
			  			sum2 += grades2[i];
			  		}
			  		for(int i=0; i<quantity[2]; i++) {
			  			System.out.println("Please enter grade for " +
			  		category[2] + " " + (i + 1) + ">>");
			  			grades3[i] = scan.nextInt();
			  			sum3 += grades3[i];
			  		}
			  		for(int i=0; i<quantity[3]; i++) {
			  			System.out.println("Please enter grade for " +
			  		category[3] + " " + (i + 1) + ">>");
			  			grades4[i] = scan.nextInt();
			  			sum4 += grades4[i];
			  		}
			  		scan.nextLine();
			  	}
			  		
			  	//CALCULATING NOTES
			  	double average1 = sum1/quantity[0];
			  	double average2 = sum2/quantity[1];
			  	double average3 = sum3/quantity[2];
			  	double average4 = sum4/quantity[3];
			  	double total_grade = (average1*weight[0]/100) +
			  			(average2*weight[1]/100) + (average3*weight[2]/100) 
			  			+(average4*weight[3]/100);
			  				
			  	//DISPLAY GRADE INFORMATION
			  	if(user_choice==1) {
			  		System.out.println("Category information:");
			  		System.out.println(category[0] + " - " + average1);
			  		System.out.println(category[1] + " - " + average2);
			  		System.out.println(category[2] + " - " + average3);
			  		System.out.println(category[3] + " - " + average4);
			  		System.out.println("Overall Grade - " + total_grade);
			  	    System.out.println("Grade Letter - " 
			  		+ gradeLetter(total_grade));
			  		System.out.println("GPA Points - " 
			  		+ gpaPoints(total_grade));
			  		System.out.println("Status - " + status(total_grade));
			  	}
			  		
			  	//CHANGE A VALUE
			  	if(user_choice==2) {
			  		System.out.println("Please enter the category");
			  		for(int i=0; i<category.length; i++) {
			  			System.out.println(i + " - " + category[i]);
			  		}
			  		System.out.println("Q - " + "to Quit");
			  	    String choice_change = scan.nextLine();
			  		if(choice_change.equals("0")) {
			  			System.out.println("Please enter which Quiz "
			  					+ "you would like to change (1-" 
			  					+ quantity[0] + ") >>");
			  			int change_quiz = scan.nextInt();
			  			System.out.println("The current grade for Quiz"
			  			+ change_quiz + " is " +  grades1[--change_quiz]);
			  			System.out.println("Please enter the new"
			  					+ " grade value >>");
			  			grades1[change_quiz-1] = scan.nextInt();
			  		}
			  		else if(choice_change.equals("1")) {
			  			System.out.println("Please enter which Homework"
			  					+ " you would like to change (1- "
			  					+ quantity[0] + ") >>");
			  			int change_homework = scan.nextInt();
			  			System.out.println("The current grade for Quiz" 
			  			+ change_homework + " is " +
			  					grades2[--change_homework]);
			  			System.out.println("Please enter the"
			  					+ " new grade value >>");
			  			grades2[change_homework-1] = scan.nextInt();
			  		}
			  		else if(choice_change.equals("2")) {
			  			System.out.println("Please enter which Midterm"
			  					+ " exam you would like to change"
			  					+ " (1-" + quantity[0] + ") >>");
			  			int change_midterm = scan.nextInt();
			  			System.out.println("The current grade for Quiz"
			  			+ change_midterm + " is " +
			  					grades3[--change_midterm]);
			  			System.out.println("Please enter the"
			  					+ " new grade value >>");
			  			grades3[change_midterm-1] = scan.nextInt();
			  		}
			  		else if(choice_change.equals("3")) {
			  			System.out.println("Please enter which"
			  					+ " Final exam you would like to change"
			  					+ " (1-" + quantity[0] + ") >>");
			  			int change_final = scan.nextInt();
			  			System.out.println("The current grade for Quiz" +
			  			change_final + " is " +  grades4[--change_final]);
			  			System.out.println("Please enter the new"
			  					+ " grade value >>");
			  			grades4[change_final-1] = scan.nextInt();
			  		}
			  		scan.nextLine();
			  	}
			  		
			  	//QUIT
			  	if(user_choice==-1) {
			  		System.out.println("Thank you for using"
			  				+ " our system. Have a nice day.");
			  		break;
			  	}
			  		
			  	//INVALID
			  	if(user_choice==3) {
			  		System.out.println("Invalid choice.");
			  	}
			}
		}
	}	
}	
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	String[] category = new String[4];
	category[0] = "QUiZ";
	category[1] = "HomeWORK";
	category[2] = "Midterm EXam";
	category[3] = "FiNAL Exam";
	int[]quantity = {4, 3, 1, 1};
	int[]weight = {10, 20, 30, 40};
	calculateGrade(category, quantity, weight);

}
}
