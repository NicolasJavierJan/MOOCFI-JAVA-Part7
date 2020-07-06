/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nico
 */

import java.util.ArrayList;

public class GradeStatistics {
    private ArrayList<Integer> grades;
    private ArrayList<Integer> passingGrades;
    
    public GradeStatistics(){
        this.grades = new ArrayList<>();
        this.passingGrades = new ArrayList<>();
    }
    
    public void add(int grade){
        this.grades.add(grade);
        if (grade >= 50){
            this.passingGrades.add(grade);
        }
    }
    
    public double average(){
        int size = this.grades.size();
        int sum = 0;
        for (int grade : this.grades){
            sum = sum + grade;
        }
        if (sum <= 0){
            return 0;
        }
        double average = (sum * 1.0) / size;
        return average;
    }
    
    public double averagePassingGrades(){
        int size = this.passingGrades.size();
        if (size == 0){
            return -1;
        }
        int sum = 0;
        for (int grade : this.passingGrades){
            sum = sum + grade;
        }
        return (sum * 1.0) / size;
    }
    
    public double passPercentage(){
        double participants = this.grades.size() * 1.0;
        int passing = this.passingGrades.size();
        if (participants == 0 || passing == 0){
            return 0;
        }
        return ((100 * passing) / participants);
    }
    
    public void starify(int number){
        for (int i = 0; i < number; i++){
            System.out.print("*");
        }
    }
    
    public void gradeDistribution(){
        int five = 0;
        int four = 0;
        int three = 0;
        int two = 0;
        int one = 0;
        int zero = 0;
        for (int i = 0; i < this.grades.size(); i++){
            int index = this.grades.get(i);
            if (index < 50){
                zero++;
            } else if (index < 60){
                one++;
            } else if (index < 70){
                two++;
            } else if (index < 80){
                three++;
            } else if (index < 90){
                four++;
            } else if (index <= 100){
                five++;
            }
        }
        System.out.println("Grade distribution:");
        System.out.print("5: ");
        starify(five);
        System.out.println("");
        System.out.print("4: ");
        starify(four);
        System.out.println("");
        System.out.print("3: ");
        starify(three);
        System.out.println("");
        System.out.print("2: ");
        starify(two);
        System.out.println("");
        System.out.print("1: ");
        starify(one);
        System.out.println("");
        System.out.print("0: ");
        starify(zero);
        System.out.println("");
    }
}
