package Buoi2;

import java.util.Scanner;

public class dienTichHinhChuNhat {
    //Viết chương trình tính diện tích hình chữ nhật.
    public static void main (String[] agrs){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào chiều dài hình chữ nhật: ");
        double chieudai = sc.nextDouble();
        System.out.println("Nhập vào chiều rộng hình chữ nhật: ");
        double chieurong = sc.nextDouble();

        // Tính diện tích
        double dientich = chieudai*chieurong;
        // In ra màn hình:
        System.out.println("Diện tích hình chữ nhật với chiều dài và chiều rộng bạn vừa nhập là: "+ dientich);
    }
}
