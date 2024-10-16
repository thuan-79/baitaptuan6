package baitap2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

class sinhVien {
    private String maSV;
    private String ten;
    private String ngaySinh;
    private double diemTrungBinh;

    // Constructor
    public sinhVien(String maSV, String ten, String ngaySinh, double diemTrungBinh) {
        this.maSV = maSV;
        this.ten = ten;
        this.ngaySinh = ngaySinh;
        this.diemTrungBinh = diemTrungBinh;
    }

    // Phương thức nhập thông tin
    public void nhapThongTin() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập mã sinh viên: ");
        this.maSV = scanner.nextLine();
        System.out.print("Nhập tên: ");
        this.ten = scanner.nextLine();
        System.out.print("Nhập ngày sinh (dd/MM/yyyy): ");
        this.ngaySinh = scanner.nextLine();
        System.out.print("Nhập điểm trung bình: ");
        this.diemTrungBinh = scanner.nextDouble();
        scanner.nextLine(); // Đọc dòng mới
    }

    // Phương thức in thông tin
    public void inThongTin() {
        System.out.printf("Mã SV: %s, Tên: %s, Ngày sinh: %s, Điểm TB: %.2f%n", maSV, ten, ngaySinh, diemTrungBinh);
    }

    // Getter cho điểm trung bình
    public double getDiemTrungBinh() {
        return diemTrungBinh;
    }

    // Phương thức sắp xếp danh sách sinh viên theo điểm trung bình giảm dần
    public static void sapXepTheoDiem(ArrayList<sinhVien> dsSinhVien) {
        Collections.sort(dsSinhVien, new Comparator<sinhVien>() {
            @Override
            public int compare(sinhVien sv1, sinhVien sv2) {
                return Double.compare(sv2.getDiemTrungBinh(), sv1.getDiemTrungBinh()); // Giảm dần
            }
        });
    }
}
