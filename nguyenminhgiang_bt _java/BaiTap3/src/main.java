import java.util.*;
public class main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n,t;
		System.out.print("Nhap so luong nhan vien san xuat: ");
		n=sc.nextInt();
		System.out.print("Nhap so luong nhan vien van phong: ");
		t=sc.nextInt();
		NVSX[] sx = new NVSX[n];
		NVVP[] vp = new NVVP[t];
		System.out.println("----NHAN VIEN SAN XUAT----");
		for(int i =0;i<n;i++) {
			sx[i]= new NVSX();
			System.out.print("Nhap nam vao lam: ");
			sx[i].Nam= sc.nextInt();
			sx[i].HoTen = sc.nextLine();
			System.out.print("Nhap ho ten: ");
			sx[i].HoTen = sc.nextLine();
			System.out.print("Nhap so luong san pham: ");
			sx[i].setSanPham(sc.nextInt());
			sx[i].setLuong();
			sx[i].setPhuCap();
			System.out.println("__");
		}
		System.out.println("----NHAN VIEN VAN PHONG----");
		for(int i =0;i<t;i++) {
			vp[i]= new NVVP();
			System.out.print("Nhap nam vao lam: ");
			vp[i].Nam= sc.nextInt();
			vp[i].HoTen = sc.nextLine();
			System.out.print("Nhap ho ten: ");
			vp[i].HoTen = sc.nextLine();
			System.out.print("Nhap muc luong: ");
			vp[i].setMucLuong(sc.nextInt());
			System.out.print("Nhap so ngay nghi: ");
			vp[i].setNgayNghi(sc.nextInt());
			vp[i].setLuong();
			vp[i].setPhuCap();
			System.out.println("__");
		}
		System.out.println("----DANH SACH NHAN VIEN SAN XUAT-VAN PHONG----");
		System.out.println("Ho ten     "+"Nam vao lam      "+"Muc Luong     "+"Phu cap");
		for(int i=0;i<n;i++) {
			System.out.print(sx[i].HoTen+"     ");
			System.out.print(sx[i].Nam+"     ");
			System.out.print(sx[i].getLuong()+"     ");
			System.out.println(sx[i].getPhuCap()+"     ");
		}
		System.out.println("---------------");
		for(int i=0;i<t;i++) {
			System.out.print(vp[i].HoTen+"     ");
			System.out.print(vp[i].Nam+"     ");
			System.out.print(vp[i].getLuong()+"     ");
			System.out.println(vp[i].getPhuCap()+"     ");
		}
		sc.close();
	}
}
