package main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );
        Music musicBean = context.getBean("RockMusic", RockMusic.class);
        System.out.print(musicBean.getSong());
        context.close();
    }
}
