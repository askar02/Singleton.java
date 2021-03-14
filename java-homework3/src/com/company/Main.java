package com.company;

public class Main {
    public static void main(String[] args) {

        Shape<Integer> shape=new Shape<>("blue",false);
        System.out.println(shape.toString());

        Circle circle=new Circle(5);
        System.out.print("Circle: ");
        System.out.println(circle);

        System.out.print("Circle area: ");
        System.out.println(circle.getArea());

        System.out.print("Circle perimeter: ");
        System.out.println(circle.getPerimeter());

        System.out.println();

        Rectangle rectangle=new Rectangle(3.0,4.0);
        System.out.print("Rectangle: ");
        System.out.println(rectangle);

        System.out.print("Rectangle area: ");
        System.out.println(rectangle.getArea());

        System.out.print("Rectangle perimeter: ");
        System.out.println(rectangle.getPerimeter());

        System.out.println();

        Square square=new Square();
        System.out.print("Square: ");
        System.out.println(square);

        System.out.print("Square area: ");
        System.out.println(square.getArea());

        System.out.print("Square perimeter: ");
        System.out.println(square.getPerimeter());
    }
}
