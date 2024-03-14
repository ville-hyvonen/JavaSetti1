package org.example;

import java.util.ArrayList;

public class Teht8 {
    static ArrayList<Integer> getAlkuluvut(int x) {
        ArrayList<Integer> Alkuluvut = new ArrayList<>();
        int start = (int) Math.ceil(x/2.0);

        for (int num = start; num <= x; num++) {
            if (isAlkuluku(num)) {
                Alkuluvut.add(num);
            }
        }
        return Alkuluvut;
    }

    static boolean isAlkuluku(int num) {
        if (num <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(num) ; i++) {
            if (num % i == 0) {
                return false;
            }
        }

        return true;
    }
}