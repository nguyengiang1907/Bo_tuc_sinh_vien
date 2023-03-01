package Bo_Tuc_Sinh_Vien_T7;

import java.util.Scanner;

public class Bai_Tap_1 {
    public static void main(String[] args) {
        int[] number;
        int size = 10;
        int sum = 0;
        int tich = 0;


        Scanner sc = new Scanner(System.in);
        number = new int[size];


        for (int i = 0; i < number.length; i++) {
            System.out.println("Nhập phần tử vị trí số " + (i) + " Trong mảng là ");
            number[i] = sc.nextInt();

        }
        for (int j = 0; j < size; j++) {
            System.out.println(" Các phần tử trong mảng lần lượt là : " + number[j]);

        }

//        Bài Tập 2
//        Tinhtongsole(number, sum);
        Tinhsole1379(number, sum);
        Tinhtich(number, tich);

    }
//    public static void Tinhtongsole ( int number [ ], int sum  ){
//
//
//        for (int i = 1; i <number.length  ; i++) {
//          if (number [i] % 2 ==0){
//              sum+= number[i];
//          }
//
//        }
//        System.out.println("Tổng các phần tử ở vị trí 1 3 5 7 9 là : " + sum);
//    }

    //    Bài tập 3
    public static void Tinhsole1379(int number[], int sum) {
        for (int i = 1; i < number.length; i++) {

            if (number[i] % 2 == 0) {
                if (number[5] > 0) {
                    continue;
                }

            }
            sum += number[i];

        }
        System.out.println("Tổng các phần tử ở vị trí 1 3 7 9 là :" + sum);

    }

//    BÀI 4

    public static void Tinhtich(int number[], int tich) {

        for (int i = 1; i < number.length; i++) {

            if (number[i] % 2 == 0) {
                if (number[1] > 0 || number[3] > 0 || number[4] > 0 || number[5] > 0 || number[6] > 0 || number[7] > 0 || number[8] > 0) {
                    continue;
                }

            }
            tich += number[i];

        }
        System.out.println("Tích của phần tử 2 4 9  :" + tich);

    }
}