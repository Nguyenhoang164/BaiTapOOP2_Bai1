package Bai_Tap_OOP2_Bai2.Thuc_Hanh_Animal.Bai_6_3;

interface Movable {
    void moveUp();
    void moveDown();
    void moveLeft();
    void moveRight();
}
class MovablePoint implements Movable{
    int x ;
    int y ;
    int xSpeed;
    int ySpeed;
     public MovablePoint(int x , int y , int xSpeed , int ySpeed ){
         this.x = x ;
         this.y = y;
         this.xSpeed = xSpeed;
         this.ySpeed = ySpeed;
     }
     @Override
    public String toString(){
         return "(x " + x + " , y " + y + ") speed ( x " + xSpeed + " y  " + ySpeed + ")" ;
     }
     @Override
    public void moveUp(){
         y -= ySpeed;
     }
     @Override
    public void moveDown(){
         y += ySpeed;
     }
     @Override
    public void moveLeft(){
         x -= xSpeed;
     }
     @Override
    public void moveRight(){
         x += xSpeed;
     }
}
// bai 6.4 kem bai 6.3
class MovableCircle extends MovablePoint implements Movable {
    private int radius;
    private MovablePoint center;
    public MovableCircle(int x , int y , int xSpeed , int ySpeed , int radius){
        super(x,y,xSpeed,ySpeed);
        center = new MovablePoint(x,y,xSpeed,ySpeed);
        this.radius = radius;
    }
    @Override
    public String toString(){
        return "( x " + x + " y " + y + ") speed (xSpeed " + xSpeed + " ySpeed " + ySpeed + ") radius " + radius;
    }
    @Override
    public void moveUp(){
        center.moveUp();
    }
    @Override
    public void moveDown(){
        center.moveDown();
    }
    @Override
    public void moveLeft(){
        center.moveLeft();
    }
    @Override
    public void moveRight(){
        center.moveRight();
    }
}
