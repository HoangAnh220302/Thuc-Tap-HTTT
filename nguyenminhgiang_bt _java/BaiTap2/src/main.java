import java.util.*;
public class main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		KhachHangVN kv = new KhachHangVN();
		KhachHangNN kn = new KhachHangNN();
		System.out.println("KHACH HANG VIET NAM");
		System.out.print("Nhap ma khach hang: ");
		kv.setmaKH(sc.nextLine());
		System.out.print("Nhap ho ten khach hang: ");
		kv.setHoTen(sc.nextLine());
		System.out.print("Nhap ngay ra hoa don: ");
		kv.setNgay(sc.nextInt(),sc.nextInt(),sc.nextInt());
		System.out.print("Nhap doi tuong: ");
		kv.setDoiTuong(sc.nextLine());
		System.out.print("Nhap so luong: ");
		kv.setSoLuong(sc.nextFloat());
		System.out.print("Nhap don gia: ");
		kv.setDonGia(sc.nextFloat());
		System.out.print("Nhap dinh muc: ");
		kv.setDinhMuc(sc.nextFloat());
		System.out.println("KHACH HANG NUOC NGOAI");
		System.out.print("Nhap ma khach hang: ");
		kn.setmaKH(sc.nextLine());
		System.out.print("Nhap ho ten khach hang: ");
		kn.setHoTen(sc.nextLine());
		System.out.print("Nhap ngay ra hoa don: ");
		kn.setNgay(sc.nextInt(),sc.nextInt(),sc.nextInt());
		System.out.print("Nhap so luong: ");
		kn.setSoLuong(sc.nextFloat());
		System.out.print("Nhap don gia: ");
		kn.setDonGia(sc.nextFloat());
		System.out.print("Nhap quoc tich: ");
		kn.setQuocTich(sc.nextLine());
		System.out.println("----IN HOA DON----");
		System.out.println("Hoa don khach Viet Nam- Ngay:"+ kv.n+"Thanh Tien: "+kv.ThanhTien());
		System.out.println("Hoa don khach nuoc ngoai- Ngay:"+ kn.n+"Thanh Tien: "+kn.ThanhTien());
		sc.close();
	}
}
