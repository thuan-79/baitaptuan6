package Baitap;
import java.util.Scanner;
public class TaiKhoan {
	private String soTaiKhoan;
    private String chuTaiKhoan;
    private double soDu;

    // Constructor
    public TaiKhoan(String soTaiKhoan, String chuTaiKhoan, double soDu) {
        this.soTaiKhoan = soTaiKhoan;
        this.chuTaiKhoan = chuTaiKhoan;
        this.soDu = soDu;
    }

    // Phương thức gửi tiền
    public void guiTien(double soTien) {
        if (soTien > 0) {
            soDu += soTien;
            System.out.println("Gửi tiền thành công! Số dư hiện tại: " + soDu);
        } else {
            System.out.println("Số tiền gửi không hợp lệ!");
        }
    }

    // Phương thức rút tiền
    public void rutTien(double soTien) {
        if (soTien > 0 && soTien <= soDu) {
            soDu -= soTien;
            System.out.println("Rút tiền thành công! Số dư hiện tại: " + soDu);
        } else {
            System.out.println("Rút tiền không thành công! Kiểm tra số dư hoặc số tiền rút.");
        }
    }

    // Phương thức kiểm tra số dư
    public double kiemTraSoDu() {
        return soDu;
    }

    // Phương thức in thông tin tài khoản
    public void inThongTin() {
        System.out.println("Số tài khoản: " + soTaiKhoan);
        System.out.println("Chủ tài khoản: " + chuTaiKhoan);
        System.out.println("Số dư: " + soDu);
    }
}
