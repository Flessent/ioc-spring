package Application;

import ILogic.ILogic;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ApplicationSpringXML {

    public static void main(String[] args) {

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("application.context.xml");

        ILogic ilogic = (ILogic) applicationContext.getBean("ILogic");

        System.out.println(ilogic.compute() );

    }
    }
