package Oct.ex_25102024;

public class lab_Srting_SOP {
    public static void main(String[] args) {
        String str1 =new String("Hello");
        String str2 =new String("Hello");
        String str3 =new String("hello");
        //Even though the stored values same, it will create two valyes such that both the reference variablea points to different values .
        System.out.println(str1=str2);
        //Comparison operator compares the string values
        //Equals operator compares the string assigned values
        System.out.println(str1.equals(str2));
        System.out.println(str1.equals(str3));
        System.out.println(str1.equalsIgnoreCase(str3));
        System.out.println(str1.equalsIgnoreCase(str3));
    }
}
