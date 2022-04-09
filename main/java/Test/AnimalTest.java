package Test;

import Classes.Cat;
import Classes.Color;
import Classes.ConfigClass;
import Classes.Dog;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AnimalTest {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx=new AnnotationConfigApplicationContext(ConfigClass.class);

        Cat c1= ctx.getBean(Cat.class);
        Color color = new Color();
        color.setBase_color("White");
        color.setTexture_color("Cream");
        c1.setCat_name("Jenny");
        c1.setBreed_name("Cat");
        c1.setOwner_name("Akshu");
        c1.setColor(color);
        c1.catDisplay();
        System.out.println("=========================");
        Dog d1=ctx.getBean(Dog.class);
        Color color1 = new Color();
        color1.setBase_color("Black");
        color1.setTexture_color("Golden");
        d1.setDog_name("Champ");
        d1.setBreed_name("German Shepherd");
        d1.setOwner_name("Akshu");
        d1.setColor(color1);
        d1.dogDisplay();
    }
}
