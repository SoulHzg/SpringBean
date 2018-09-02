package spring.bean;

import org.springframework.stereotype.Component;
import spring.bean.imp.CarImp;

@Component
public class Audi implements CarImp {
    @Override
    public void born() {
        System.out.println("In Audi born meathod...");
    }

    @Override
    public void sale() {
        System.out.println("In Audi sale meathod...");
    }
}
