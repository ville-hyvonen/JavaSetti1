package org.example;

public class Teht9 {
    static String convertSeconds(int sec) {
        int hours = sec / 3600;
        int mins = (sec - hours * 3600) / 60;
        int secs = sec - hours * 3600 - mins * 60;

        String time = String.format("%02d:%02d:%02d", hours, mins, secs);
        return time;
    }
}
