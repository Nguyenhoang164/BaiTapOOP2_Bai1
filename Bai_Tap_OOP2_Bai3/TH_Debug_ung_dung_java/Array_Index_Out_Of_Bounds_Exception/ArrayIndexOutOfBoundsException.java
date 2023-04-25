package Bai_Tap_OOP2_Bai3.TH_Debug_ung_dung_java.Array_Index_Out_Of_Bounds_Exception;

import java.util.Random;
import java.util.Scanner;

public class ArrayIndexOutOfBoundsException {
    public static int[] createRandom() {
        Random r = new Random();
        int[] random = new int[100];
        for (int i = 0; i < random.length; i++) {
            random[i] = r.nextInt();
            System.out.println("arr a " + i + " : " + random[i]);
        }
        return random;
    }

    public static void main(String[] args) {
        int[] arr = createRandom();
        Scanner input = new Scanner(System.in);
        System.out.println("vui long nhap chi so  phan tu bat ki : ");
        int x = input.nextInt();
        try {
            System.out.println("chi so cua x " + arr[x]);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("qua gioi han ");
        }

    }
}
