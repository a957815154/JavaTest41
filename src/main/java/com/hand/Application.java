package com.hand;

import com.hand.api.service.FilmService;
import com.hand.domain.entity.FilmE;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {


    public static void main(String[] args) throws InterruptedException {

        ApplicationContext applicationContext =
                new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
        System.out.println("Context Start");
        FilmService filmService = applicationContext.getBean(FilmService.class);
        FilmE filmE = new FilmE();
        System.out.println("Film Title:\r\n" + System.getenv("TITLE"));
        System.out.println("Film Description::\r\n" + System.getenv("DESCRIPTION"));
        System.out.println("Film LanguageId:\r\n" + System.getenv("LANGUAGEID"));

        filmE.setTitle(System.getenv("TITLE"));
        filmE.setDescription(System.getenv("DESCRIPTION"));
        filmE.setLanguage_id(Integer.parseInt(System.getenv("LANGUAGEID")));
        try {
            filmService.insertFilm(filmE);
        } catch (Exception e) {
            System.out.println(e);
        }
        try {
            filmService.insertFilm2(filmE);
        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println("Context Stop");
    }

    @Test
    public void test() {

        ApplicationContext applicationContext =
                new ClassPathXmlApplicationContext("classpath:applicationContext.xml");


    }
}
