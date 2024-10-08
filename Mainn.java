package Baitap;
import java.util.Scanner;
public class Mainn {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        // Tạo tài khoản ngân hàng
        System.out.print("Nhập số tài khoản: ");
        String soTaiKhoan = scanner.nextLine();
        System.out.print("Nhập tên chủ tài khoản: ");
        String chuTaiKhoan = scanner.nextLine();
        System.out.print("Nhập số dư ban đầu: ");
        double soDu = scanner.nextDouble();

        TaiKhoan taiKhoan = new TaiKhoan(soTaiKhoan, chuTaiKhoan, soDu);

        // Thực hiện các giao dịch
        while (true) {
            System.out.println("\n1. Gửi tiền");
            System.out.println("2. Rút tiền");
            System.out.println("3. Kiểm tra số dư");
            System.out.println("4. Thoát");
            System.out.print("Chọn một tùy chọn: ");
            int luaChon = scanner.nextInt();

            switch (luaChon) {
                case 1:
                    System.out.print("Nhập số tiền gửi: ");
                    double soTienGui = scanner.nextDouble();
                    taiKhoan.guiTien(soTienGui);
                    break;
                case 2:
                    System.out.print("Nhập số tiền rút: ");
                    double soTienRut = scanner.nextDouble();
                    taiKhoan.rutTien(soTienRut);
                    break;
                case 3:
                    System.out.println("Số dư hiện tại: " + taiKhoan.kiemTraSoDu());
                    break;
                case 4:
                    System.out.println("Thoát chương trình.");
                    return;
                default:
                    System.out.println("Lựa chọn không hợp lệ! Vui lòng thử lại.");
            }
        }
	}

}
