
public class NVSX extends NhanVien {
	private int SanPham;
	public void setLuong() {
		Luong = SanPham*10000;
	}
	public int getLuong() {
		return Luong; 
	}
	public void setPhuCap() {
		PhuCap=100000+20000*(2023-Nam);
	}
	public int getPhuCap() {
		return PhuCap;
	}
	public void setSanPham(int a) {
		SanPham=a;
	}
}
