package baitaptuan6;
import java.util.Scanner; 
public class main { 
    public static void main(String[] args) {
        HinhChuNhat hinhChuNhat = new HinhChuNhat();
         
        // nhập chiều dài và chiều rộng hình chữ nhật
        hinhChuNhat.nhap();
         
        // hiển thị chiều dài và chiều rộng
        hinhChuNhat.hienThi(hinhChuNhat.chieuDai, hinhChuNhat.chieuRong);
         
        // tính chu vi và diện tích
        double chuVi = hinhChuNhat.tinhChuVi(hinhChuNhat.chieuDai, hinhChuNhat.chieuRong);
        double dienTich = hinhChuNhat.tinhDienTich(hinhChuNhat.chieuDai, hinhChuNhat.chieuRong);
         
        // hiển thị chu vi và diện tích
        hinhChuNhat.hienThiChuViVaDienTich(chuVi, dienTich);
    }
 
}