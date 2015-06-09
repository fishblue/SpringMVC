package season.spring.aop.execution;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.NoSuchBeanDefinitionException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import season.spring.aop.execution.Performer;


public class TestPerformer {
	@Test
	public void testPerform(){
		ApplicationContext ctx = null;
		Performer foo = null;
		try{
			ctx = new ClassPathXmlApplicationContext("spring-application.xml");
		}catch(BeansException e){
			e.printStackTrace();
			Assert.assertTrue(false);
		}
		try{
			Assert.assertTrue(ctx != null);
			foo = (Performer) ctx.getBean("performer");
		}catch(NoSuchBeanDefinitionException e){
			e.printStackTrace();
			Assert.assertTrue(false);
		}
		Assert.assertTrue(foo != null);
		foo.perform("呵呵");
		Assert.assertTrue(true);
	}
}
