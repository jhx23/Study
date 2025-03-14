package Mission.Middle;

// 추상 클래스와 인터페이스를 활용한 도형 프로그램 작성하기

abstract class Shape {
    abstract double calculateArea();
}

interface Measurable {
    double calculateArea();
}

class Circle extends Shape implements Measurable {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}

class Rectangle extends Shape implements Measurable {
    private double width, height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return width * height;
    }
}

class Triangle extends Shape implements Measurable {
    private double base, height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return 0.5 * base * height;
    }
}

public class M6 {
    public static void main(String[] args) {
        Shape circle = new Circle(5);
        Shape rectangle = new Rectangle(4, 6);
        Shape triangle = new Triangle(3, 7);

        System.out.println("원의 면적: " + circle.calculateArea());
        System.out.println("사각형의 면적: " + rectangle.calculateArea());
        System.out.println("삼각형의 면적: " + triangle.calculateArea());
    }
}