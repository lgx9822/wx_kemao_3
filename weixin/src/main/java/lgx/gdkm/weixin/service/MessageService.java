package lgx.gdkm.weixin.service;

import lgx.gdkm.commons.domain.InMessage;
import lgx.gdkm.commons.domain.OutMessage;

public interface MessageService {

	OutMessage onMessage(InMessage msg);
}
