package Buoi2;

import java.util.Scanner;

class congHaiSo {
    public static void main(String[] args) {
        // Bạn hãy viết chương trình cộng hai số được nhập từ bàn phím người dùng, thực hiện phép tính cộng và hiển thị ra màn hình.
        // Khai báo bến số là num1 và num 2, và tổng 2 số là sum;
        // Cộng hai số nguyên; Và bài tập về nhà cho các ban là cộng 2 số kha số nguyên.
        int num1, num2, sum;
        // Khai báo scanner để nhập từ bàn phím vào:
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào số thứ nhất: ");
        num1 = sc.nextInt();

        System.out.println("Nhập vào số thứ hai: ");
        num2 = sc.nextInt();

        //Đóng lại đối tượng scanner:
        sc.close();

        //Tính tổng sum = num 1+ num2;
        sum= num1+num2;

        //In kết quả ra màn hình
        System.out.println("Tồng của 2 số là: "+ sum);
    }
}