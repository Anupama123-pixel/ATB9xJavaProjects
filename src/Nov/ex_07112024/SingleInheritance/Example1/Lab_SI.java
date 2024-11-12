package Nov.ex_07112024.SingleInheritance.Example1;

public class Lab_SI {
    public static void main(String[] args) {
        // Single Inheritance
        // Son will get the attributes from Father.
        // 1 son and 1 father.
        son s1 = new son();
        System.out.println(s1.gold_f);
        s1.bhk2(); // Son has extended
        s1.bhk3();

        Father f1 = new Father();
        // f1.bhk3(); Father has not extended
    }
}
