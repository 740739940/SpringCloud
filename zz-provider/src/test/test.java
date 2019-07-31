import com.zz.ScServerApplication;
import com.zz.module.user.pojo.User;
import com.zz.module.user.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;


/**
 * @Description:
 * @Author: zhangzhao
 * @Date: 2019-07-26 16:34
 **/
@RunWith(SpringJUnit4ClassRunner.class) // SpringJUnit支持，由此引入Spring-Test框架支持！
@SpringBootTest(classes = ScServerApplication.class)
@WebAppConfiguration
public class test {

    @Autowired
    UserService userService;

    @Test
    public void x() {
        User user = userService.getById(4L);
        System.out.println(user.toString());
    }

}