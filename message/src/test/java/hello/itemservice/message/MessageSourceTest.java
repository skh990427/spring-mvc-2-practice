package hello.itemservice.message;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.MessageSource;

@SpringBootTest
public class MessageSourceTest {

    @Autowired
    private MessageSource messageSource;


}
