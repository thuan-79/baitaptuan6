/*	Tạo lớp Tài khoản ngân hàng:
	Tạo lớp TaiKhoan với các thuộc tính: số tài khoản, chủ tài khoản, số dư.
	Viết các phương thức gửi tiền, rút tiền, kiểm tra số dư.
 */

import java.util.Scanner;
public class Bai3 {
    public class TaiKhoan {
        private String STK;
        private String ChuTK;
        private double SoDu;

        public TaiKhoan(String STK,String ChuTK,double SoDu){
            this.STK=STK;
            this.ChuTK=ChuTK;
            this.SoDu=SoDu;
        }

        public void Gui(double SoTien){
            if(SoTien >0){
                SoDu = SoDu + SoTien;
                System.out.println("So tien da gui la:"+SoTien);
            }
            else
                System.out.println("So tien gui cua ban phai lon hon 0 dong nha.");
        }

        public voi Rut(double SoTien){
            if(SoTien > 0 && SoTien<=SoDu){
                SoDu = SoDu - SoTien;
                System.out.println("So tien ban da rut la:" +SoTien);
            }
            else
                if(SoTien>SoDu)
                    System.out.println("Ban khong the rut tien vi so du khong du.");
                else 
                    System.out.println("So tien rut cua ban phai lon hon 0 dong nha.");
        }

        public void KiemTra(){
            System.out.println("So du hien tai cua ban la:" +SoDu);
        }

        public void InTT(){
            System.out.println("So tai khoan:"+STK);
            System.out.println("Chu tai khoan:"+ChuTK);
            System.out.println("So du hien tai:"+SoDu);
        }
    }

    public static void main(String[] args) {
        Bai3 outer = new Bai3(); // Gan doi tuong lop Bai3

        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao so tai khoan:");
        String STK = sc.nextLine;
        System.out.println("Nhap vao ten chu tai khoan:");
        String ChuTK = sc.nextLine;
        System.out.println("Nhap vao so du hien tai:");
        double SoDu = sc.nextDouble();

        TaiKhoan TKNH = outer.new TaiKhoan(STK, ChuTK, SoDu);
        TKNH.InTT();

        System.out.println("Nhap vao so tien ban muon gui:");
        double TienGui = sc.nextDouble();
        TKNH.Gui(TienGui);
        TKNH.KiemTra();

        System.out.println("Nhap vao tien ban muon rut:");
        double TienRut = sc.nextDouble();
        TKNH.Rut(TienRut);
        TKNH.KiemTra();
        
    }
}
