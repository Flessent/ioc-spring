package Application;

import ILogic.ILogic;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ApplicationSpringAnnotation {
public static  void main(String[] args){
    ApplicationContext applicationContext=
            new AnnotationConfigApplicationContext("DaoImpl","LogicImpl");

     ILogic iLogic= applicationContext.getBean(ILogic.class);
     System.out.println(iLogic.compute());

}

}
