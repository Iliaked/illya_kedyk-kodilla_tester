package com.kodilla.spring.basic.spring_dependency_injection.homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootTest
public class ShippingCenterTestSuite {
    @Test
    public void shouldSendPackage() {

        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic");
        ShippingCenter bean = context.getBean(ShippingCenter.class);
        String value = bean.sendPackage("Stolarska 1", 20);
        Assertions.assertEquals("Package delivered to: Stolarska 1", value);
    }
    @Test
    public void shouldNotSendPackage() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic");
        ShippingCenter bean = context.getBean(ShippingCenter.class);
        String value = bean.sendPackage("Karmelicka 10", 70);
        Assertions.assertEquals("Package not delivered to: Karmelicka 10", value);
    }
}
