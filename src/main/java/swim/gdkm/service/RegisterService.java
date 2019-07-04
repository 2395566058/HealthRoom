package swim.gdkm.service;

import java.util.List;
import java.util.Map;

import swim.gdkm.poji.Register;

public interface RegisterService {
	public boolean addRegisterByMap(Map map);
	
	public List<Register> getRegister();
	
}
