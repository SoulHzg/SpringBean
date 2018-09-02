package spring.bean;

import org.springframework.stereotype.Component;
import spring.bean.imp.CarImp;

@Component
public class Bmw implements CarImp {
    @Override
    public void born() {
        System.out.println("In Bmw born meathod...");
    }

    @Override
    public void sale() {
        System.out.println("In Bmw sale meathod...");
    }
}
