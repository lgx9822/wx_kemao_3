package lgx.gdkm.commons.processors;

import lgx.gdkm.commons.domain.event.EventInMessage;

public interface EventMessageProcessor {

	void onMessage(EventInMessage event);

}
