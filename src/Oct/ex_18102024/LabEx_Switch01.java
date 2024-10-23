package Oct.ex_18102024;

import java.util.Scanner;

public class LabEx_Switch01 {
    public static void main(String[] args) {
        //switch condition
        //User- enters int number from 1 to 7
        //which day it is it..
        //1-Mon, 2-tue, 3-wed..7-sun, 8,9,10,,-Invalid
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the day from(1-7)");
        int day=sc.nextInt();
        switch(day){
            case 1:
                System.out.println("Mon");
                break;
            case 2:
                System.out.println("Tue");
                break;
            case 3:
                System.out.println("Wed");
                break;
            case 4:
                System.out.println("thu");
                break;
            case 5:
                System.out.println("Fri");
                break;
            case 6:
                System.out.println("Sat");
                break;
            case 7:
                System.out.println("Son");
                break;
            default:
                System.out.println("Invalid day");
                break;

        }
    }
}
