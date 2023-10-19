package prsentation;

import metier.IMetier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class PresAnnotation {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext("vwc","metier");
        IMetier metier = context.getBean(IMetier.class);
        System.out.println("Res="+metier.calcul());
    }
}
