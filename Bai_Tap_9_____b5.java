package Bo_Tuc_Sinh_Vien_T3;

public class Bai_Tap_9_____b5 {
    public static void main(String[] args) {
      String chuoi [] = {"BMV","MEC","FORD","KIA","MAZDA"};
      Duyetmangfor(chuoi);
      Duyetmangforeachh(chuoi);
    }
    public static void Duyetmangfor (String chuoi []){
        System.out.println("Duyệt mảng bằng for");
        for (int i = 0; i <chuoi.length ; i++) {
            System.out.println(chuoi[i]);
        }
    }

    public static void Duyetmangforeachh ( String chuoi []){
        System.out.println("Duyệt mảng bằng foreach ");
        for (String a: chuoi
             ) {
            System.out.println(a);
        }
    }


}

