package org.example;

class Teht1 {

    static double calculateDistance(double x1, double y1, double x2, double y2) {
        double dist = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        System.out.println(dist);
        return dist;
    }
}
