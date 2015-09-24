package net.frolova.core;

import net.frolova.api.JavaContactService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Frolova.A on 9/24/15.
 */
public class App {
    public static void main(String[] args) {

        ClassPathXmlApplicationContext context
                = new ClassPathXmlApplicationContext("applicationContext.xml");
        JavaContactService service = context.getBean(JavaContactService.class);

        System.out.println("Run");


        context.close();
    }
}
