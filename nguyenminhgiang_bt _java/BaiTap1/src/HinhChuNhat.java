
public class HinhChuNhat extends HinhPhang {
	public float dai;
	public float rong;
	public float tinhCV() {
		return 2*(dai+rong);
	}
	public float tinhDT() {
		return dai*rong;
	}
}
