package baitaptuan6;
import java.util.Scanner; 
public class HinhChuNhat {
    protected double chieuDai, chieuRong, chuVi, dienTich;
    Scanner scanner = new Scanner(System.in);
     
    public void nhap() {
        do {
            System.out.println("Nhập chiều dài hình chữ nhật: ");
            chieuDai = scanner.nextDouble();
            System.out.println("Nhập chiều rộng hình chữ nhật: ");
            chieuRong = scanner.nextDouble();
        } while (chieuDai < chieuRong);
    }
     
    public void hienThi(double dai, double rong) {
        System.out.println("Chiều dài và chiều rộng của hình chữ nhật lần lượt là "
                + chieuDai + " và " + chieuRong);
    }
     
    public double tinhChuVi(double dai, double rong) {
        chuVi = (dai + rong) * 2;
        return chuVi;
    }
     
    public double tinhDienTich(double dai, double rong) {
        dienTich = dai * rong;
        return dienTich;
    }
     
    public void hienThiChuViVaDienTich(double cv, double dt) {
        System.out.println("Chu vi hình chữ nhật = " + cv);
        System.out.println("Diện tích hình chữ nhật = " + dt);
    }
}

