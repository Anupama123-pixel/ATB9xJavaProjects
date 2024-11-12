package Nov.ex_06112024_Constructor;

public class Lab_Constructors {
    public static void main(String[] args) {
        Lab_Car tesla = new Lab_Car();
        System.out.println(tesla.year);
        System.out.println(tesla.name);
        System.out.println(tesla.model);

        Lab_Car nano = new Lab_Car();
        nano.name = "Tata Nano";
        System.out.println(nano.name);


    }
}
