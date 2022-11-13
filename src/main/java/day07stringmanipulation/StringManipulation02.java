package day07stringmanipulation;

public class StringManipulation02 {

    public static void main(String[] args) {

      String str = "Java is OOP";

      String result1 = str.replace('O','*');
        System.out.println(result1);//Java is **P

      String result2 = str.replace("Java", "*");
        System.out.println(result2);//* is OOP

     String st = "Ali is 13 years old, I think he seems 15.";

        //Example 1: Change all digits to "*" in the given String

        String result3 = st.replace('0','*').
                replace('1','*').
                replace('2','*').
                replace('3','*').
                replace('4','*').
                replace('5','*').
                replace('6','*').
                replace('7','*').
                replace('8','*').
                replace('9','*');
        System.out.println(result3);//Ali is ** years old, I think he seems **.


        //Note: If your code does not work for all values, it is called "Hard Coding"
        // and "Hard Coding" cannot be accepted


        //2

        String result4 = st.replaceAll("[0-9]","*");
        System.out.println(result4);//Ali is ** years old, I think he seems **.

        /*Regex is an abbreviation of "Regular Expressions"
        Regex represent a group of data
        Regex for all digits:[0-9]
        Regex for all uppercase: [A-Z]
        Regex for all lowercase: [a-z]
        Regex for all uppercase and lowercase: [a-zA-Z]
        Regex for all uppercase and lowercase letters and digits: [a-zA-Z0-9]
        some multiple characters like a, e, i, o, u:[aeiou]
        All characters different from vowels:[^aeiou]

        All characters different from digits:[^0-9]
        All characters different from letters:[^a-zA-Z]
        Space character: \\s
        All characters different from space character: \\S

        All digits: \\d
        All characters different from digits: \\D

        All uppercase, lowercase letters and digits and _: \\w
        Different from All uppercase, lowercase letters and digits and _: \\W

        All punctuation marks: \\p{Punct}

         */


        String pwd = "a1 !2   s def ";
        //Password must have at least 8 characters different from space character
        boolean firstRule = pwd.replaceAll("\\s", "").length()>7;
        //Password must have at least 1 symbol
        //boolean secondRule = pwd.replaceAll("\\s", "").replaceAll("[a-zA-Z0-9]","").length()>0;
        //Following can be used to remove space as well but it is difficult to notice space was removed, because of that above is better to use
        boolean secondRule = pwd.replaceAll("[a-zA-Z0-9 ]","").length()>0;
        System.out.println("Is the password valid? " + (firstRule && secondRule));

    }
}
