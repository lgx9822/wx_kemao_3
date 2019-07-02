package lgx.gdkm.weixin;

import lgx.gdkm.commons.EventListenerConfig;
import lgx.gdkm.commons.domain.InMessage;
import lgx.gdkm.commons.domain.event.EventInMessage;
import lgx.gdkm.commons.service.JsonRedisSerializer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.util.xml.StaxUtils;

import com.fasterxml.jackson.dataformat.xml.XmlMapper;

@SpringBootApplication
public class WeixinApplication implements EventListenerConfig {

	@Bean()
	public XmlMapper xmlMapper() {
		XmlMapper mapper = new XmlMapper(StaxUtils.createDefensiveInputFactory());
		return mapper;
	}

	public static void main(String[] args) {
		SpringApplication.run(WeixinApplication.class, args);
	}

	@Override
	public void handleEvent(EventInMessage event) {
		// 不需要处理事件，所以方法留空即可
	}
}
