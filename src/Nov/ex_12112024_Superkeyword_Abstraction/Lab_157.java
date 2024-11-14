package Nov.ex_12112024_Superkeyword_Abstraction;

public class Lab_157 {
}
class pramod extends Loan{

    @Override
    void load50k() {
        System.out.println("Giving the loan");
    }

    @Override
    void loan30k() {

    }

}
abstract class Loan{
    abstract void load50k();
    abstract void loan30k();

    void loan1L(){
        System.out.println("1L loan is there");
    }
}


//Concrete class--a class does not have any method we call it as concrete classs
class Person{}
class Student1{}
class Student2{}
class Student3{}