package swim.gdkm;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("swim.gdkm.dao")
public class HealthRoomApplication {

	public static void main(String[] args) {
		SpringApplication.run(HealthRoomApplication.class, args);
	}

}
