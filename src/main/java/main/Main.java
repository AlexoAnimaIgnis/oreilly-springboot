package main;

import main.config.ProjectConfig;
import main.entities.Parrot;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main (String[] args) {

        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        Parrot p = context.getBean("koko", Parrot.class);
        System.out.println(p.getName());

        String s = context.getBean(String.class);
        System.out.println(s);

        Integer n = context.getBean(Integer.class);
        System.out.println(n);
    }
}
