package swim.gdkm.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import swim.gdkm.dao.UsersDao;
import swim.gdkm.service.UsersService;

@Service("usersService")
public class UsersServiceImpl implements UsersService {
	@Autowired
	private UsersDao usersDao;
	@Override
	public boolean existUser(String username,String password) {
		int result=usersDao.existUser(username, password);
		if(result==1) {
			return true;
		}
		return false;
	}
	@Override
	public int getUseridByUsernameAndPassword(String username, String password) {		
		return usersDao.getUseridByUsernameAndPassword(username, password);
	}

}
