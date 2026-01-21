package String;


public class AthenaRommannumbers {
    public static void main(String[] args) {
        String roman = "XV";
        try {
            int value = romanToInt(roman);
            System.out.println(value);
        } catch (IllegalArgumentException e) {
            System.err.println(e.getMessage());
        }
    }

    private static int romanToInt( String s) {
        if (s == null || s.isEmpty()) throw new IllegalArgumentException("Empty roman string");
        int total = 0;
        int prev = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            int val = romanCharValue(s.charAt(i));
            if (val < prev) total -= val;
            else total += val;
            prev = val;
        }
        return total;
    }

    private static int romanCharValue(char c) {
        switch (c) {
            case 'I': return 1;
            case 'V': return 5;
            case 'X': return 10;
            case 'L': return 50;
            case 'C': return 100;
            case 'D': return 500;
            case 'M': return 1000;
            default: throw new IllegalArgumentException("Invalid roman character: " + c);
        }
    }
}