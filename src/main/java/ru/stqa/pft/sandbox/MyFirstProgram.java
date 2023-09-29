package ru.stqa.pft.sandbox;

public class MyFirstProgram {
    public static void main(String[] args) {
        hello("Volkov");

        double l = 5;
        System.out.println("Площадь квадрата = "+area(l));

        double a = 4;
        double b = 6;
        System.out.println("Площадь прямоугольника = "+area(a,b));

    }

    public static void hello(String s) {
        System.out.println("Hello " + s + " Wo");
    }

    public static double area (double len){
        return len*len;
    }

    public static double area (double a, double b){
        return a*b;
    }

}