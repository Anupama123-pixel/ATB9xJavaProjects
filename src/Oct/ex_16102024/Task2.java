package Oct.ex_16102024;

public class Task2 {
    public static void main(String[] args) {
        int a= Integer.parseInt(args[0]);
        int b= Integer.parseInt(args[1]);
        int max= (a>b)? a:b;
        System.out.println("maximum number is -"+ max);
    }
}
