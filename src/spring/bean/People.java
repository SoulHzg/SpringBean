package spring.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.stereotype.Component;
import spring.bean.imp.CarImp;

@Component
public class People {

    private String name;

    private String sex;

    private String age;

    //当IOC容器中不存在car的实例时，设置required=false，程序运行不会抛出异常。默认为true
    @Autowired(required = false)
    //当IOC容器中对引用的bean存在多个时，可用@Qualifier注解指定某个准确的bean
    @Qualifier("audi")
    private CarImp car;


    public CarImp getCar() {
        return car;
    }

    public People() {
        System.out.println("Loading people...");
    }

    @Override
    public String toString() {
        return "People{" +
                "name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", age='" + age + '\'' +
                ", car=" + car +
                '}';
    }
}
