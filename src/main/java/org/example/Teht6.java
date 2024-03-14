package org.example;

public class Teht6 {
    static String testString = "Saippuakauppias";
    static String testString2 = "aivot avaavat ovia";
    static String testString3 = "Ville Hyvönen";
    static boolean CheckIfPalindrome(String input) {
        String temp = input.replaceAll("\\s+","").toLowerCase();
        int tempLength = temp.length();
        int fromBeginning = 0;
        int fromEnd = tempLength - 1;

        while (fromBeginning < fromEnd) {
            char char1 = temp.charAt(fromBeginning++);
            char char2 = temp.charAt(fromEnd--);

            if (char1 != char2) {
                return false;
            }
        }
        return true;
    }
}
