public class Shape {
   private String color;
    private boolean filled ;
    public Shape(){
        this.color = "green";
        this.filled = true;
    }
    public Shape(String color , boolean filled){
        this.color = color;
        this.filled = filled;
    }
    public void setColor(String color){
        this.color = color;
    }
    public void setFilled(boolean filled){
        this.filled = filled;
    }
    public String getColor(){
        return color;
    }
    public boolean isFilled(){
        return filled;
    }
    @Override
    public String toString() {
        return "A shape with " + getColor() +" and "+ (isFilled() ? " filled " : "not filled");
    }


}
 class Rectangle extends Shape {
     private double width ;
     private double height;
    public Rectangle(){
        this.width = 1.0;
        this.height = 1.0;
    }
     public Rectangle(double width, double length) {
         this.width = width;
         this.height = length;
     }
     public Rectangle(double width, double length, String color, boolean filled) {
        super(color,filled);
         this.width = width;
         this.height = length;
     }
    public double getWidth(){
        return width;
    }
    public double getHeight(){
        return height;
    }
    public void setWidth(double width){
        this.width = width;
    }
    public void setHeight(double height){
        this.height = height;
    }
    @Override
    public String toString(){
        return "A rectangle with " + getWidth() + " and " + getHeight() + " is a subclass " + super.toString();
    }
}
class ShapeTest {
    public static void main(String[] args) {
         Shape shape = new Shape();
        System.out.println(shape);

        Shape shape1 = new Shape("red" , false);
        System.out.println(shape1);

    }
}
class RectangleTest {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        System.out.println(rectangle);
        Rectangle rectangle1 = new Rectangle(2.5,2.1);
        System.out.println(rectangle1);
        Rectangle rectangle2 = new Rectangle(2.5, 3.8,"red",true);
        System.out.println(rectangle2);
    }
}
 class Square extends Rectangle {
    public Square() {
    }

    public Square(double side) {
        super(side, side);
    }

    public Square(double side, String color, boolean filled) {
        super(side, side, color, filled);
    }

    public double getSide() {
        return getWidth();
    }

    public void setSide(double side) {
        setWidth(side);
        setHeight(side);
    }

    @Override
    public void setWidth(double width) {
        setSide(width);
    }

    @Override
    public void setHeight(double length) {
        setSide(length);
    }

    @Override
    public String toString() {
        return "A Square with side="
                + getSide()
                + ", which is a subclass of "
                + super.toString();
    }
}
class SquareTest {
    public static void main(String[] args) {
        Square square = new Square();
        System.out.println(square);

        square = new Square(2.3);
        System.out.println(square);

        square = new Square(5.8, "yellow", true);
        System.out.println(square);
    }
}
