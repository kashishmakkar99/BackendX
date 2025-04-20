package com.bigmakk.concepts;

import com.bigmakk.concepts.config.Student;
import com.bigmakk.concepts.core.BeanContainer;
import com.bigmakk.concepts.core.Car;
import com.bigmakk.concepts.core.Engine;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

//   //   Car seltos=new Car("seltos");
//   //   seltos.start();
//
//        Engine engine=new Engine("ford");
//        Car seltos=new Car("seltos",engine);
//        seltos.start();
//test
        //xml based
        //ApplicationContext context=new ClassPathXmlApplicationContext("config.xml");

        //ammotationbased
        ApplicationContext context=new AnnotationConfigApplicationContext(BeanContainer.class);

        Car car=context.getBean("car",Car.class);
        car.start();

        Student st=context.getBean("setStudent",Student.class);
    }
}
