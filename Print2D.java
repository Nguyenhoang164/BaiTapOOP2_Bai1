import java.util.Arrays;

public class Print2D {
    float x = 0.0f;
    float y = 0.0f;
     public Print2D(){

     }
     public Print2D(float x , float y){
         this.x = x;
         this.y = y;
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
         this.x = x;
         this.y = y ;
     }
     public float[] getXY(){
         float [] array ={x,y};
         return array;
     }
     public String toString(){
         return "the pixel " + Arrays.toString(getXY());
     }
}
class Print3D extends Print2D{
  float z = 0.0f;
   public Print3D(){
   }
   public Print3D(float x , float y , float z){
       super(x,y);
       this.z= z;
   }
   public float getZ(){
       return z;
   }
   public void setZ(float z){
       this.z=z;
   }
   public void setXYZ(float x, float y, float z){
       setX(x);
       setY(y);
       this.z = z ;
   }
   public float[] getXYZ(){
       float [] array = {x,y,z};
       return array;
    }
    @Override
    public String toString(){
       return "the pixel " + Arrays.toString(getXYZ()) +" is a subclass " + super.toString();
    }
}
class TestAll{
    public static void main(String[] args) {
        Print2D print2D = new Print2D(2.2f,2.11f);
        System.out.println(print2D);
        Print3D print3D = new Print3D(2.1f,4.5f,6.2f);
            System.out.println(print3D);
    }
}