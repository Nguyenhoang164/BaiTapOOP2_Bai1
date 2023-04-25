package Bai_Tap_OOP2_Bai3.TH_Debug_ung_dung_java.TernaryOperator;

public class TernaryOperator {
    public static void main(String[] args) {
//        String str = null;
//        String message = (str == null) ? "" :
//                str.substring(0,5);
//        System.out.println(message);
//        // khi chạy mã lệnh trên không in ra kết quả do str để dạng null
//        str = "Geeksforgeeks";
//        message = (str == null) ? "" : str.substring(0,5);
//        System.out.println(message);
//        // sau khi chạy chương trình cho ra kết quả từ vị trí số 0 đến vị trí số 5 trong chuỗi kí tự str vì str để dạng chuỗi kí tự và đảm bảo điều kiện
        String str = null;
        System.out.println( (str == null) ? "" : str.substring(0,5));
        str = "abcdfghiklm";
        System.out.println((str == null) ? "" : str.substring(0,5));
    }
}
