package Nov.ex_12112024_Superkeyword_Abstraction;

public class Lab_158 {
     public static void main(String[] args) {
          child c = new child();
          c.Loan50k();
          c.loan25k();

     }


}
class child extends Father{

     @Override
     void Loan50k() {
          System.out.println("child is giving 50k loan");
     }
}
abstract class Father{
     abstract void Loan50k();
     void loan25k(){
          System.out.println("Done by father");
     }
}

