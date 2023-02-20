package Bo_Tuc_Sinh_Vien_T2;

import java.util.Scanner;

public class Baitap7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Mời nhập số :");
        int i = 2;
        int number = sc.nextInt();
        if (number < 2 ){
            System.out.println("Không phải là số nguyên tố ");
        }

        boolean check = true;
        while (i <= Math.sqrt(number)){
            if (number % i == 0){
                check =false;
                break;
            }
            i+=2;
        }
        if (check ){
            System.out.println("là số nguyên tố ");
        }else {
            System.out.println("Không phải là số nguyên tố ");
        }

    }
}
