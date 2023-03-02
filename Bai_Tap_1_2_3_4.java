package Bo_Tuc_Sinh_Vien_T7;

import java.util.Scanner;

public class Bai_Tap_1_2_3_4 {
    public static void main(String[] args) {
        int[] number = new int[10];
        Scanner sc = new Scanner(System.in);



        for (int i = 0; i < number.length; i++) {
            System.out.println("Nhập phần tử vị trí số " + (i + 1) + " Trong mảng là ");
            number[i] = sc.nextInt();

        }
        for (int j = 0; j <number.length; j++) {
            System.out.println(" Các phần tử trong mảng : " + number[j]);

        }

//        Bài Tập 2
        Tinhtongsole(number);
        Tinhsole1379(number);
        Tinhtich(number);

    }
    public static void Tinhtongsole ( int number []  ){

        int sum = 0;
//cách 1
//        for (int i = 0; i <number.length  ; i++) {
//          if (i % 2 ==0){
//              sum+= number[i];
//          }
//        }
//        System.out.println("Tổng các phần tử ở vị trí 1 3 5 7 9 là : " + sum);


//        cách 2
        for (int i = 0; i <number.length ; i++) {
            if (number[i] == 1 || number[i] == 3 || number[i] == 5 || number[i] == 7 || number[i] ==9 ){
                sum += number[i];
            }

        }
        System.out.println(" Tổng các phần tử 1 3 5 7 9 là ------ "+sum);
    }

    //    Bài tập 3
    public static void Tinhsole1379(int number[] ) {

        int sum = 0;
        for (int i = 0; i < number.length; i++) {

            if (number[i] % 2 == 1) {
                if (i % 2 == 0 ) {
                    if (i == 4) {
                        continue;
                    }
                }
                sum+=number[i];
            }
        }
        System.out.println("Tổng các phần tử  1 3 7 9 là :" + sum);
    }

//    BÀI 4

    public static void Tinhtich(int number[]) {

         int tich = 1;
        for (int i = 0; i < number.length; i++) {
                if (number[i] == 2 || number[i] == 4 ||  number[i] == 9) {

            } else {
                    continue;
                }
            tich *= number[i];
        }
        System.out.println("Tích của phần tử 2 4 9  :" + tich);

    }
}
//Thuộc tính là mô tả tính chất  của 1 đối tượng
//Phương thức là mô tả hah vi của đối tượng