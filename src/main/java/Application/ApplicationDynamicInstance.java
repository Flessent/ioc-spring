package Application;

import IDao.IDao;
import ILogic.ILogic;

import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Scanner;

public class ApplicationDynamicInstance {
    public static void main(String[] args) throws FileNotFoundException, ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {
Scanner scanner = new Scanner(new File("src/main/config.txt"));
// First class
String daoImplClassName=scanner.nextLine();
Class daoImpl =Class.forName(daoImplClassName); // create an object of the class having this name.
 IDao idao =(IDao) daoImpl.getDeclaredConstructor().newInstance();
 // second class
        String logicImplClassName=scanner.nextLine();
        Class logicImpl =Class.forName(logicImplClassName); // create an object of the class having this name.
        ILogic iLogic =(ILogic) logicImpl.getDeclaredConstructor().newInstance();
Method method= logicImpl.getMethod("setIdao",IDao.class);
method.invoke(iLogic, idao); // same like ilogic.setIdao(daoImpl);

        System.out.println(iLogic.compute());




    }
    }
