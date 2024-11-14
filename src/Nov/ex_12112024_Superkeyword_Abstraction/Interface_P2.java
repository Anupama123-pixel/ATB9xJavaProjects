package Nov.ex_12112024_Superkeyword_Abstraction;

public class Interface_P2 {
    public static void main(String[] args) {
        P p = new P();
        p.f1();
    }
}
//IF ANYTHING IS INCOMPLETE OBJECT CANNOT BE CREATED FOR THAT.
class P implements I1{

    @Override
    public void f1() {

    }

    @Override
    public void f2() {

    }

    @Override
    public void f3() {

    }
}

interface I1{
    //by default these will be public static in nature
    void f1();
    void f2();
    void f3();
}
