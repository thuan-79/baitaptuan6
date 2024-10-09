//.	Tạo lớp Hình chữ nhật:
//Tạo lớp HinhChuNhat với các thuộc tính: chiều dài, chiều rộng.
//Viết các phương thức tính diện tích, chu vi.
//Tạo đối tượng và in kết quả ra màn hình.
public class Bai1 {
    public class HinhChuNhat {
        private double dai;
        private double rong;

        public HinhChuNhat(double dai, double rong){
            this.dai=dai;
            this.rong=rong;
        }

        public double Dientich(){
            return dai*rong;
        }

        public double Chuvi(){
            return (dai+rong)*2;
        }
    }
    public static void main(String[] args) {
        Bai1 outer = new Bai1(); // gan doi tuong cua lop Bai1
        HinhChuNhat HCN = outer.new HinhChuNhat(4, 5);
        System.out.println("Chieu dai:" +4);
        System.out.println("Chieu rong:" +5);
        System.out.println("Dien tich hinh chu nhat la:" HCN.Dientich());
        System.out.println("Chu vi hinh chu nhat la:" HCN.Chuvi());
    }
}
