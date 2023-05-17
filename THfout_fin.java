import java.io.*;
import java.util.Scanner;

//tra loi cau hoi
// 1. cả hai lớp đều thuộc package java.io
// 2. lớp fout có 3 phương thức khởi tạo , lớp fin có 4 phương thức kởi tạo , thường sử dụng phương thức khởi tạo có tham số tên là file để khởi tạo
// 3.  4 yếu tố tạo nên phương thức read : đối tượng bufer để đọc , vị trí bắt đầu đọc dữ liệu , số lượng byte cần đọc và giá trị trả về là số lượng byte đã đọc được
// 4 yếu tố tạo nên phương thức write : đối tượng bufer để ghi dữ liệu , vị trí ghi dữ liệu trong byte , sô lượng byte cần ghi vào và giá trị sô lượng byte đã được ghi vào
// 4 yếu tố tạo nên phương thức close : phuoeng thức này không có tham số và không có giá trị trả về , đónng các luoofng vào ẩ của dữ liệu và xử lý dũ liệu và tiến hành giải phóng tài nguyên dữ lệu đó
//4.  phương thức read ném ra ngoại lệ IOexpection , xảy ra trong quá trình phát sinh lỗi khi đọc dữ liệu , sử dụng try catch để xử lý ngoại lệ này
//5. phương thức write ném ra ngạoi lệ IOexeptiom , xảy ra trong quá trình đẩy dữ liệu vào file , sử dụng try catch để xử lý ngoại lệ này
//6. phương thức khởi tạo ném ngoại lệ FileNotFoundExeption  , xảy ra trong quá trình chương trinh không thể tòm hấy file hoặc file không tồn tại , file trùng , sử dụng try catch để xử lý ngọai lệ hoặc dùng lệnh throws để ném ngoại lệ
public class THfout_fin {
    public static void main(String[] args) {
        File newFile = new File("person.dat");
        try{
            FileOutputStream fos = new FileOutputStream(newFile);
            System.out.println("nhập chuỗi ký tự : ");
            Scanner input = new Scanner(System.in);
            String sc = input.nextLine();
            fos.write(sc.getBytes());
            fos.close();
            //
            FileInputStream fin = new FileInputStream("person.dat");
            System.out.println("Dũ liệu trong file bạn cần là : ");
            DataInputStream dataInputStream = new DataInputStream(fin);
            byte [] data = new byte[dataInputStream.available()];
            int CanRead = dataInputStream.read(data);
            String str = new String(data,0,CanRead);
            System.out.println(str);
            dataInputStream.close();
        }catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }
}
