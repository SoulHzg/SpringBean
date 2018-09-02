package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import spring.bean.Car;
import spring.bean.People;
import spring.bean.imp.CarImp;

public class BeanTest {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        People people = applicationContext.getBean(People.class);
        System.out.println(people);
        CarImp car = people.getCar();
        car.born();
        car.sale();
    }
}
