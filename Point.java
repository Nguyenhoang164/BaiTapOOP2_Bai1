import java.util.Arrays;

public class Point {
    private float x = 0.0f;
    private float y = 0.0f;
    public Point(float x , float y){
        this.x=x;
        this.y=y;
    }
    public Point(){

    }
    public float getX(){
        return x;
    }
    public float getY(){
        return y;
    }
    public void setX(float x){
        this.x = x ;
    }
    public void setY(float y){
        this.y = y ;
    }
    public void setXY(float x , float y){
     this.y = y;
     this.x = x ;
    }
    public float[] getXY(){
        float [] array = {x,y};
        return array;
    }
    public String toString (){
        return "Array " + Arrays.toString(getXY());
    }

}
class MovePoint extends Point{
    private float xSpeed = 0.0f;
    private float ySpeed = 0.0f;
     public MovePoint(float x , float y , float xSpeed , float ySpeed ){
         super(x,y);
         this.xSpeed = xSpeed;
         this.ySpeed = ySpeed;
     }
     public MovePoint(float xSpeed , float ySpeed){
         super();
         this.xSpeed = xSpeed;
         this.ySpeed = ySpeed;
     }
     public MovePoint(){
         super();
     }
     public float getxSpeed(){
         return xSpeed;
    }
    public float getySpeed(){
         return ySpeed;
    }
    public void setxSpeed(float xSpeed) {
         this.xSpeed = xSpeed;
    }
    public void setySpeed(float ySpeed){
         this.ySpeed = ySpeed;
    }
    public void setSpeed (float xSpeed , float ySpeed){
      this.xSpeed = xSpeed;
      this.ySpeed = ySpeed;
    }
    public float[] getSpeed(){
         float [] speed = {xSpeed,ySpeed};
         return speed;
    }
    @Override
    public String toString() {
         return "x and y  is : " + Arrays.toString(getXY()) + " and Speed " + Arrays.toString(getSpeed()) + " is A SUBCLASS " + super.toString();
    }
    public MovePoint move(){
         xSpeed += getX();
         ySpeed += getY();
       return this;
    }
}
class test{
    public static void main(String[] args) {

        MovePoint movePoint = new MovePoint(2.3f,2.4f);
        System.out.println(movePoint);
        movePoint = new MovePoint(1.1f,1.2f,2.1f,3.4f);
        System.out.println(movePoint);
        System.out.println(movePoint.move());
        }
}

