
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

class LopSinhVien {
    private String maSinhVien;
    private String ten;
    private String ngaySinh;
    private double diemTrungBinh;

    public LopSinhVien(String maSinhVien, String ten, String ngaySinh, double diemTrungBinh) {
        this.maSinhVien = maSinhVien;
        this.ten = ten;
        this.ngaySinh = ngaySinh;
        this.diemTrungBinh = diemTrungBinh;
    }

    public static LopSinhVien nhapThongTin(Scanner sc) {
        System.out.print("Nhap ma sinh vien: ");
        String maSinhVien = sc.nextLine();

        System.out.print("Nhap ten sinh vien: ");
        String ten = sc.nextLine();

        System.out.print("Nhap ngay sinh  ");
        String ngaySinh = sc.nextLine();

        System.out.print("Nhap diem trung binh: ");
        double diemTrungBinh = sc.nextDouble();
        sc.nextLine();

        return new LopSinhVien(maSinhVien, ten, ngaySinh, diemTrungBinh);
    }

    public void inThongTin() {
        System.out.println("Ma SV: " + maSinhVien + " | Ten: " + ten + " | Ngay sinh: " + ngaySinh + " | diem TB: " + diemTrungBinh);
    }

    public double getDiemTrungBinh() {
        return diemTrungBinh;
    }

    public static void sapXepSinhVienTheoDiemTBGiamDan(ArrayList<LopSinhVien> danhSachSinhVien) {
        Collections.sort(danhSachSinhVien, new Comparator<LopSinhVien>() {
            @Override
            public int compare(LopSinhVien sv1, LopSinhVien sv2) {
                return Double.compare(sv2.getDiemTrungBinh(), sv1.getDiemTrungBinh());
            }
        });
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<LopSinhVien> danhSachSinhVien = new ArrayList<>();

        System.out.print("Nhap so luong sinh vien: ");
        int soLuongSinhVien = sc.nextInt();
        sc.nextLine(); // Clear buffer

        for (int i = 0; i < soLuongSinhVien; i++) {
            System.out.println("Nhap thong tin sinh vien thu " + (i + 1) + ":");
            danhSachSinhVien.add(LopSinhVien.nhapThongTin(sc));
        }

        LopSinhVien.sapXepSinhVienTheoDiemTBGiamDan(danhSachSinhVien);

        System.out.println("\nDanh sach sinh vien theo diem trung binh giam dan:");
        for (LopSinhVien sv : danhSachSinhVien) {
            sv.inThongTin();
        }

        sc.close();
    }
}
