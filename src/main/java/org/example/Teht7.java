package org.example;

public class Teht7 {
    static int calculateFibonacci(int n) {
        int current = 1;
        int previous = 0;
        for (int i = 1; i < n; i++) {
            int next = current + previous;
            previous = current;
            current = next;
        }
        return current;
    }
}
