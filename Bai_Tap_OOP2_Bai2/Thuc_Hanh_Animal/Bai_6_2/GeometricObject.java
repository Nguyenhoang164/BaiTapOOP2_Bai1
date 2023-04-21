package Bai_Tap_OOP2_Bai2.Thuc_Hanh_Animal.Bai_6_2;

interface GeometricObject {
    double getArea();
    double getPerimeter();

}
class Circle implements GeometricObject{
    private double radius;
    public Circle(double radius){
        this.radius = radius;
    }
    public double getRadius(){
        return radius;
    }
    public void setRadius(double radius){
        this.radius = radius;
    }
    public String toString(){
        return "Circle [ radius  " + getRadius() + "]";
    }
    @Override
    public double getArea(){
        return (this.radius * 2) * 3.14 ;
    }
    @Override
    public double getPerimeter(){
        return (this.radius * this.radius ) * 3.14;
    }
}
class Rectangle implements GeometricObject{
    private double width ;
    private double length;
     public Rectangle(double width , double length){
         this.width = width;
         this.length = length;
     }
     public void setWidth(double width){
         this.width = width;
     }
     public double getWidth(){
         return width;
     }
     public void setLength(double length){
         this.length = length;
     }
     public double getLength(){
         return length;
     }
     @Override
    public String toString(){
         return "Rectangle [ width " + getWidth() + ", length " + getLength() + "]";
     }
     @Override
    public double getArea(){
         return (this.width + this.length) * 2;
     }
     @Override
    public double getPerimeter(){
         return this.width*this.length;
     }
}
class Test6_2{
    public static void main(String[] args) {
        Circle circle = new Circle(2.3);
        Rectangle rectangle = new Rectangle(4.5,3.4);
        System.out.println(circle);
        System.out.println(rectangle);
    }
}
