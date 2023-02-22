package Bo_Tuc_Sinh_Vien_T4;

import java.util.Scanner;

public class BaiTap1 {

//    Bài 1
    public static void main(String[] args) {
        int numbers[];
        int size;
        int sum = 0;


        System.out.println( "Nhập kích thước của mảng ");
        Scanner sc = new Scanner(System.in);
        size = sc.nextInt();
        numbers = new int[size];


        for (int i = 0; i <numbers.length ; i++) {
            System.out.println( "Phần tử " +(i + 1)+" trong mảng là :");
            numbers [i] = sc.nextInt();

        }


//        for (int z = 0; z <numbers.length ; z++) {
//            System.out.println("Phần tử trong mảng là :" + numbers[z]);
//            numbers[z]= sc.nextInt();
//        }
        Duyetmangbangforeach(numbers );
        Timgiatrilonnhat(numbers);

//Bài 2
        for (int b : numbers
             ) {
            sum +=b;
        }
        System.out.println( "Tổng các phần tử nhập vào  "+sum);
    }


//Bài 3
    public static void Duyetmangbangforeach (int number []){
        for (int c:number
             ) {
            System.out.println("Phần tử trong mảng là " +c);
        }
    }


//Bài 4
    public static void Timgiatrilonnhat (int number []){
        int max = 0 ;
        for (int num :number
             ) {
           if (num > max){
               max = num ;
           }

        }
        System.out.println("Gía trị lớn nhất là " + max);
    }


}
