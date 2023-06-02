
public class KhachHangVN extends KhachHang{
	private float DinhMuc;
	private String DoiTuong;
	public void setDoiTuong(String a) {
		DoiTuong =a;
	}
	public void setDinhMuc(float a) {
		DinhMuc=a;
	}
	public float ThanhTien() {
		float temp;
		if(DinhMuc<SoLuong)
			temp= SoLuong*DonGia*DinhMuc+(SoLuong-DinhMuc)*DonGia*(float)2.5;
		else 
			temp=SoLuong*DonGia;
		return temp;
	}
}
