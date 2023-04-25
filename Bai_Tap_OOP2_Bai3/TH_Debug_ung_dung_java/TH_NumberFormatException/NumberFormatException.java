package Bai_Tap_OOP2_Bai3.TH_Debug_ung_dung_java.TH_NumberFormatException;

import java.util.Scanner;

public class NumberFormatException {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Hay nhap x : ");
        int x = input.nextInt();
        System.out.println("Hay nhap y : ");
        int y = input.nextInt();
        caculate(x,y);

    }
    private static void caculate(int x , int y){
        try {
            int a = x+y ;
            int b = x - y;
            int c = x * y;
            int d = x/y;
            System.out.println("tong " + a);
            System.out.println("hieu " + b);
            System.out.println("tich " + c);
            System.out.println("thuong " + d);
        } catch (Exception e){    // không biết lỗi nào vã thẳng Exception
            System.out.println("xay ra ngoai le ");
        }
    }
}
