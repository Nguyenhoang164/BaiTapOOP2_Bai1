package Bai_Tap_OOP2_Bai1;

public abstract class Mobile {
   public void downloadApp(){}
}
class Iphone extends Mobile {
    @Override
    public void downloadApp(){
        System.out.println("download app in apple store");
    }
}
class Nokia extends Mobile{
    @Override
    public void downloadApp(){
        System.out.println("download app in CH Play  ");
    }
}
 class TestPhone{
    public static void main(String[] args) {
      Iphone iphone = new Iphone();
      Nokia nokia = new Nokia();
        iphone.downloadApp();
        nokia.downloadApp();
    }
}