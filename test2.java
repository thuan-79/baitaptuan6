package bai2;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.ArrayList;
public class test2 {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Nhập số lượng sinh viên: ");
	        int n = scanner.nextInt();

	        ArrayList<SinhVien> danhsach = new ArrayList<SinhVien>();
	        for (int i = 1; i <= n; i++) {
	            System.out.println("Nhập thông tin sinh viên thứ " +i+ ":");
	            SinhVien sv = new SinhVien();
	            sv.Nhap();
	            danhsach.add(sv);
	        }
	        
	        for (int i = 1; i < n; i++)
				for (int j = 2; j < n; j++) {
					if (danhsach.get(i).getDtb() > danhsach.get(j).getDtb()) {
						SinhVien k;
						k = danhsach.get(i);
						danhsach.set(i, danhsach.get(j));
						danhsach.set(j, k);
					}
				}
	        System.out.println("\nDanh sách sinh viên sau khi sắp xếp theo điểm trung bình:");
	        for (SinhVien sv : danhsach) {
	            sv.Xuat();
	            System.out.println("------------------------------");
	        }
	    }
	}