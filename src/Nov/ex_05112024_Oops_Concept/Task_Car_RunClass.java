package Nov.ex_05112024_Oops_Concept;

public class Task_Car_RunClass {
    public static void main(String[] args) {
        Task_Car_ObjectClass c1 = new Task_Car_ObjectClass();
        c1.make = "Audi";
        c1.year=2020;
        c1.price=1000000;
        System.out.println("Car make is"+ c1.make);
        System.out.println("Car Model Year is" +c1.year);
        System.out.println("Car Price is"+c1.price);

        Task_Car_ObjectClass c2 = new Task_Car_ObjectClass();
        c2.make = "Maruti suzuki";
        c2.year=2021;
        c2.price=1500000;
        System.out.println("Car make is"+ c2.make);
        System.out.println("Car Model Year is" +c2.year);
        System.out.println("Car Price is"+c2.price);
    }

}
