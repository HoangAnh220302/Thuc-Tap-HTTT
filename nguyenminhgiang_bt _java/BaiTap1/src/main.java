import java.util.*;
public class main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		HinhVuong hv = new HinhVuong();
		HinhTron ht = new HinhTron();
		HinhChuNhat hcn = new HinhChuNhat();
		System.out.println("Nhap do dai canh hinh vuong: ");
		hv.canh = sc.nextFloat();
		System.out.println("Nhap do dai canh hinh tron: ");
		ht.r = sc.nextFloat();
		System.out.println("Nhap chieu dai hinh chu nhat: ");
		hcn.dai = sc.nextFloat();
		System.out.println("Nhap chieu rong hinh chu nhat: ");
		hcn.rong = sc.nextFloat();
		System.out.println("Chu vi hinh vuong: "+ hv.tinhCV());
		System.out.println("Chu vi hinh tron: "+ ht.tinhCV());
		System.out.println("Chu vi hinh chu nhat: "+ hcn.tinhCV());
		System.out.println("Dien tich hinh vuong: "+ hv.tinhDT());
		System.out.println("Dien tich hinh tron: "+ ht.tinhDT());
		System.out.println("Dien tich hinh chu nhat: "+ hcn.tinhDT());
		sc.close();
	}
}
