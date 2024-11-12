package Oct.ex_30102024;

public class Lab_Arrays_For_Each {
    public static void main(String[] args) {
        int[] a = new int[3];
        a[0] = 90;
        a[1] = 91;
        a[2] = 92;

//        for (int i = 0; i < a.length; i++) {
//            System.out.println(a[i]);
//        }
// Syntax
        /*for (dataType item : array) {
         Code to be executed for each item
        }*/
        for (int i : a) {
            System.out.println(i);
        }

        String[] names = {"pramod", "amit", "lucky", "anil"};
        for (String name : names) {
            System.out.println(name);
        }

        for (String n : names) {
            System.out.println(n);
        }

        int[] numbers = {1, 2, 3, 4, 5};
        for (int number : numbers) {
            System.out.println(number);
        }
    }
}
