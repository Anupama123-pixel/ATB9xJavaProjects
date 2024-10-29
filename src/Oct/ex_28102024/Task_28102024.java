package Oct.ex_28102024;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Task_28102024 {
    public static void main(String[] args) {
        //String functions
        //1.Length()
        //2.Touppercase()
        //3.ToLowercase()
        //4.Substring()
        //5.concat()
        //6.split()
        //7.charAT(index)
        //8.replace(oldchar.newchar)
        //10.replaceAll()
        //11.replaceAll(regex"\\d+", replace:"-")
        //12.replaceAll(regex:char, replacement:char)
        //13.startsWith("Pra")
        //14.endsWith("Pra")
        //15.indexOf(char)
        //16.trim()
        String s1 = " HelloWorld ";
        String trim= s1.trim();
        System.out.println(trim);//HelloWorld
        System.out.println(trim.toUpperCase());
        System.out.println(trim.toLowerCase());
        System.out.println(trim.substring(5));
        System.out.println(trim.substring(2,6));
        System.out.println(trim.subSequence(2,6));

        String s2 ="Pramod";
        String s3 = s1.concat(" Datta");
        System.out.println(s3);

        String s4 = "ji";
        String s5 = s3 + s4;

        //We can do split function for the string array.
        String fruits = "Apple,Banana,Grapes";
        String[] split_fruits = fruits.split(",");
        System.out.println(split_fruits[0]);
        System.out.println(split_fruits[1]);
        System.out.println(split_fruits[2]);

        String s6 = "Hi there!";
        System.out.println(s6.endsWith("ere!"));
        System.out.println(s6.startsWith("Hi"));
        System.out.println(s6.charAt(3));
        System.out.println(s6.replace("r","R"));
        System.out.println(s6.replaceAll("t","T"));
        System.out.println(s6.replaceFirst("H","h"));

        StringBuffer sb = new StringBuffer("Pramod");
        StringBuffer result = sb.reverse();
        System.out.println(result);

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string value");
        String sb1 = sc.next();

        StringBuffer sb2 = new StringBuffer(sb1);
        System.out.println(sb2.append("datta"));
    }
}
