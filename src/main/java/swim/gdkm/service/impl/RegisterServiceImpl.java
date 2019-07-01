package swim.gdkm.service.impl;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import swim.gdkm.dao.RegisterDao;
import swim.gdkm.service.RegisterService;
@Service("registerService")
public class RegisterServiceImpl implements RegisterService{
	@Autowired
	private RegisterDao registerDao;
	@Override
	public boolean addRegisterByMap(Map map) {
		int result=registerDao.addRegisterByMap(map);
		if(result==1) {
			return true;
		}
		return false;
	}

}
