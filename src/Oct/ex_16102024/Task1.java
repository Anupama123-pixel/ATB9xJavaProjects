package Oct.ex_16102024;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Your Name");
         String name= sc.next();
         System.out.println("Enter your age");
         int age = sc.nextInt();
         System.out.println("Enter your salary");
         int salary=sc.nextInt();
        System.out.println("Your Name- "+ name);
        System.out.println("Your Age -"+age);
        System.out.println("Your salary -"+salary);
        sc.close();

    }
}
