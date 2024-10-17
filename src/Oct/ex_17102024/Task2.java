package Oct.ex_17102024;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        //side1, side2, side2 → eq, iso, scalene
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length of side1");
        int side1=sc.nextInt();
        System.out.println("Enter length of side2");
        int side2=sc.nextInt();
        System.out.println("Enter length of side3");
        int side3=sc.nextInt();
        if (side1==side2 && side2==side3){
            System.out.println("The given triangle is -"+ "Equilateral triangle");
        }
        else if (side1==side2||side2==side3||side3==side1) {
            System.out.println("The given triangle is -"+ "Isosceles triangle");
        } else
            System.out.println("The given triangle is -"+ "Scalen triangle");
    }
}
