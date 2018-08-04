package com.hand;

import com.hand.api.service.UserService;
import com.hand.domain.entity.UserE;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.File;

public class Application {


    public static void main(String[] args) {
       ApplicationContext applicationContext =
                new ClassPathXmlApplicationContext("classpath:applicationContext.xml");

       UserService bean = applicationContext.getBean(UserService.class);
        System.out.println(bean.toString());
        UserE userE =new UserE(2,"cc");

        UserE userE1 = bean.queryUser(1);
        System.out.println(userE1.toString());


    }

    @Test
    public void test() {
        File file = new File("a.txt");
        boolean exists = file.exists();
        System.out.println(exists);

    }
}
