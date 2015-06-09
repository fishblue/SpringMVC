package season.maven.spring.AutowiringBean.Inject;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.NoSuchBeanDefinitionException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import season.maven.spring.AutowiringBean.Inject.BarInvocation;

public class TestBarInvocation {
	@Test
	public void TInvoke(){
		ApplicationContext ctx = null;
		BarInvocation bar = null;
		try{
			ctx = new ClassPathXmlApplicationContext("conf/spring-application.xml");
		}catch(BeansException e){
			Assert.assertTrue(false);
		}
		try{
			Assert.assertTrue(ctx != null);
			bar = (BarInvocation) ctx.getBean("barInvocation");
		}catch(NoSuchBeanDefinitionException e){
			Assert.assertTrue(false);
		}
		Assert.assertTrue(bar != null);
		bar.invoke();
		Assert.assertTrue(true);
	}
}
