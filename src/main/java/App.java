import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean =
                (HelloWorld) applicationContext.getBean("helloworld");

        Cat bean3 = applicationContext.getBean(Cat.class);
        Cat bean4 = applicationContext.getBean(Cat.class);
        System.out.println(bean3 == bean4);
    }
}