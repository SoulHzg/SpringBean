package spring.bean;

import org.springframework.stereotype.Component;

//自动组件装配，默认的名称为类名第一个字母小写
@Component(value="Carbean")
public class Car {

    private String pp;

    private String xh;

    private Long price;


    public Car() {
        System.out.println("Loading Car...");
    }

    @Override
    public String toString() {
        return "Car{" +
                "pp='" + pp + '\'' +
                ", xh='" + xh + '\'' +
                ", price=" + price +
                '}';
    }
}
