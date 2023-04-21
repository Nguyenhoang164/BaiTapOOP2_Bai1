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
       float [] array = new float[3];
       array[0] = getX();
       array[1] = getY();
       array[2] = getZ();
       return array;
    }
    @Override
    public String toString(){
       return "the pixel " + Arrays.toString(getXYZ()) +" is a subclass " + super.toString();
    }
}
class TestAll{
    public static void main(String[] args) {
        Print2D print2D = new Print2D();
        System.out.println(print2D);
        Print3D print3D = new Print3D(7.6f,4.5f,4.6f);
            System.out.println(print3D);
    }
}