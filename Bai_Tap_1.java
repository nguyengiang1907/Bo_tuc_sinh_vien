package Bo_Tuc_Sinh_Vien_T5;

import java.util.Scanner;

public class Bai_Tap_1 {
    public static void main(String[] args) {
        int number [] = {1,2,34,4,54,63,7,85,96,10};
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập tìm phần tử trong mảng :");
        int nhap = sc.nextInt();
        if (nhap > 100 ){
            System.out.println("Số bạn nhập lớn hơn 100");
        }
        Kiemtra(number , nhap);


    }
    public static boolean Kiemtra (int number [] , int nhap) {
        boolean tong = false;


        for (int i = 0; i < number.length; i++) {
           if (number[i] == nhap){
               tong = true;
               break;
           }

        }

        if (tong = true){
            System.out.println("Phần tử tồn tại trong mảng ");
        } else {
            System.out.println("Phần tử không tồn tại ");
        }
        return  tong;

    }
}


