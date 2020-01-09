package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import bean.HoNUHBean;

public class HoNUHDao {
	DungChung dc = new DungChung();
	
	public ArrayList<HoNUHBean> getHoNUH() throws Exception {
		ArrayList<HoNUHBean> ds = new ArrayList<HoNUHBean>();		
		dc.KetNoi();
		String sql = "select * from HoNUH ORDER BY SoTien DESC";
		PreparedStatement cmd = dc.cn.prepareStatement(sql);
		ResultSet rs = cmd.executeQuery();
		while (rs.next()) {
			String maHoDan = rs.getString("MaHoDan");
			String hoTen = rs.getString("HoTenChuHo");
			String to = rs.getString("To");
			String khoiThon = rs.getString("KhoiHoacThon");
			boolean laHoNgheo = rs.getBoolean("LaHoNgheo");
			long soTien = rs.getLong("SoTien");
			HoNUHBean bean = new HoNUHBean(maHoDan, hoTen, to, khoiThon, laHoNgheo, soTien);
			ds.add(bean);
		}
		rs.close();
		dc.cn.close();
		return ds;
	}
}
