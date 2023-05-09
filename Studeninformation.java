import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;

class SinhVien {
    private String maSv;
    private String tenSv;
    private double diemToan;
    private double diemLy;
    private double diemHoa;

    public SinhVien(String maSv, String tenSv, double diemToan, double diemLy, double diemHoa) {
        this.maSv = maSv;
        this.tenSv = tenSv;
        this.diemToan = diemToan;
        this.diemLy = diemLy;
        this.diemHoa = diemHoa;
    }

    public String getMaSv() {
        return maSv;
    }

    public void setMaSv(String maSv) {
        this.maSv = maSv;
    }

    public String getTenSv() {
        return tenSv;
    }

    public void setTenSv(String tenSv) {
        this.tenSv = tenSv;
    }

    public double getDiemToan() {
        return diemToan;
    }

    public void setDiemToan(double diemToan) {
        this.diemToan = diemToan;
    }

    public double getDiemLy() {
        return diemLy;
    }

    public void setDiemLy(double diemLy) {
        this.diemLy = diemLy;
    }

    public double getDiemHoa() {
        return diemHoa;
    }

    public void setDiemHoa(double diemHoa) {
        this.diemHoa = diemHoa;
    }

    @Override
    public String toString() {
        return "SinhVien{" +
                "maSv='" + maSv + '\'' +
                ", tenSv='" + tenSv + '\'' +
                ", diemToan=" + diemToan +
                ", diemLy=" + diemLy +
                ", diemHoa=" + diemHoa +
                '}';
    }

    public boolean luuSinhVienVaoFile(SinhVien sv) {
        try {
               BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("LuuTruSinhVien.txt",true));
              bufferedWriter.write(sv.getMaSv() + "," + sv.getTenSv() + "," + sv.getDiemToan() + "," + sv.getDiemLy() + "," + sv.getDiemHoa() + "\n");
              bufferedWriter.close();
            return true;
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
    }


     public static void main(String[] args) {
         SinhVien sinhVien = new SinhVien("11111","nguyen van A " ,4.6,3.4,5.2);
         SinhVien sinhVien1 = new SinhVien("1112","nguyen B",4.5,6.5,6.7);
         System.out.println(sinhVien.luuSinhVienVaoFile(sinhVien));
         System.out.println(sinhVien1.luuSinhVienVaoFile(sinhVien1));
       try {
           FileReader fileReader = new FileReader("LuuTruSinhVien.txt");
           BufferedReader bufferedReader = new BufferedReader(fileReader);
           String line ;
           while ((line = bufferedReader.readLine()) != null){
               System.out.println(line);
           }
           bufferedReader.close();
       } catch (IOException e){
           e.getMessage();
       }

     }

}

