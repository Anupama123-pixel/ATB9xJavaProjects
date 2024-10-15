package Oct.ex_15102024;

public class Task1 {
    public static void main(String[] args) {
        // Largest of three numbers using Ternary operator
        int a = 2, b = 3, c = 4;
        int result = (a > b) ? a : (b > c) ? b : c;
        System.out.println(result);
    }
}
