package ru.stqa.pft.sandbox;

public class myfirstprogram {
    public static void main(String[] args) {
        hello("world");
        hello("гандоны");
        Square s = new Square(5);
        Rectnagle r = new Rectnagle(4,6);

        double l =5;
        System.out.println("площадь квадрата "+s.l+"="+s.area());
        double a=4;
        double b=6;
        System.out.println("площадь прямоугольник"+r.a+"и"+r.b+"="+r.area());

    }
    public static void hello(String somebody) {
        System.out.println("hello "+ somebody);

    }


}