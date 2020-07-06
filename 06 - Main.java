
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GradeStatistics grades = new GradeStatistics();
        // Write your program here -- consider breaking the program into 
        // multiple classes.
        
        System.out.println("Enter point totals, -1 stops:");
        while (true){
            int input = Integer.valueOf(scanner.nextLine());
            if (input == -1){
                break;
            }
            if (input >= 0 && input <= 100){
                grades.add(input);
                
            }
        }
        System.out.println("Point average (all): " + grades.average());
        if (grades.averagePassingGrades() == -1){
            System.out.println("Point average (passing): -");
        } else {
            System.out.println("Point average (passing): " + grades.averagePassingGrades());
        }
        System.out.println("Pass percentage: " + grades.passPercentage());
        grades.gradeDistribution();
    }
}
