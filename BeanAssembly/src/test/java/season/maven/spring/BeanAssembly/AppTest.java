package season.maven.spring.BeanAssembly;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import season.maven.spring.BeanAssembly.bean.FooBean;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
    	ApplicationContext ctx = new ClassPathXmlApplicationContext("conf/spring-application.xml");
    	FooBean foo = (FooBean) ctx.getBean("fooBean");
    	foo.foo();
        assertTrue( true );
    }
}
