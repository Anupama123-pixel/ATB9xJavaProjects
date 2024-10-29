package Oct.ex_28102024;

public class Lab_String_Functions {
    public static void main(String[] args) {
        //SUBSTRING-helps to extract any bunch of charecters from the xisting string value.

        String anotherPalindrome = "Niagara. O roar again!";
        String roar = anotherPalindrome.substring(11, 15);
        System.out.println(roar);

        // CONCAT-helps to join two strings
        String s1 = "Pramod";
        String s2 = s1.concat("Dutta");
        System.out.println(s2);

        //SPLIT-.split helps to spli or devide existing string value into may parts using array
        String fruits = "apple,banana,cherry"; // delimter = ,
        String[] split_fruits = fruits.split(",");
        System.out.println(split_fruits[0]);
        System.out.println(split_fruits[1]);
        System.out.println(split_fruits[2]);

        String fruits2 = "ABC-XYZ-QWE"; // delimter = ,
        String[] split_fruits2 = fruits2.split("-");
        System.out.println(split_fruits2[0]);
        System.out.println(split_fruits2[1]);
        System.out.println(split_fruits2[2]);

        //charAT()- used to get the char by using it's index
        String s4 = "Pramod";
        System.out.println(s4.charAt(0));
        //System.out.println(s4.charAt(10)); //StringIndexOutOfBoundsException

        //trim()-Used to trim the space present in the string value.
        String s5 = " Pramod ";
        System.out.println(s5.trim());

        //indexOf()-Used to get index value of any char present in the string.
        String s6 = "Pramod";
        System.out.println(s6.indexOf("r"));
        System.out.println(s6.indexOf("d"));

        //contains-Assert conditn- to verify expected char present in the string or not.
        String s7 = "Pramod";
        System.out.println(s7.contains("ra"));
        System.out.println(s7.contains("zy"));

        //lastindexOf(letter)-when there many same characters present in the string vlaue and needs to get the index vlaue of that last char then we use this function.
        String s8 = "Pramoddutta";
        System.out.println(s8.lastIndexOf("d"));

        //replace(target,replacement)-we can replace any character string in the string using this function.
        String s9 = "Pramoddutta";
        System.out.println(s9.replace("d","z"));
        System.out.println(s9.replaceAll("d","z"));

        //strtswith()/endswith()-Assert function-to verify the given string value is as expected by first asking with bunch of characters whether present at the start or end.

        String s10 = "Pramodduttaji";
        System.out.println(s10.startsWith("Pra"));
        System.out.println(s10.endsWith("ji"));
        System.out.println(s10.endsWith("zy"));



        //replace(oldchar.newchar)-we can replace any single characters using this function.
        String original = "banana";
        String result1 = original.replace('a', 'o');
        System.out.println(result1);

        //replaceAll(regex"\\d+", replace:"-")-it helps to replace all the integer(\\d+)/chars into other char which will mention inside the function
        String original1 = "Hello123 World456!";
        String result2 = original1.replaceAll("\\d+", "-");
        System.out.println(result2);

        //replaceAll(regex:char, replacement:char)-helps to replace any char with another char(it will replace multiple same char if present)
        String result3 = original1.replaceAll("o", "O");
        System.out.println(result3);


    }
}
