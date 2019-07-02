package lgx.gdkm.weixin.library.service;

import lgx.gdkm.weixin.library.domain.Book;
import lgx.gdkm.weixin.library.domain.DebitList;
import org.springframework.data.domain.Page;

public interface LibraryService {

	Page<Book> search(String keyword, int pageNumber);

	void add(DebitList list, String bookId);

	void remove(DebitList list, String id);

}
