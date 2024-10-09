package Baitap;

public class main {

	public static void main(String[] args) {
        HinhChuNhat hcn = new HinhChuNhat(5, 3);
        System.out.println("Diện tích Hình chữ nhật: " + hcn.tinhDienTich() );
        System.out.println("Chu vi Hình chữ nhật: " + hcn.tinhChuVi());
	}
}
