
public class NVVP extends NhanVien{
	private int MucLuong;
	private int NgayNghi;
	public void setLuong() {
		Luong = (MucLuong-NgayNghi)*10000;
	}
	public int getLuong(){
		return Luong;
	}
	public void setPhuCap() {
		PhuCap=100000+20000*(2023-Nam);
	}
	public int getPhuCap() {
		return PhuCap;
	}
	public void setMucLuong(int a) {
		MucLuong=a;
	}
	public void setNgayNghi(int a) {
		NgayNghi=a;
	}
}
