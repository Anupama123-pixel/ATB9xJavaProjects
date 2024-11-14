package Nov.ex_12112024_Superkeyword_Abstraction;

public class Interface_P1 {
}
//ABSTRCT CLASSES CAN HAVE THE COMPLETE FUCTIONS ideally BUT INTERFACE CANNOT HAVE COMPLETE FUNCTIONS
//ABSTRACT CANNOT BE FINAL, STATIC OR PRIVATE, BUT INTERFACE CAN BE STATIC, FINAL OR PRIVATE.

abstract class ABC{
    abstract void m1();
     void m2(){
         System.out.println("Complete Method!");
     }

     interface I{
         void m1();
         void m2();

         static void m3(){
             System.out.println("Static method recently added this feature");
         }
         default void m4(){
             System.out.println("Default method recently added this feature");
         }
     }
}