package bean;

public class HoNUHBean {
	private String maHoDan;
	private String hoTen;
	private String to;
	private String khoiThon;
	private boolean laHoNgheo;
	private long soTien;
	public HoNUHBean(String maHoDan, String hoTen, String to, String khoiThon, boolean laHoNgheo, long soTien) {
		super();
		this.maHoDan = maHoDan;
		this.hoTen = hoTen;
		this.to = to;
		this.khoiThon = khoiThon;
		this.laHoNgheo = laHoNgheo;
		this.soTien = soTien;
	}
	public String getMaHoDan() {
		return maHoDan;
	}
	public void setMaHoDan(String maHoDan) {
		this.maHoDan = maHoDan;
	}
	public String getHoTen() {
		return hoTen;
	}
	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}
	public String getTo() {
		return to;
	}
	public void setTo(String to) {
		this.to = to;
	}
	public String getKhoiThon() {
		return khoiThon;
	}
	public void setKhoiThon(String khoiThon) {
		this.khoiThon = khoiThon;
	}
	public boolean isLaHoNgheo() {
		return laHoNgheo;
	}
	public void setLaHoNgheo(boolean laHoNgheo) {
		this.laHoNgheo = laHoNgheo;
	}
	public long getSoTien() {
		return soTien;
	}
	public void setSoTien(long soTien) {
		this.soTien = soTien;
	}
	
}
