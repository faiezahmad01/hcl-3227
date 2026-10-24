package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ApplicationContext app = new AnnotationConfigApplicationContext(AppConfig.class);
        Employee e1 = app.getBean(Employee.class);
        e1.setFlatNo(301);
        e1.displayAddress();
    }
}