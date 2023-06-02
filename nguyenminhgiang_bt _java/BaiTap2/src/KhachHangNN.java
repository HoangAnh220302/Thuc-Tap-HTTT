
public class KhachHangNN extends KhachHang{
	private String QuocTich;
	public void setQuocTich(String a) {
		QuocTich=a;
	}
	public float ThanhTien() {
		float temp;
		temp=SoLuong*DonGia;
		return temp;
	}
}
