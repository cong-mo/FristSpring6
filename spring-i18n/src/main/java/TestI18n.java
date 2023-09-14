import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Date;
import java.util.Locale;

public class TestI18n {

    @Test
    public void t_test(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        String str=context.getMessage("ch", null, Locale.CHINA);
        System.out.println(str);
    }

}
