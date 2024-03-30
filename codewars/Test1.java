/*
Complete the method/function so that it converts dash/underscore delimited words into camel casing. The first word within the output should be capitalized only if the original word was capitalized (known as Upper Camel Case, also often referred to as Pascal case). The next words should be always capitalized.

Examples
"the-stealth-warrior" gets converted to "theStealthWarrior"

"The_Stealth_Warrior" gets converted to "TheStealthWarrior"

"The_Stealth-Warrior" gets converted to "TheStealthWarrior"
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Test1 {

    static String toCamelCase(String s){
        String[] strSplit = s.split(""); 
        String result =  "";

         for (int i = 0; i < Arrays.asList(strSplit).size(); i++) {
            String value = Arrays.asList(strSplit).get(i);
      
            if(value.equals("-") || value.equals("_")){
                continue ;
            }else{
                result += value;
            }
        }

        return result.toString();
      }

    public static void main(String[] args) {
        System.out.println(toCamelCase("the-stealth-warrior"));
        System.out.println(toCamelCase("The_Stealth_Warrior"));
        System.out.println(toCamelCase("The_Stealth-Warrior"));
    }
}
