package Oct.ex_23102024;

import java.util.Scanner;

public class Task_Functions01 {
    public static void main(String[] args) {
        System.out.println("Arithmetic Operaters");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first value- ");
        while(!sc.hasNextInt()){
            System.out.println("Enetered input is not valid:");
            sc.next();
            System.out.println("Enter an integer:");
        }
        int a = sc.nextInt();
        System.out.println("Enter the Second value- ");
        while(!sc.hasNextInt()){
            System.out.println("Enetered input is not valid:");
            sc.next();
            System.out.println("Enter an integer:");
        }
        int b = sc.nextInt();
        int sum = Sum(a,b);
        System.out.println("summation->"+ sum);
        int sub = Sub(a,b);
        System.out.println("substraction->"+ sub);
        int mul = Mul(a,b);
        System.out.println("multiplication->"+ mul);
        int div = Div(a,b);
        System.out.println("division->"+ div);
        int mod = Div(a,b);
        System.out.println("modulus->"+ mod);
        sc.close();
    }
    static int Sum(int a, int b){
       return a+b;
    }
    static int Sub(int a, int b) {
         return a - b;
    }
    static int Mul(int a, int b){
        return a*b;
    }
    static int Div(int a, int b){
        return a/b ;
    }
    static int mod(int a, int b){
        return a % b ;
    }

}

