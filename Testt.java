package baitap2;
import java.util.ArrayList;
public class Testt {

	public static void main(String[] args) {
		ArrayList<sinhVien> dsSinhVien = new ArrayList<>();
        dsSinhVien.add(new sinhVien("SV001", "Nguyen Van A", "01/01/2000", 7.5));
        dsSinhVien.add(new sinhVien("SV002", "Le Thi B", "02/02/2001", 8.0));
        dsSinhVien.add(new sinhVien("SV003", "Tran Van C", "03/03/2000", 6.5));
        dsSinhVien.add(new sinhVien("SV004", "Huynh Thi A ", "03/04/2000", 9.7));
        
        // Sắp xếp danh sách sinh viên theo điểm trung bình giảm dần
        sinhVien.sapXepTheoDiem(dsSinhVien);
        
        // In thông tin sinh viên sau khi sắp xếp
        for (sinhVien sv : dsSinhVien) {
            sv.inThongTin();
            System.out.println();
        }
	}

}
