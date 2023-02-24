package Bo_Tuc_Sinh_Vien_T5;

public class Bai_Tap_3 {
    public static void main(String[] args) {
        int [] number = {4,2,42,45,3,5,3,5,};
        Timgiatrinhonhat(number);


    }

    public static int  Timgiatrinhonhat (int number []){
       int min = number[0];
        for (int i = 1; i <number.length ; i++) {
            if (number[i] < min){
                min = number[i];
            }
        }
        System.out.println(min);

        return min;
    }



}
