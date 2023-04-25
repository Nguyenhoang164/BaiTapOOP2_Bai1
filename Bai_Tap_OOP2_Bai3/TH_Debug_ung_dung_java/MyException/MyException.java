package Bai_Tap_OOP2_Bai3.TH_Debug_ung_dung_java.MyException;

public class MyException extends Exception {
    public MyException(String s){
        super(s);
    }
}
class Main{
    public static void main(String[] args) {
        try {
            throw new MyException("geckkkk");
        }catch (MyException ex){
            System.out.println("Caught");
            System.out.println(ex.getMessage());
        }
    }
}
// đoạn mã trên gồm có 2 lớp
// lớp MyException dùng để kế thừa ngoại lệ và thực hiện nhiệm vụ in ra dòng lệnh s khi rơi vào trường hợp ngoại lệ
//lớp main dùng để triển khai chương trình và chứa ngoại lệ
//sua khi thực thi chương trình cho ra  kết quả in ra cả hai lệnh thực thi dưới catch do trong try chứ lệnh throw in ra kí tự trong String vào in ra màn hifnh các lệnh ở dưới catch
