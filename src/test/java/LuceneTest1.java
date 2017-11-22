import com.wt.dao.BookDao;
import com.wt.dao.impl.BookDaoImpl;
import org.junit.Test;

/**
 * Created by Administrator on 2017/11/21.
 */
public class LuceneTest1 {
    @Test
    public void testDemo1(){
        BookDao dao = new BookDaoImpl();
        System.out.println(dao.getBookList());


    }

}
