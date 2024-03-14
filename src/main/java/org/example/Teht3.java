package org.example;

class Teht3 {
    static double calculateCircleArea(double r) {
        double circleArea = Math.PI * Math.pow(r, 2);
        //System.out.println(circleArea);
        return circleArea;
    }

    static double calculateSquareArea(double sivu) {
        double squareArea = sivu * sivu;
        //System.out.println(squareArea);
        return squareArea;
    }

    static double calculateTriangleArea(double a, double b) {
        double triangleArea = a * (b / 2);
        //System.out.println(triangleArea);
        return triangleArea;
    }
}
