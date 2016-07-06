package objectdependencyinjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ObjectDependencyInjection {

    public static void main(String[] args) {
        
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        
        Triangle triangle = (Triangle)context.getBean("shape");
        triangle.draw();
        
    } // end MAIN method
    
} // end class ObjectDependencyInjection