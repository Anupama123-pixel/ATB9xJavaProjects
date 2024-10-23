package Oct.ex_17102024;

import java.util.Scanner;

public class Task2_Configure_Triangle {
    public static void main(String[] args) {
        //side1, side2, side2 → eq, iso, scalene
        //should ask it the sides will be in integer or float/double
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length of side1");
        int side1=sc.nextInt();
        System.out.println("Enter length of side2");
        int side2=sc.nextInt();
        System.out.println("Enter length of side3");
        int side3=sc.nextInt();
        //first step is also important
        if (side1<=0 || side2<=0||side3<=0){
            System.out.println("Invalid Input:sides length must be positive");
        } else if(side1==side2 && side2==side3){
            System.out.println("The given triangle is -"+ "Equilateral triangle");
        }
        else if (side1==side2||side2==side3||side3==side1) {
            System.out.println("The given triangle is -"+ "Isosceles triangle");
        } else
            System.out.println("The given triangle is -"+ "Scalen triangle");
    }
}
