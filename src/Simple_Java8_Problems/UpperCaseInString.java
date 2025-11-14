package Simple_Java8_Problems;

import java.util.stream.Collectors;

public class UpperCaseInString {
	public static void main(String[] args) {
        // find upper case in the String;
        String s = "antonyImm123anuelAkash";
        char[] c = s.toCharArray();
        String f = "";
        for (char e : c) {
            if (Character.isUpperCase(e)) {
                f += e;
            }
        }
        System.out.println(f);
        
        var name=s.chars().filter(Character::isUpperCase).mapToObj(Character::toString).collect(Collectors.joining());
        System.out.println(name);
        
        var count=s.chars().filter(Character::isDigit).map(Character::getNumericValue).sum();
        System.out.println(count);
    }
}
