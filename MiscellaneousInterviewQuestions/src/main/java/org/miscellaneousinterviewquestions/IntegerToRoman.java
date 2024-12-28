package org.miscellaneousinterviewquestions;

public class IntegerToRoman {

    public static String intToRoman(int num) {

        // Define arrays for Roman numerals and their corresponding integer values
        int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] symbols = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

        // StringBuilder to store the resulting Roman numeral
        StringBuilder roman = new StringBuilder();

        // Loop through each value-symbol pair
        for (int i = 0; i < values.length; i++) {
            // Append the symbol to the result while the number is greater than or equal to the value
            while (num >= values[i]) {
                roman.append(symbols[i]);
                num -= values[i];
            }
        }

        return roman.toString();
    }

    public static void main(String[] args) {
        // Example usage
        int number = 1994;
        String romanNumeral = intToRoman(number);
        System.out.println("The Roman numeral for " + number + " is " + romanNumeral);
    }

}
