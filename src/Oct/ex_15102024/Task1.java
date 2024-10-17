package Oct.ex_15102024;

public class Task1 {
    public static void main(String[] args) {
        // Largest of three numbers using Ternary operator
        int a = 5, b = 5, c = 4;
        int result = (a >= b && a>=c) ? a : (b >= c) ? b : c;
        System.out.println(result);
    }
}
