import java.util.Scanner;
public class Bai2 {
    //•	Tạo lớp SinhVien với các thuộc tính: mã sinh viên, tên, ngày sinh, điểm trung bình.
    //•	Viết các phương thức nhập thông tin, in thông tin.
    //•	Sắp xếp danh sách sinh viên theo điểm trung bình giảm dần.
    public class Sinhvien {
        private String MaSv;
        private String Ten;
        private String NgSinh;
        private double DTB;

        public Sinhvien(String MaSv, String Ten, String NgSinh, double DTB) {
            this.MaSv = MaSv;
            this.Ten = Ten;
            this.NgSinh = NgSinh;
            this.DTB = DTB;
        }

        public void Nhap() {
            Scanner sc = new Scanner(System.in);
            System.out.println("Nhap ma sinh vien:");
            this.MaSv = sc.nextLine();
            System.out.println("Nhap ten:");
            this.Ten = sc.nextLine();
            System.out.println("Nhap ngay sinh:");
            this.NgSinh = sc.nextLine();
            System.out.println("Nhap diem trung binh:");
            this.DTB = sc.nextDouble();
        }

        public void In() {
            System.out.println("Ma sinh vien:" + MaSv);
            System.out.println("Ten:" + Ten);
            System.out.println("Ngay sinh:" + NgSinh);
            System.out.println("Diem trung binh:" + DTB);
        }

        public double getDiemTrungBinh() {
            return DTB;
        }
    }
    public static void main(String[] args) {
        Bai2_Tuan6 outer = new Bai2_Tuan6();
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số lượng sinh viên: ");
        int n = sc.nextInt();
        Sinhvien[] DSSV = new Sinhvien[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Nhap thong tin cho sinh vien thu " + (i + 1) + ":");
            DSSV[i] = outer.new Sinhvien("", "", "", 0.0); // Khởi tạo đối tượng SinhVien rỗng
            DSSV[i].Nhap();
        }
        for (int i = 0; i < n - 1; i++) {
            boolean DoiCho = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (DSSV[j].getDiemTrungBinh() < DSSV[j + 1].getDiemTrungBinh()) {
                    Sinhvien temp = DSSV[j];
                    DSSV[j] = DSSV[j + 1];
                    DSSV[j + 1] = temp;
                    DoiCho = true;
                }
            }
            if (!DoiCho)
                break;
        }
        System.out.println("\nDanh sách sinh viên sau khi sắp xếp theo điểm trung bình giảm dần:");
        for (Sinhvien sv : DSSV) {
                sv.In();
        }
    }
}



