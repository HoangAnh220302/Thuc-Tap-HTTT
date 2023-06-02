
public class KhachHang {
	protected String maKH;
	protected String HoTen;
	protected Ngay n = new Ngay();
	protected float SoLuong;
	protected float DonGia;
	public void setmaKH(String a) {
		maKH=a;
	}
	public void setHoTen(String a) {
		HoTen=a;
	}
	public void setSoLuong(float a) {
		SoLuong = a;
	}
	public void setDonGia(float a) {
		DonGia =a;
	}
	public void setNgay(int a, int b, int c) {
		n.ngay=a;
		n.thang=b;
		n.nam=c;
	}
}
