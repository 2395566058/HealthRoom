package swim.gdkm.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import swim.gdkm.poji.Register;

public interface RegisterDao {
	public boolean addRegisterByMap(@Param("map")Map map);
	
	public List<Register> getRegister();
}