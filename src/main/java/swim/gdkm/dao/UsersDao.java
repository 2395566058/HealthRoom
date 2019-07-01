package swim.gdkm.dao;

import org.apache.ibatis.annotations.Param;

public interface UsersDao {
	public int existUser(@Param("username") String username, @Param("password") String password);
	
	public int getUseridByUsernameAndPassword(@Param("username") String username, @Param("password") String password);
}
