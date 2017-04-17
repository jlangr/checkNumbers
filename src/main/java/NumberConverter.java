public class NumberConverter {
    static String[] upToTwenty = {"", "one", "two", "three", "four", "five", "six",
            "seven", "eight", "nine", "ten", "eleven",
            "twelve", "thirteen", "fourteen", "fifteen",
            "sixteen", "seventeen", "eighteen", "nineteen",
    };
    static String[] tensDigits = {"", "ten", "twenty", "thirty", "forty",
            "fifty", "sixty", "seventy", "eighty", "ninety"};

    public static String toWords(int number) {
        if (number == 0) return "zero";

        StringBuilder convert = new StringBuilder();
        toWords(convert, number);
        return convert.toString();
    }

    private static void toWords(StringBuilder convert, int number) {
        number = appendLevel(convert, number, 1000000, "million");
        number = appendLevel(convert, number, 1000, "thousand");
        number = appendLevel(convert, number, 100, "hundred");
        if (number > 0) {
            number = appendTens(convert, number);
            convert.append(upToTwenty[number]);
        }
    }

    private static int appendLevel(StringBuilder convert, int number, int level, String levelName) {
        if (number / level > 0) {
            convert.append(toWords(number / level) + " " + levelName);
            number %= level;
            if (number > 0) convert.append(" ");
        }
        return number;
    }

    private static int appendTens(StringBuilder convert, int number) {
        if (number >= 20) {
            convert.append(tensDigits[number / 10]);
            number %= 10;
            if (number > 0) convert.append("-");
        }
        return number;
    }
}
