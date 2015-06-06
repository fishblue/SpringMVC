package season.maven.spring.BeanAssembly;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import season.maven.spring.BeanAssembly.bean.FooBean;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext ctx = new ClassPathXmlApplicationContext("conf/spring-application.xml");
    	FooBean foo = (FooBean) ctx.getBean("fooBean");
    	foo.foo();
    }
}
