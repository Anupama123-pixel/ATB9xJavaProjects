package Nov.ex_12112024_Superkeyword_Abstraction;

public class Lab_Super_keyword {
    public static void main(String[] args) {
        car c = new car();

    }
}

    class car extends Vehicle{
        private int max_speed =281;
        @Override
        void disply() {
            System.out.println("child");
        }
        car(){
            super(10);  //Hello vehicle
            System.out.println("DC car");// If we call default constructor i=of child measns by default super keyword calls parent constructor as well.
            System.out.println(this.max_speed);//281
            System.out.println(super.max_speed);//180
            this.disply();  //child
            super.disply();  //parent
        }
    }

class Vehicle{
    public int max_speed =180;

    void disply(){
        System.out.println("parent");
    }

    Vehicle(){
        System.out.println("DC Vehicle");
    }
    Vehicle(int a){
        System.out.println("PC vehicle");
    }
   //Method Overloading
    void message(){
        System.out.println("Hello Vehicle");
    }
    void message(int a){
        System.out.println("Hello Vehicle");
    }
}
