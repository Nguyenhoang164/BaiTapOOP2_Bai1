package Bai_Tap_OOP2_Bai2.Thuc_Hanh_Animal.Bai_6_1;

public abstract class Shape {
    protected String color = "red";
    protected boolean filled = true;

    public Shape() {

    }

    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public abstract double getArea();

    public abstract double getPerimeter();

    public String toString() {
        return "Shape [ color : " + getColor() + ", filled = " + isFilled() + "]";
    }
}

class Circle extends Shape {
    protected double radius = 1.0;

    public Circle() {
        super();
    }

    public Circle(double radius) {
        super();
        this.radius = radius;
    }

    public Circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return (this.radius * 2) * 3.14;
    }

    @Override
    public double getPerimeter() {
        return (this.radius * this.radius) * 3.14;
    }

    @Override
    public String toString() {
        return "Circle [ color : " + getColor() + ", filled : " + isFilled() + ", radius : " + getRadius() + "]";
    }
}

class Rectangle extends Shape {
    protected double width = 1.0;
    protected double length = 1.0;

    public Rectangle() {
        super();

    }

    public Rectangle(double width, double length) {
        super();
        this.width = width;
        this.length = length;
    }

    public Rectangle(double width, double length, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public double getArea() {
        return (this.width + this.length) * 2;
    }

    @Override
    public double getPerimeter() {
        return this.length * this.width;
    }

    @Override
    public String toString() {
        return "Rectangle [ Shape [ color : " + getColor() + ", filled : " + isFilled() + "] " + " width : " + getWidth() + " height " + getLength() + "]";
    }
}

class Square extends Rectangle {
    protected double side;

    public Square() {
        super();
    }

    public Square(double side) {
        this.side = side;
    }

    public Square(double side, String color, boolean filled) {
        setColor(color);
        setFilled(filled);
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public void setWidth(double side) {
        this.width = side;
    }

    @Override
    public void setLength(double side) {
        this.length = side;
    }

    @Override
    public String toString() {
        return "Square [ Rectangle [ Shape [ color : " + getColor() + ", filled : " + isFilled() + "], width " + getWidth() + ", length " + getLength() + "]]";
    }
}

class Test {
    public static void main(String[] args) {
        Circle circle = new Circle(2.3, "red", true);
        Rectangle rectangle = new Rectangle(4.6, 3.2, "blue", false);
        Square square = new Square(6.2);
        System.out.println(circle);
        System.out.println(rectangle);
        System.out.println(square);
    }
}