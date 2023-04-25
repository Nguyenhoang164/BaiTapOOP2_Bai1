package Bai_Tap_OOP2_Bai3.TH_Debug_ung_dung_java.IllegalArgumentException;

public class CheckAvailable {
    public static void main(String[] args) {
        String s = "";
        try {
            System.out.println(getLength(s));
        } catch (IllegalArgumentException a){
            System.out.println("IllegalArgumentException catch");
        }
        s = "No one can find you " ;
        try {
            System.out.println(getLength(s));
        } catch (IllegalArgumentException a){
            System.out.println("IllegalArgumentException catch");
        }
        s = null;
        try {
            System.out.println(getLength(s));
        } catch (IllegalArgumentException a){
            System.out.println("IllegalArgumentException catch");
        }
    }
    public static int getLength(String s){
        // getLeghth dùng đê trả về độ dài của chuỗi kí tự s và đưa ra ngoại lệ nếu string s = null
      if (s == null){
          throw new IllegalArgumentException("S can not be null");
      }
      return s.length();
    }
}

