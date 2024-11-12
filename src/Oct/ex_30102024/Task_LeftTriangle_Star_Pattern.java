package Oct.ex_30102024;

import java.util.Scanner;

public class Task_LeftTriangle_Star_Pattern {
    public static void main(String[] args) {
        /*     *
              **
             ***
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number n");
        int n = sc.nextInt();
        for (int i = n; i>0;i--){  //i=2
            for(int j = n; j>=i; j--){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
