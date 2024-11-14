package Nov.ex_12112024_Superkeyword_Abstraction;

public class Interface_P3 {
    public static void main(String[] args) {
    child1 c = new child1();
    c.f1();
    c.same();
   }
}

class child1 implements Father1,Mother1{       //MULTIPLE INHERITANCE SOLVED

    @Override
    public void f1() {

    }

    @Override
    public void f2() {

    }

    @Override
    public void same() {
        System.out.println("Same methods calls at once");
    }

    @Override
    public void f3() {

    }

    @Override
    public void f4() {

    }
}
interface Father1{
    void f1();
    void f2();
    void same();
}
interface Mother1{
    void f3();
    void f4();
    void same();
}