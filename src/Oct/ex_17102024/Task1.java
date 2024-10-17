package Oct.ex_17102024;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        // Write a program that calculates and displays the letter grade
// for a given numerical score (e.g., A, B, C, D, or F)
// based on the following grading scale:
//
//A: 90-100
//B: 80-89
//C: 70-79
//D: 60-69
//F: 0-59
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your score");
        int score = sc.nextInt();
        if(score>=90 && score<=100){
            System.out.println("Grade obtained is -"+ 'A');
        } else if (score>=80 && score<90) {
            System.out.println("Grade obtained is -"+ 'B');
        }
        else if (score>=70 && score<80) {
            System.out.println("Grade obtained is -"+ 'C');
        }
        else if (score>=60 && score<70) {
            System.out.println("Grade obtained is -"+ 'D');
        }
        else if (score>=0 && score<60) {
            System.out.println("Grade obtained is -60"+ 'E');
        }
    }
}
