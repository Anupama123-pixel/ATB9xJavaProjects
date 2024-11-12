package Oct.ex_29102024;

public class Lab_Arrays_P1 {
    public static void main(String[] args) {
       int[] marks = {90,92,94,89,76,87};
        System.out.println(marks[0]);
        System.out.println(marks[4]);
        //System.out.println(marks[8]);-->ArrayindexOutOfBoundsException(since index is out of bound)
        System.out.println(marks.length);
    }
}
