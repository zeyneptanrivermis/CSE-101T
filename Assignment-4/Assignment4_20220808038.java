// @Zeynep Tanrıvermiş
// @28.12.2023
import java.io.*;
import java.util.Scanner;
public class Assignment4_20220808038 {

    //Count Category Method
    public static int countCategory(String filename) {
        int count = 0;
        try (Scanner reader = new Scanner(new File(filename))) {
            while (reader.hasNextLine()) {
                String line = reader.nextLine().trim();
                if (!line.isEmpty()) {
                    count++;
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return count;
    }

    // Get Category Method
    public static void getCategory(String[] category, int[] quantity, int[] weights, String filename) {
        try (Scanner reader = new Scanner(new File(filename))) {
            int index = 0;
            while (reader.hasNextLine() && index < category.length) {
                String info_category = reader.nextLine();
                String[] cat = info_category.split(" ");
                if (cat.length >= 3) {
                    category[index] = cat[0];
                    quantity[index] = Integer.parseInt(cat[1]);
                    weights[index] = Integer.parseInt(cat[2]);
                    index++;
                }
            }
        } catch (FileNotFoundException | NumberFormatException e) {
            e.printStackTrace();
        }
    }

    // Write Grades Method
    public static void writeGrades(String[] students, double[] grades, String studentGrades, String errorLog) {
        try (PrintWriter writer = new PrintWriter(new FileWriter(studentGrades))) {
            for (int i = 0; i < students.length; i++) {
                writer.println(students[i] + " " + grades[i]);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    // Calculate average grade
    public static double calculateAverage(int[] scores) {
        int sum = 0;
        for (int score : scores) {
            sum += score;
        }
        return (double) sum / scores.length;
    }

    // Calculate grade method
    public static String calculateGrade(double average) {
        String gradeletter;
	    if(average<=34) {gradeletter="FF";}
	    else if(average<=45) {gradeletter="FD";}
	    else if(average<=52) {gradeletter="DD";}
	    else if(average<=59) {gradeletter="DC";}
	    else if(average<=66) {gradeletter="CC";}
	    else if(average<=73) {gradeletter="CB";}
	    else if(average<=80) {gradeletter="BB";}
	    else if(average<=87) {gradeletter="BA";}
	    else {gradeletter="AA";}
	    return gradeletter;
    }

    // GPA points method
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

    // Status method
    public static String status(double grade) {
	    String result;
	    if (grade<=45){result="failed";}
	    else if(grade<=59){result="conditionally passed";}
	    else {result="passed";}
	    return result;
    }

    public static void main(String[] args) throws IOException {
        String courseDetailsName = null;
        String studentScoresName = null;
        String studentGradesName = null;
        String errorsName = null;
        if(args.length==1){
            String baseFilename = args[0];
            courseDetailsName = baseFilename + "_CourseDetails.txt";
            studentScoresName = baseFilename + "_StudentScores.txt";
            studentGradesName = baseFilename + "_StudentGrades.txt";
            errorsName = baseFilename + "_Error.txt";
        }
        else if(args.length==4){
            courseDetailsName = args[0] + ".txt";
            studentScoresName = args[1] + ".txt";
            studentGradesName = args[2] + ".txt";
            errorsName = args[3] + ".txt"; 
        }
        else {
            errorsName = "ErrorLog.txt";
            try (PrintWriter writer = new PrintWriter(new FileWriter(errorsName, true))) {
                writer.println("ERROR: Invalid input");
                return;
            } catch (IOException e) {
                System.err.println("Error writing to error log: " + e.getMessage());
                return;
            }
        }

        // Read category information
        int length = countCategory(courseDetailsName);
        String[] category = new String[length];
        int[] quantity = new int[length];
        int[] weights = new int[length];
        try {
            getCategory(category, quantity, weights, courseDetailsName);
        } catch (FileNotFoundException e) {
            // Handle file not found exception
            System.err.println("Category file not found: " + e.getMessage());
            return;
        }

        // Read students scores and calculate grades
        String[] students = null;
    double[] grades = null;
    int index = 0;
    try (Scanner reader = new Scanner(studentScoresName)) {
        while (reader.hasNextLine()) {
            String line = reader.nextLine();
            String[] parts = line.split(" ");
            students[index] = parts[0];
            int[] scores = new int[parts.length - 1];
            for (int i = 1; i < parts.length; i++) {
                scores[i - 1] = Integer.parseInt(parts[i]);
            }
            double average = calculateAverage(scores);
            String grade = calculateGrade(average);
            double gpa = gpaPoints(average);
            grades[index] = gpa; 
            index++;
        }
    }
    writeGrades(students, grades, studentGradesName, errorsName);
    }    
}