package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner area_circle = new Scanner(System.in);

        double Pi = 3.14;
        double radius = area_circle.nextDouble();
        double area = Pi * (radius * radius);
        double length = 2 * Pi * radius;

        System.out.println("Площадь круга будет равна " + area + ", а длина окружности " + length);
    }
}