package Bai_Tap_OOP2_Bai3.TH_Debug_ung_dung_java.BT_KtraLoiTamgiac;

import java.util.Scanner;

public class Tamgiac {
    public static void main(String[] args) {
        TriangleEdgesCheck check = new TriangleEdgesCheck();
        Scanner input = new Scanner(System.in);
        try {
            System.out.println("nhap canh 1 ");
            int a = input.nextInt();
            System.out.println("nhap canh 2 ");
            int b = input.nextInt();
            System.out.println("nhap canh 3 ");
            int c = input.nextInt();
            try {
                check.CheckTriangleEdgesException(a, b, c);
            } catch (TriangleEdgesException e) {
                System.out.println(e.getMessage());
            }
        } catch (Exception e) {
            System.out.println("loi");
        }

    }
}

class TriangleEdgesException extends Exception {
    public TriangleEdgesException(String error) {
        super(error);
    }
}

class TriangleEdgesCheck {
    public void CheckTriangleEdgesException(int a, int b, int c) throws TriangleEdgesException {
        if (a + b <= c || a + c <= b || b + c <= a) {
            throw new TriangleEdgesException("Loi khong hop le");
        } else {
            System.out.println("Hop le");
        }
    }

}
