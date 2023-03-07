package Bo_Tuc_Sinh_Vien_T8;

import java.util.Scanner;

public class Bai_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập chiều rộng :");
        double width = sc.nextDouble();
        System.out.print("Nhập chiều rộng :");
        double height = sc.nextDouble();

        Bai_1_lop_hinh_chu_nhat HCN = new Bai_1_lop_hinh_chu_nhat(width,height);

        System.out.println("Diện tích của hình chữ nhật : " + HCN.RectangularArea());
        System.out.println("Chu vi của hình chữ nhật : " + HCN.Perimeter_of_a_rectangle());

    }

    public static class Bai_1_lop_hinh_chu_nhat {
        double width , height;

        public Bai_1_lop_hinh_chu_nhat (double width , double height){
            this.width=width;
            this.height=height;
        }
        public double RectangularArea (){ double Acreage = this.width * this.height; return  Acreage;}
        public double Perimeter_of_a_rectangle (){double Perimeter = (this.width + this.height) * 2; return Perimeter;}

    }
}
