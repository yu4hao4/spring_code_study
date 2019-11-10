package cn.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author 喻浩
 * @create 2019-11-10-12:33
 */
public class Test {
    public static void main(String[] args) {
        //init
        AnnotationConfigApplicationContext annotationConfigApplicationContext 
                 = new AnnotationConfigApplicationContext(Appconfig.class);
        System.out.println(annotationConfigApplicationContext.getBean(BeanTest.class));
    }
}
