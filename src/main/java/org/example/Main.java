package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {

        // Tehtävä 1
        Teht1.calculateDistance(0,0,0,3);

        // Tehtävä 2
        Teht2.printStars(5);

        // Tehtävä 3
        System.out.println(Teht3.calculateCircleArea(4.5));
        System.out.println(Teht3.calculateSquareArea(5));
        System.out.println(Teht3.calculateTriangleArea(2,5));

        // Tehtävä 4
        int[] maxValueIndex = Teht4.findMaxValueIndex(Teht4.testMatrix);
        System.out.println(Arrays.toString(maxValueIndex));

        // Tehtävä 5
        System.out.println("Old array: " + (Arrays.toString(Teht5.testArray)));
        System.out.println("Sorted array: " + (Arrays.toString(Teht5.orderAsc(Teht5.testArray))));

        // Tehtävä 6
        System.out.println(Teht6.CheckIfPalindrome(Teht6.testString));
        System.out.println(Teht6.CheckIfPalindrome(Teht6.testString2));
        System.out.println(Teht6.CheckIfPalindrome(Teht6.testString3));

        // Tehtävä 7
        System.out.println(Teht7.calculateFibonacci(4));

        // Tehtävä 8
        System.out.println(Teht8.getAlkuluvut(10));

        // Tehtävä 9
        System.out.println(Teht9.convertSeconds(3661));

        // Tehtävä 10
        HashMap<String, ArrayList<Integer>> numbers = Teht10.randomNumbers();
        System.out.println("Positive: " + numbers.get("positive"));
        System.out.println("Negative: " + numbers.get("negative"));
        System.out.println("Zero: " + numbers.get("zero"));
    }
}



