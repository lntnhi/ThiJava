package bo;

import java.util.ArrayList;

import bean.HoNUHBean;
import dao.HoNUHDao;

public class HoNUHBo {
	HoNUHDao dao = new HoNUHDao();
	
	public ArrayList<HoNUHBean> getHoNUH() throws Exception {
		return dao.getHoNUH();
	}
}
