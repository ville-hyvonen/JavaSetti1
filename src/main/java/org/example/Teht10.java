package org.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

public class Teht10 {

    static HashMap<String, ArrayList<Integer>> randomNumbers() {
        HashMap<String, ArrayList<Integer>> result = new HashMap<>();
        ArrayList<Integer> neg = new ArrayList<>();
        ArrayList<Integer> pos = new ArrayList<>();
        ArrayList<Integer> zero = new ArrayList<>();

        Random rand = new Random();
        for (int i = 0; i < 100; i++) {
            int randNum = rand.nextInt(101) - 50;

            if (randNum < 0) {
                neg.add(randNum);
            } else if (randNum > 0) {
                pos.add(randNum);
            } else {
                zero.add(randNum);
            }
        }

        result.put("negative", neg);
        result.put("positive", pos);
        result.put("zero", zero);

        return result;
    }
}
