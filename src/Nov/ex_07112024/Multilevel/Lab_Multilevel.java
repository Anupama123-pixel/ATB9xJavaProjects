package Nov.ex_07112024.Multilevel;

public class Lab_Multilevel {
    public static void main(String[] args) {
        Lab_Child c = new Lab_Child();
        c.home();
        c.gf();
        c.f();
        c.c();

        Lab_Father f1 = new Lab_Father();
        f1.gf();
        f1.f();
        f1.father_extra();

        Lab_GrandFather g1 = new Lab_GrandFather();
        g1.gf();
        g1.home();

    }
}
