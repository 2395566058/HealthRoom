package swim.gdkm.service;

public interface UsersService {
	public boolean existUser(String username,String password);
	
	public int getUseridByUsernameAndPassword(String username,String password);
}