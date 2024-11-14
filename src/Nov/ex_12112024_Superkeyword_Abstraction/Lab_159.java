package Nov.ex_12112024_Superkeyword_Abstraction;

public class Lab_159 {

    public static void main(String[] args) {
        wagonR w = new wagonR();
      w.drive();
      Tesla t = new Tesla();
      t.drive();
    }
}


class wagonR extends Engine{

    void drive(){
        startEngine();
        stopEngine();
    }
    @Override
    void startEngine() {
        System.out.println("starting car");
    }

    @Override
    void stopEngine() {
        System.out.println("stoping car");
    }
}
abstract class Engine{
    abstract void startEngine();
    abstract void stopEngine();
}
