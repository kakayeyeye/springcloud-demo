import com.springcloud.Payment8001;
import com.springcloud.dao.PaymentDao;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest(classes = Payment8001.class, webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@RunWith(SpringRunner.class)
public class mybatisplusTest {

    @Autowired
    PaymentDao paymentDao;

    @Test
    public void test(){
        System.out.println(("----- selectAll method test ------"));
        System.out.println(paymentDao.selectById(1));
    }
}
