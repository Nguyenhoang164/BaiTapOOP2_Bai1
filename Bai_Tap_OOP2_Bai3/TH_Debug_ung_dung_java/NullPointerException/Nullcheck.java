package Bai_Tap_OOP2_Bai3.TH_Debug_ung_dung_java.NullPointerException;

public class Nullcheck {
    public static void main(String[] args) {
//        String s = null;
//        try {
//            if (s.equals("gfc")) {
//                System.out.println("Same");
//            }else{
//                System.out.println("not same ");
//                // khi chạy đọan mã trên , kết quả trả về not same do chuỗi kí tự s là ""
//            }
//        } catch (NullPointerException e){
//            System.out.println("NullPointerException catch ");
//        }
//        // sau khi sửa chuỗi kí tự s = null , kết quả trả về ở dưới hàm catch do s rơi vào trường hợp NullPointerException
        String s = null;
        try {
            if ("gfv".equals(s)) {
                System.out.println("Same");
            }else{
                System.out.println("not same ");
            }
        } catch (NullPointerException e){
            System.out.println("NullPointerException catch ");
        }
// sau khi chạy đoạn mã trên kết quả trả về = not same , do dữ kiện điều kiện bị thay đồi với đối tượng so sánh không còn là s mà là chuỗi kí tự "gfv"
    }
}
