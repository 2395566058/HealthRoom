package swim.gdkm.dao;

import java.util.Map;

import org.apache.ibatis.annotations.Param;

public interface RegisterDao {
	public boolean addRegisterByMap(@Param("map")Map map);
}