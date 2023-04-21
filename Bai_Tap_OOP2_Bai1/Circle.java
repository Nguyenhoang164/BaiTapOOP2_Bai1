public class Circle {
    double radius ;
    String color;
    public Circle(double radius, String color){
        this.radius = radius;
        this.color= color;
    }
    public double getRadius(){
        return radius;
    }
    public String getColor(){
        return color;
    }
    public void setColor(String color){
        this.color = color;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getArea(){
        return radius*radius*3.14;
    }
    public String Info(){
        return " class Circle had " + getArea() + " with " + getRadius() + " and " + getColor();
    }
}
class Cylinder extends Circle{
     double height;
     public Cylinder(double height , double radius , String color){
         super(radius,color);
         this.height = height;
     }
    @Override
    public double getArea(){
         return 2*3.14*radius*this.height;
     }
    public double getRadius(){
        return radius;
    }
    public String getColor(){
        return color;
    }
    public void setColor(String color){
        this.color = color;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }

     public double getV(){
         return 3.14*radius*radius*height;
     }
    @Override
    public String Info(){
        return " class Cylinder had " + getRadius() + " with " + getColor() + " have " + getArea() + " and " + getV() + " from " + super.Info();
    }

}
class Display{
    public static void main(String[] args) {
        Circle circle = new Circle(2.1,"Red");
        System.out.println(circle.Info());
        Cylinder cylinder = new Cylinder(2.5,3.1,"Blue");
        System.out.println(cylinder.Info());
    }


}