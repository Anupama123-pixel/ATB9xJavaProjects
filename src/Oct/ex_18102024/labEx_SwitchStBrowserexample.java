package Oct.ex_18102024;

import java.util.Scanner;

public class labEx_SwitchStBrowserexample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the browser");
        String browser = sc.next();
        switch (browser) {
            default:
                System.out.println("Given browser is invalid");
                break;
            case "chrome":
                System.out.println("Starting the chrome browser");
                break;
            case "firefox":
                System.out.println("Starting the firefox browser");
                break;
        }
    }
}
