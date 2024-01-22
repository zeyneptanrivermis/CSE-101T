import java.util.*;
public class Assignment2_20220808038 {
	// @ Zeynep TANRIVERMIS 
	// @ Started on 08.11.2023
	
	public static String formatCategoryName(String categoryname) {
	String category;
	category = categoryname.substring(0,1).toUpperCase()
			+categoryname.substring(1).toLowerCase();
	return category;
	}
			
	public static boolean isQuantityValid(int quantity) {
	boolean result;
	if(quantity>0) {result=true;}
	else {result=false;}
	return result;
	}
			
	public static boolean isWeightValid(int weight,int totalweight) {
	boolean result;
	if(weight>=0 && totalweight<=100) {result=true;}
	else {result=false;}
	return result;
	}
			
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
			
	public static String status(double grade) {
	String result;
	if (grade<=45){result="failed";}
	else if(grade<=59){result="conditionally passed";}
	else {result="passed";}
	return result;
	}
			
			
	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	Scanner reader = new Scanner(System.in);
	int total_weight = 0;
			
	//Category1
	System.out.println("*******Category Information Entry*******");
	System.out.println("Please enter the name of the category 1:");
	String category_name_1 = reader.nextLine();
	category_name_1 = formatCategoryName(category_name_1);
	System.out.println("Please enter how many items of type " 
	+ category_name_1 + " were given:");
	int category_items_1 = scan.nextInt();
	while(isQuantityValid(category_items_1)==false) {
		System.out.println("Please enter how many items of type " 
	+category_name_1 + " were given:");
		category_items_1 = scan.nextInt();
		}
	System.out.println("Please enter the percentage weight of " 
		+ category_name_1);
	int category_weight_1 = scan.nextInt();
	total_weight += category_weight_1;
	while(isWeightValid(category_weight_1, total_weight)==false) {
		System.out.println("Please enter the percentage weight of " 
	+ category_name_1);
		category_weight_1 = scan.nextInt();
		total_weight = category_weight_1;
		}
			
	//Category2
	System.out.println("Please enter the name of the category 2:");
	String category_name_2 = reader.nextLine();
	category_name_2 = formatCategoryName(category_name_2);
	System.out.println("Please enter how many items of type " 
	+ category_name_2 + " were given:");
	int category_items_2 = scan.nextInt();
	while(isQuantityValid(category_items_2)==false) {
		System.out.println("Please enter how many items of type " 
	+ category_name_2 + " were given:");
		category_items_2 = scan.nextInt();
	}
	System.out.println("Please enter the percentage weight of " 
	+ category_name_2);
	int category_weight_2 = scan.nextInt();
	total_weight += category_weight_2;
	while(isWeightValid(category_weight_2, total_weight)==false) {
		System.out.println("Please enter the percentage weight of " 
	+ category_name_2);
		category_weight_2 = scan.nextInt();
		total_weight = category_weight_1 + category_weight_2;
	}
			
	//Category3
	System.out.println("Please enter the name of the category 3:");
	String category_name_3 = reader.nextLine();
	category_name_3 = formatCategoryName(category_name_3);
	System.out.println("Please enter how many items of type " 
	+ category_name_3 + " were given:");
	int category_items_3 = scan.nextInt();
	while(isQuantityValid(category_items_3)==false) {
		System.out.println("Please enter how many items of type " 
	+ category_name_3 + " were given:");
		category_items_3 = scan.nextInt();
	}
	System.out.println("Please enter the percentage weight of "
	+ category_name_3);
	int category_weight_3 = scan.nextInt();
	total_weight += category_weight_3;
	while(isWeightValid(category_weight_3, total_weight)==false) {
	System.out.println("Please enter the percentage weight of " 
	+ category_name_3);
	category_weight_3 = scan.nextInt();
	total_weight = category_weight_1 + category_weight_2 + category_weight_3;
	}
			
	//Category4
	System.out.println("Please enter the name of the category 4:");
	String category_name_4 = reader.nextLine();
	category_name_4 = formatCategoryName(category_name_4);
	System.out.println("Please enter how many items of type " 
	+ category_name_4 + " were given:");
	int category_items_4 = scan.nextInt();
	while(isQuantityValid(category_items_4)==false) {
		System.out.println("Please enter how many items of type " 
	+ category_name_4 + " were given:");
		category_items_4 = scan.nextInt();
	}
	System.out.println("Please enter the percentage weight of " 
	+ category_name_4);
	int category_weight_4 = scan.nextInt();
	total_weight += category_weight_4;
	while(isWeightValid(category_weight_4, total_weight)==false) {
		System.out.println("Please enter the percentage weight of " 
	+ category_name_4);
		category_weight_4 = scan.nextInt();
		total_weight = category_weight_1 + category_weight_2 
				+ category_weight_3 + category_weight_4;
	}
			
	//Category5
	System.out.println("Please enter the name of the category 5:");
	String category_name_5 = reader.nextLine();
	category_name_5 = formatCategoryName(category_name_5);
	System.out.println("Please enter how many items of type " 
	+ category_name_5 + " were given:");
	int category_items_5 = scan.nextInt();
	while(isQuantityValid(category_items_5)==false) {
		System.out.println("Please enter how many items of type " 
	+ category_name_5 + " were given:");
		category_items_5 = scan.nextInt();
	}
	System.out.println("Please enter the percentage weight of " 
	+ category_name_5);
	int category_weight_5 = scan.nextInt();
	total_weight += category_weight_5;
	while(isWeightValid(category_weight_5, total_weight)==false) {
		System.out.println("Please enter the percentage weight of " 
	+ category_name_5);
		category_weight_5 = scan.nextInt();
		total_weight = category_weight_1 + category_weight_2 
				+ category_weight_3 + category_weight_4 + category_weight_5;
	}
			
	if (total_weight!=100) {
				System.out.println("Error:The total weight must equal"
						+ " to 100!");
	}
	else {
		//Student's Grade Entry
		double average_1, average_2,  average_3,  average_4, average_5;
		double  total_grade;
		double sum1=0, sum2=0, sum3=0, sum4=0, sum5=0;
		double grade_input_1, grade_input_2, grade_input_3,
		grade_input_4, grade_input_5;
		System.out.println("*******Student Grade Entry*******");
		System.out.println("Please enter values that the student"
				+ " earned for each item:");
		for(int i=1;i<=category_items_1;i++) {
			System.out.println(category_name_1+" " +i +":");
			grade_input_1=scan.nextDouble();
			while(grade_input_1<0 || grade_input_1>100) {
				System.out.println(category_name_1+" " +i +":");
				grade_input_1=scan.nextDouble();
			}
			sum1+=grade_input_1;
		}
		for(int i=1;i<=category_items_2;i++) {
			System.out.println(category_name_2+" " +i +":");
			grade_input_2=scan.nextDouble();
			while(grade_input_2<0 || grade_input_2>100) {
				System.out.println(category_name_2+" " +i +":");
				grade_input_2=scan.nextDouble();
			}
			sum2+=grade_input_2;
		}
		for(int i=1;i<=category_items_3;i++) {
			System.out.println(category_name_3+" " +i +":");
			grade_input_3=scan.nextDouble();
			while(grade_input_3<0 || grade_input_3>100) {
				System.out.println(category_name_3+" " +i +":");
				grade_input_3=scan.nextDouble();
			}
			sum3+=grade_input_3;
		}
		for(int i=1;i<=category_items_4;i++) {
			System.out.println(category_name_4+" " +i +":");
			grade_input_4=scan.nextDouble();
			while(grade_input_4<0 || grade_input_4>100) {
				System.out.println(category_name_4+" " +i +":");
				grade_input_4=scan.nextDouble();
			}
			sum4+=grade_input_4;
		}
		for(int i=1;i<=category_items_5;i++) {
			System.out.println(category_name_5+" " +i +":");
			grade_input_5=scan.nextDouble();
			while(grade_input_5<0 || grade_input_5>100) {
				System.out.println(category_name_5+" " +i +":");
				grade_input_5=scan.nextDouble();
			}
			sum5+=grade_input_5;
		}
			
				
		average_1 = (sum1/category_items_1);
		average_2 = (sum2/category_items_2);
		average_3 = (sum3/category_items_3);
		average_4 = (sum4/category_items_4);
		average_5 = (sum5/category_items_5);
		total_grade = average_1*category_weight_1/100 
				+average_2*category_weight_2/100 
				+average_3*category_weight_3/100 
				+average_4*category_weight_4/100 
				+average_5*category_weight_5/100;
		System.out.println("*******Student Grade Results*******");
		System.out.println(formatCategoryName(category_name_1) 
				+ ": " + average_1);
		System.out.println(formatCategoryName(category_name_2) 
				+ ": " + average_2);
		System.out.println(formatCategoryName(category_name_3) 
				+ ": " + average_3);
		System.out.println(formatCategoryName(category_name_4) 
				+ ": " + average_4);
		System.out.println(formatCategoryName(category_name_5) 
				+ ": " + average_5);
		System.out.println("The student has " + status(total_grade) 
		+ " CSE 101 with a score of " + total_grade + ", GPA points of "
				+ gpaPoints(total_grade) + ", and a grade letter of " 
		+ gradeLetter(total_grade));
			}
			
	}

}