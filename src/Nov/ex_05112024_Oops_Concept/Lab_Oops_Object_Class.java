package Nov.ex_05112024_Oops_Concept;

public class Lab_Oops_Object_Class {
    public static void main(String[] args) {
        Lab_StudentsATB_ObjectClass s1 = new Lab_StudentsATB_ObjectClass();
        s1.name= "Ramu";
        s1.age = 20;
        s1.batch_no = 9;
        s1.isMale = true;
        System.out.println(s1.name);

        Lab_StudentsATB_ObjectClass s2 = new Lab_StudentsATB_ObjectClass();
        s2.name = "Radha";
        s2.age = 25;
        s2.batch_no = 9;
        s2.isMale = false;
        System.out.println(s2.name);
    }
}
