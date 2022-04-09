package Test;


import Classes.Cars;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CarTest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Cars c1=(Cars)context.getBean("carbean");
        c1.display();
    }
}
