package swim.gdkm.utils;

import java.text.SimpleDateFormat;
import java.util.Date;

/*
 * 生成随机id
 */
public class GeneratID {
	/*
	 * 根据传入的时间表示格式，返回当前时间的格式 如果是yyyyMMdd，注意字母y不能大写。
	 *
	 * @param sformat yyyyMMddhhmmss
	 */
	private static String getDate(String sformat) {
		Date currentTime = new Date();
		SimpleDateFormat formatter = new SimpleDateFormat(sformat);
		String dateString = formatter.format(currentTime);
		return dateString;
	}

	private static String getRandomNum(int num) {
		String numStr = "";
		for (int i = 0; i < num; i++) {
			numStr += (int) (10 * (Math.random()));
		}
		return numStr;
	}

	/*
	 * 生成id
	 */
	public static Long getGeneratID() {
		String sformat = "MMddhhmmssSSS";
		int num = 3;
		String idStr = getDate(sformat) + getRandomNum(num);
		Long id = Long.valueOf(idStr);
		return id;
	}
}
