package lgx.gdkm.weixin.menu;

import lgx.gdkm.commons.EventListenerConfig;
import lgx.gdkm.commons.domain.event.EventInMessage;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("lgx.gdkm")
@EntityScan("lgx.gdkm")
public class SelfMenuApplication implements EventListenerConfig {

	public static void main(String[] args) {
		SpringApplication.run(SelfMenuApplication.class, args);
	}

	@Override
	public void handleEvent(EventInMessage event) {
		// 不处理事件，方法留空
	}
}
