package org.example;

import java.util.Arrays;

public class Teht5 {
    static int[] testArray = {8, 3, 2, 7};
    static int[] orderAsc(int[] testArray) {
        int[] newArray = testArray.clone();
        Arrays.sort(newArray);
        return newArray;
    }
}
