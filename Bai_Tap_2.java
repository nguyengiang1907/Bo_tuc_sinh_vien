package Bo_Tuc_Sinh_Vien_T5;

public class Bai_Tap_2 {
    public static void main(String[] args) {
        int [] number = { 1,2,6,3,2,4,5,};

        Daonguoc(number);
    }
    public static int Daonguoc (int number []){
        for (int i = number.length -1; i >= 0 ; i--) {
            System.out.println(number[i]);
        }
        return 0;
    }
}
