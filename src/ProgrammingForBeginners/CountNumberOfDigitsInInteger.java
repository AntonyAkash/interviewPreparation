package ProgrammingForBeginners;

public class CountNumberOfDigitsInInteger {
    public static void main(String[] args) {
        int n = 1234523;
        int c = 0;

        while (n > 0) {
            n = n / 10;
            c++;
        }

        System.out.println(c);
        System.out.println(String.valueOf(1234523).length());
        System.out.println("abcd123".chars().filter(Character::isDigit).map(Character::getNumericValue).sum());
    }
}
