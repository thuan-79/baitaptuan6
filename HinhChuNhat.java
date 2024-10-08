package Baitap;
import java.util.Scanner;
public class HinhChuNhat {
	    private double chieuDai;
	    private double chieuRong;

	    // Constructor
	    public HinhChuNhat(double chieuDai, double chieuRong) {
	        this.chieuDai = chieuDai;
	        this.chieuRong = chieuRong;
	    }

	    // Phương thức tính diện tích
	    public double tinhDienTich() {
	        return chieuDai * chieuRong;
	    }

	    // Phương thức tính chu vi
	    public double tinhChuVi() {
	        return 2 * (chieuDai + chieuRong);
	    }
}
	        
