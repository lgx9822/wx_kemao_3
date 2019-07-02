package lgx.gdkm.weixin.menu.service;

import lgx.gdkm.weixin.menu.domain.SelfMenu;

public interface SelfMenuService {

	SelfMenu findMenus();

	void save(SelfMenu menu);

}
