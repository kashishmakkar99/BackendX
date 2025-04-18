package com.bigmakk.concepts;

import com.bigmakk.concepts.core.Car;
import com.bigmakk.concepts.core.Engine;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
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
        ApplicationContext context=new ClassPathXmlApplicationContext("config.xml");

        Car car=context.getBean("car",Car.class);
        car.start();
    }
}
